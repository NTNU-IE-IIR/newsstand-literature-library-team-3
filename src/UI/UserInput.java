package UI;

import java.util.Scanner;

public class UserInput
{
    Scanner userInput;

    public UserInput()
    {
        this.userInput = new Scanner(System.in);
    }

    private String readInput()
    {
        return this.userInput.nextLine();
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
            try
            {
                System.out.println("Please type an integer value. Type '/cancel' to abort.");
                String input = readInput();
                if (input.equals("/cancel"))
                {
                    System.out.println("Are you sure you want to cancel? Type yes to confirm.");
                    input = readInput();
                    if (input.equals("yes"))
                    {
                        throw new UserInterruptException();
                    }
                }
                else
                {
                    returnValue = Integer.parseInt(input);
                    if(returnValue < 0)
                    {
                        System.out.println("The value can not be negative");
                    }
                    else
                    {
                        completed = true;
                    }
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("ERROR: Input must be an integer.");
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
                System.out.println("Please type your input. Type '/cancel' to abort.");
                String input = readInput();
                if (input.equals("/cancel"))
                {
                    System.out.println("Are you sure you want to cancel? Type yes to confirm.");
                    input = readInput();
                    if (input.equals("yes"))
                    {
                        throw new UserInterruptException("");
                    }
                }
                else
                {
                    returnString = input;
                    completed = true;
                }
        }

        return returnString;
    }
}
