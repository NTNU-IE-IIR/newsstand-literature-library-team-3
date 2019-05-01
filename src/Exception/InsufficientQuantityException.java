package Exception;

/**
 * Capture a quantity number that is higher than the quantity of a given sales item.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version 0.2 (2019.05.01)
 */

public class InsufficientQuantityException extends Exception
{
    private final int insufficientQuantity;   //The quantity which is too high.
    private final int availableQuantity;      //The quantity which is available.

    /**
     * Constructor of the insufficient quantity exception.
     * Stores the details in error.
     *
     * @param insufficientQuantity  The quantity which is too high.
     * @param availableQuantity     The quantity which is available.
     */
    public InsufficientQuantityException(int insufficientQuantity, int availableQuantity)
    {
        this.insufficientQuantity = insufficientQuantity;
        this.availableQuantity = availableQuantity;
    }

    /**
     * Returns the insufficient quantity.
     * @return The insufficient quantity.
     */
    public int getInsufficientQuantity()
    {
        return this.insufficientQuantity;
    }

    /**
     * Returns a diagnostic string containing information about the quantity which was tried to be
     * accessed, and the quantity which is available.
     *
     * @return A diagnostic string containing information about the insufficient quantity,
     *         and the available quantity.
     */
    @Override
    public String toString()
    {
        String message = "The quantity you want to access is higher than what is available. " + "\n" +
                        "The quantity which was tried to be accessed was: " + getInsufficientQuantity() + "\n" +
                        "The quantity which is available is: " + this.availableQuantity;

        return message;
    }
}
