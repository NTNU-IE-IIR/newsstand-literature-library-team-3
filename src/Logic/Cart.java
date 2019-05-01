package Logic;
import UI.Viewer;

import java.util.ArrayList;
import java.util.Iterator;

/**
* Represents the cart with product the costumer wants to buy. Uses Arraylist to hold the products
* and to give the total price, and list up the content in cart.
*
* @author Erlend Holseker, Arvin Khodabandeh, Isak Gamnes Sneltvedt
* @version 0.2 (2019.04.03)
* */

public class Cart
{
    private int totalPrice = 0;
    private ArrayList<SalesItem> cart;

    public Cart ()
    {
        cart = new ArrayList<>();
    }


/**
 * Adds a product to the cart and
 * */
    public void addToCart(SalesItem literatureToAdd)
    {
        if(literatureToAdd.getQuantityInStock() < 1)
        {
            System.out.println("We are currently out of stock.");
        }
        else
        {
            updateTotalPricePlus(literatureToAdd);
            literatureToAdd.reduceQuantityByOne();
            cart.add(literatureToAdd);
        }
    }

    public void removeFromCart(SalesItem literatureToRemove)
    {
        updateTotalPriceMinus(literatureToRemove);
        literatureToRemove.increaseQuantityByOne();
        cart.remove(literatureToRemove);
    }

    private void updateTotalPricePlus(SalesItem priceObject)
    {
        int price = priceObject.getPrice();
        this.totalPrice = totalPrice + price;
    }

    private void updateTotalPriceMinus(SalesItem priceObject)
    {
        int price = priceObject.getPrice();
        this.totalPrice = totalPrice - price;
    }

    public int getTotalPrice()
    {
        int price = 0;
        for (SalesItem literature : cart)
        {
            int priceForThisLiterature = literature.getPrice();
            price = price + priceForThisLiterature;
        }
        return price;
    }

    public String showCart()
    {
        String itemsInCart = "";

        if(cart.isEmpty())
        {
            itemsInCart = "No items in cart.";
        }

        for(SalesItem salesItem : cart)
        {
                Viewer itemView = new Viewer();
                String itemInfo = itemView.createViewer(salesItem).showLimited();
                String thisItem = itemInfo + "\n";
                itemsInCart = itemsInCart + thisItem + "\n";
        }

        return itemsInCart;
    }

    public void addDummiesToCart()
    {
        Newspaper testNewspaper2 = new Newspaper("Katastrofe", "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52, "01.01.2019");
        Newspaper testNewspaper3 = new Newspaper("Det kunne gått bedre", "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52, "05.03.2019");
        Newspaper testNewspaper = new Newspaper("Ingen trodde dette kunne skje", "Aftenposten", "2018",
                "Norsk", "Nyheter", 35, 10, 52, "13.01.2018");
        cart.add(testNewspaper);
        cart.add(testNewspaper2);
        cart.add(testNewspaper3);
    }

    public void checkOut()
    {
        if(cart.isEmpty())
        {
            System.out.println("No have no items in your cart.");
        }
        Iterator<SalesItem> it = cart.iterator();
        while(it.hasNext())
        {
            SalesItem nextItem = it.next();
            it.remove();
        }
    }

    public int getSize()
    {
        return cart.size();
    }

    public SalesItem searchByTitle(String searchTitle)
    {
        SalesItem returnString = null;
        for (SalesItem literature : cart)
        {
            if(literature.getTitle().equals(searchTitle))
            {
                returnString = literature;
            }
        }
        if(returnString.equals(null))
        {
            System.out.println("No items matching your search.");
        }
        return returnString;
    }
}
