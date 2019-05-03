package UI;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.UserInterruptException;
import Exception.RegretChoiceException;

/**
 * Handles all input from the user. Checks if the input is valid
 * and if the user wants to about a process.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public class UserInput
{
    private Scanner userInput;

    /**
     * Constructor of the UserInput.
     * Uses the Scanner to read the input from the user.
     */
    public UserInput()
    {
        this.userInput = new Scanner(System.in);
    }

    /**
     * Reads the input from the user, trims it by removing blank
     * space before and after the input, and returns it.
     *
     * @return The input from the user
     */
    private String readInput()
    {
        return this.userInput.nextLine().trim();
    }

    /**
     * Reads and converts the user input to an int. Takes in a parameter
     * which determines the lowest value that can be returned.
     *
     * @return a positive integer value from the user.
     * @param minValue The minimum value that can be returned.
     * @throws UserInterruptException if the user wants to quit.
     * @throws RegretChoiceException  if the user regrets that he
     *                                or she wanted to quit.
     * @throws NumberFormatException  if the user input is not an integer.
     */
    public int asInteger(int minValue) throws UserInterruptException, RegretChoiceException
    {
        int returnValue = -1;
        boolean completed = false;
        while (!completed)
        {
            System.out.println("Type '/cancel' to abort.");
            String input = readInput();
            if (input.equals("/cancel"))
            {
                choose();
            } else if (input.isEmpty())
            {
                throw new InputMismatchException();
            } else
            {
                returnValue = Integer.parseInt(input);

                if (returnValue < minValue)
                {
                    throw new InputMismatchException("ERROR: The number must minimum be " + minValue + ".");
                } else
                {
                    completed = true;
                }
            }
        }
        return returnValue;
    }

    /**
     * Reads and converts the user input to a String.
     *
     * @return a text String from the user.
     * @throws UserInterruptException if the user wants to quit.
     * @throws RegretChoiceException  if the user regrets that he
     *                                or she wanted to quit.
     */
    public String asString() throws UserInterruptException, RegretChoiceException
    {
        String returnString = "";
        boolean completed = false;
        while (!completed)
        {
            System.out.println("Type '/cancel' to abort. ");
            String input = readInput();
            if (input.equals("/cancel"))
            {
                choose();
            }
            else if (input.isEmpty())
            {
                throw new InputMismatchException();
            }
            else
            {
                returnString = input;
                completed = true;
            }
        }

        return returnString;
    }

    /**
     * If the user has intended that he or she wants to cancel the operation,
     * the user will be asked if he or she is sure.
     * If the input is "yes", an UserInterruptException will be thrown.
     * If not, a RegretChoiceException will be thrown.
     *
     * @throws UserInterruptException If the input equals "yes".
     * @throws RegretChoiceException  If the input does not equal to "yes".
     */
    private void choose() throws UserInterruptException, RegretChoiceException
    {
        System.out.println("Are you sure you want to cancel? Type yes to confirm.");
        String input = readInput();
        if (input.equals("yes"))
        {
            throw new UserInterruptException();
        } else
        {
            throw new RegretChoiceException();
        }
    }
}
