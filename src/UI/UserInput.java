package UI;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.UserInterruptException;

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
     */
    public int asInteger() throws UserInterruptException
    {
        int returnValue = -1;
        boolean completed = false;
        while (!completed)
        {
            System.out.println("Type '/cancel' to abort.");
            String input = readInput();
            if (input.equals("/cancel"))
            {
                System.out.println("Are you sure you want to cancel? Type yes to confirm.");
                input = readInput();
                if (input.equals("yes"))
                {
                    throw new UserInterruptException();
                }
            } else if (input.isEmpty())
            {
                throw new InputMismatchException();
            } else
            {
                returnValue = Integer.parseInt(input);
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
     */
    public String asString() throws UserInterruptException
    {
        String returnString = "";
        boolean completed = false;
        while (!completed)
        {
            System.out.println("Type '/cancel' to abort. ");
            String input = readInput();
            if (input.equals("/cancel"))
            {
                System.out.println("Are you sure you want to cancel? Type yes to confirm.");
                input = readInput();
                if (input.equals("yes"))
                {
                    throw new UserInterruptException();
                }
            } else
            {
                returnString = input;
                completed = true;
            }
        }

        return returnString;
    }
}
