package Logic;

public abstract class SalesItem
{
    private int price;
    private int quantityInStock;

    public SalesItem(int price, int quantityInStock)
    {
        setPrice(price);
        setQuantityInStock(quantityInStock);
    }

    /**
     * Sets the price of the the given salesitem.
     * If the input is empty, the price will
     * be set to 0.
     *
     * @param newPrice The price of the given salesitem.
     */
    protected void setPrice(int newPrice)
    {
        this.price = setInt(newPrice);
    }

    /**
     * Sets the amount of the the given salesitem in stock.
     * If the input is empty, the amount will
     * be set to 0.
     *
     * @param quantityInStock The amount of the given literature in stock.
     */
    protected void setQuantityInStock(int quantityInStock)
    {
        this.quantityInStock = setInt(quantityInStock);
    }

    /**
     * Reduces the current quantity of a specific salesitem by one.
     */
    protected void reduceQuantityByOne()
    {
        if (this.quantityInStock < 0)
        {
            this.quantityInStock--;
        }
    }

    /**
     * Used by all set-methods requiring datatype int,
     * in this class and all sub-classes.
     * The method returns an int. If the input is less or equal to 0,
     * it will return an int equal to 0. If not,
     * it will return an int equal to the input.
     *
     * @param input The input from the set-method calling on this method.
     * @return The int to be set in the field.
     */
    protected int setInt(int input)
    {
        int returnInt = 0;

        if (input >= 0)
        {
            returnInt = input;
        }
        return returnInt;
    }
    public abstract String getTitle();

    /**
     * Returns the price of the given salesitem.
     *
     * @return price An int representing the price of the given salesitem, in NOK (Norwegian kroner).
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Returns the amount of the given salesitem in stock.
     *
     * @return quantityInStock An int representing the amount of the given salesitem in stock.
     */
    public int getQuantityInStock()
    {
        return quantityInStock;
    }



    protected String setString(String input)
    {
        String returnString = "UNDEFINED";

        if (input != null)
        {
            if (!input.isEmpty())
            {
                returnString = input;
            }
        }
        return returnString;
    }
}
