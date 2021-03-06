package Main;

import UI.ApplicationUI;

/**
 * The Main-class of the application. This class only holds the main()-method
 * to start the application.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public class Main 
{
        /**
         * The main entry for the application.
         * @param args arguments provided during startup of the application
         */
        public static void main (String[]args)
        {
            try
            {
                ApplicationUI appUI = new ApplicationUI();
                appUI.start();
            }
            catch (Exception e)
            {
                System.out.println("We are sorry to inform you that you are a dumbass, and you made the program crash.");
                System.out.println("If you really think this is the programmers fault, please call 1-800-GETABRAIN.");
            }
        }
}
