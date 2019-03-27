import UI.ApplicationUI;

/**
 * The Main-class of the application. This class only holds the main()-method
 * to start the application.
 *
 * @author Erlend Holseker, Arvin Khodabandeh, Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.06)
 */
public class Main 
{
    /**
     * The main entry for the application.
     * @param args arguments provided during startup of the application
     */
    public static void main(String[] args)
    {
        ApplicationUI appUI = new ApplicationUI();
        appUI.start();
    }
}
