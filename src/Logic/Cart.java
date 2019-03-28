package Logic;

import java.util.ArrayList;



public class Cart
{
    private int totalPrice = 0;
    private ArrayList<Literature> cart;

    public Cart ()
    {
        cart = new ArrayList<>();
    }

    public void addToCart(Literature literatureToAdd)
    {
        cart.add(literatureToAdd);
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
        for(Literature literature : cart)
        {
            String thisLiterature = literature.getAllInfoAsString();
            itemsInCart = itemsInCart + thisLiterature + "\n";
        }
        return itemsInCart;
    }

}
