package Logic;
import UI.Viewer;

import java.util.ArrayList;
import java.util.Iterator;

import Exception.InsufficientQuantityException;

/**
* Represents the cart with product the costumer wants to buy. Uses Arraylist to hold the products
* and to give the total price, and list up the content in cart.
*
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
* */

public class Cart
{
    private int totalPrice = 0;
    private ArrayList<SalesItem> cart;

    /**
     * Constructor of the shopping cart.
     * Uses an ArrayList to hold all objects the user wants to buy.
     */
    public Cart ()
    {
        cart = new ArrayList<>();
    }

    /**
     * Adds a sales item to the shopping cart, and updates the total price
     * of the cart.
     *
     * @param literatureToAdd The literature the user wants to buy.
     * @throws InsufficientQuantityException If the quantity of the literature is 0.
     */
    public void addToCart(SalesItem literatureToAdd) throws InsufficientQuantityException
    {
        if(literatureToAdd.getQuantityInStock() < 1)
        {
            throw new InsufficientQuantityException(0, 0);
        }
        else
        {
            updateTotalPricePlus(literatureToAdd);
            literatureToAdd.reduceQuantityByOne();
            cart.add(literatureToAdd);
        }
    }

    /**
     * Removes an item from the shopping cart.
     *
     * @param literatureToRemove The item to be removed from the shopping cart.
     */
    public void removeFromCart(SalesItem literatureToRemove)
    {
        updateTotalPriceMinus(literatureToRemove);
        literatureToRemove.increaseQuantityByOne();
        cart.remove(literatureToRemove);
    }

    /**
     * Updates the total price of the shopping cart by
     * adding the price of the latest added item to the total price.
     *
     * @param priceObject The price of the item that was last added to the cart.
     */
    private void updateTotalPricePlus(SalesItem priceObject)
    {
        int price = priceObject.getPrice();
        this.totalPrice = totalPrice + price;
    }

    /**
     * Updates the total price of the shopping cart by
     * subtracting the price of the latest removed item from the total price.
     *
     * @param priceObject The price of the item that was last removed from the cart.
     */
    private void updateTotalPriceMinus(SalesItem priceObject)
    {
        int price = priceObject.getPrice();
        this.totalPrice = totalPrice - price;
    }

    /**
     * Returns the total price of the shopping cart.
     *
     * @return The total price of the shopping cart.
     */
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

    /**
     * Returns a string containing information about
     * the items in the shopping cart.
     *
     * @return A string containing information about
     *         the items in the shopping cart.
     */
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

    /**
     * Removes all items in the shopping cart.
     */
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

    /**
     * Returns the amount of items in the shopping cart.
     *
     * @return The amount of items in the shopping cart.
     */
    public int getSize()
    {
        return cart.size();
    }

    /**
     * Searches for a specific sales item in the shopping cart
     * by using its title.
     *
     * @param searchTitle The title of the sales item which is to be found.
     * @return The item which is to be found. If it is not found, null will be returned.
     */
    public SalesItem searchByTitle(String searchTitle)
    {
        SalesItem returnItem = null;
        for (SalesItem literature : cart)
        {
            if(literature.getTitle().equals(searchTitle))
            {
                returnItem = literature;
            }
        }
        if(returnItem.equals(null))
        {
            System.out.println("No items matching your search.");
        }
        return returnItem;
    }
}
