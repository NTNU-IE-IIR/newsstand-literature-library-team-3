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

    public void removeFromCart(Literature literatureToRemove)
    {
        cart.remove(literatureToRemove);
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
        String itemsInCart = null;

        if(cart.isEmpty())
        {
            itemsInCart = "No items in cart.";
        }

        for(Literature literature : cart)
        {
            String thisLiterature = literature.getAllInfoAsString() + "\n";
            itemsInCart = itemsInCart + thisLiterature + "\n";
        }

        return itemsInCart;
    }

    public void addDummiesToCart()
    {
        Newspaper testNewspaper2 = new Newspaper("Katastrofe", "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52);
        Newspaper testNewspaper3 = new Newspaper("Det kunne gått bedre", "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52);
        Newspaper testNewspaper = new Newspaper("Ingen trodde dette kunne skje", "Aftenposten", "2018",
                "Norsk", "Nyheter", 35, 10, 52);
        cart.add(testNewspaper);
        cart.add(testNewspaper2);
        cart.add(testNewspaper3);
    }





}
