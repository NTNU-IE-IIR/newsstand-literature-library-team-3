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
    private ArrayList<Literature> cart;

    public Cart ()
    {
        cart = new ArrayList<>();
    }


/**
 * Adds a product to the cart and
 * */
    public void addToCart(Literature literatureToAdd)
    {
        updateTotalPricePlus(literatureToAdd);
        cart.add(literatureToAdd);
    }

    public void removeFromCart(Literature literatureToRemove)
    {
        updateTotalPriceMinus(literatureToRemove);
        cart.remove(literatureToRemove);
    }

    private void updateTotalPricePlus(Literature priceObject)
    {
        int price = priceObject.getPrice();
        this.totalPrice = totalPrice + price;
    }

    private void updateTotalPriceMinus(Literature priceObject)
    {
        int price = priceObject.getPrice();
        this.totalPrice = totalPrice - price;
    }

    public int getTotalPrice()
    {
        int price = 0;
        for (Literature literature : cart)
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

        for(Literature literature : cart)
        {
            Viewer litView = new Viewer();
            String litInfo = litView.createViewer(literature).showLimited();
            String thisLiterature = litInfo + "\n";
            itemsInCart = itemsInCart + thisLiterature + "\n";
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
        Iterator<Literature> it = cart.iterator();
        while(it.hasNext())
        {
            Literature nextItem = it.next();
            nextItem.reduceQuantityByOne();
            it.remove();
        }
    }

    public int getSize()
    {
        return cart.size();
    }

    public Literature searchByTitle(String searchTitle)
    {
        Literature returnString = null;
        for (Literature literature : cart)
        {
            if(literature.getTitle().equals(searchTitle))
            {
                returnString = literature;
            }
        }
        return returnString;
    }

}
