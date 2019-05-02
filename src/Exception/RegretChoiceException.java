package Exception;

/**
 * Exception thrown when the user has tried to stop an operation,
 * but regrets it.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version v0.2 (2019.05.02)
 */
public class RegretChoiceException extends Exception
{

    /**
     * Constructor of the regret choice exception.
     */
    public RegretChoiceException()
    {
        super();
    }

    /**
     * Returns a string containing information telling the user
     * to try again.
     *
     * @return message The message telling the user to try again.
     */
    @Override
    public String toString()
    {
        String message = "OK, please try again.";

        return message;
    }
}
