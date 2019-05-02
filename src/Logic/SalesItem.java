package Logic;

import java.util.InputMismatchException;

/**
 * A sales item is an item that can be sold in a store. All sellable item-classes, such as inherits from this class.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public abstract class SalesItem
{
    private int price;
    private int quantityInStock;

    /**
     * Constructor of the SalesItem-class.
     *
     * @param price The price of the sales item.
     * @param quantityInStock The quantity of this sales item in stock.
     */
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
    public void reduceQuantityByOne()
    {
        if (this.quantityInStock > 0)
        {
            this.quantityInStock--;
        }
    }

    /**
     * Increases the current quantity of a specific salesitem by one.
     */
    public void increaseQuantityByOne()
    {
        this.quantityInStock++;
    }

    /**
     * Used by all set-methods requiring datatype int,
     * in this class and all sub-classes.
     * The method returns an int. If the input is less than 0,
     * an InputMismatchException will be thrown. If not,
     * it will return an int equal to the input.
     *
     * @param input The input from the set-method calling on this method.
     * @return The int to be set in the field.
     * @throws InputMismatchException if the input is lower than 0.
     */
    protected int setInt(int input)
    {
        int returnInt;

        if (input < 0)
        {
            throw new InputMismatchException("ERROR: Input was lower than 0.");
        }
        else
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

    /**
     * Used by all set-methods requiring datatype String
     * in this class and all sub-classes.
     * The method returns a String. If the input is empty or null,
     * it will throw an InputMismatchException with an error-message.
     * If not, the return String will be equal to the input.
     *
     * @param input The input from the set-method calling on this method.
     * @return The String to be set in the field.
     * @throws InputMismatchException if the input is empty or null.
     */
    protected String setString(String input)
    {
        String returnString;

        if (input == null || input.isEmpty())
        {
            throw new InputMismatchException("ERROR: Input was invalid.");
        }
        else
        {
            returnString = input;
        }
        return returnString;
    }
}
