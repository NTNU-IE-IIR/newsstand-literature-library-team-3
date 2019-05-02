package UI;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.UserInterruptException;
import Exception.RegretChoiceException;

public class UserInput
{
    Scanner userInput;

    public UserInput()
    {
        this.userInput = new Scanner(System.in);
    }

    private String readInput()
    {
        return this.userInput.nextLine().trim();
    }

    /**
     * Reads and converts the user input to an int. Will only return a positive value.
     *
     * @return a positive integer value from the user.
     * @throws UserInterruptException if the user wants to quit.
     * @throws RegretChoiceException if the user regrets that he
     *                               or she wanted to quit.
     */
    public int asInteger() throws UserInterruptException, RegretChoiceException, NumberFormatException
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
                try
                {
                    returnValue = Integer.parseInt(input);
                }
                catch (NumberFormatException ne)
                {
                    throw new NumberFormatException("Input must be an integer.");
                }
                if (returnValue < 0)
                {
                    System.out.println("The value can not be negative");
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
     * @throws RegretChoiceException if the user regrets that he
     *                               or she wanted to quit.
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
            } else
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