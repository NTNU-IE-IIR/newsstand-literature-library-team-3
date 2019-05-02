package Exception;

/**
 * Exception thrown when the user forces the ongoing process to stop.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public class UserInterruptException extends Exception
{
    /**
     * Constructor of the user interrupt exception.
     */
    public UserInterruptException()
    {
        super();
    }

     /**
     * Returns a string containing information telling the user
     * why the operation was interrupted / cancelled.
     *
     * @return message The message telling the user why the
     *                 operation was interrupted / cancelled.
     */
    @Override
    public String toString()
    {
        String message = "The operation was cancelled by the user.";

        return message;
    }
}
