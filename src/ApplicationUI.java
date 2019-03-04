
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 *
 * @author asty
 * @version 1.0
 */
public class ApplicationUI 
{

   
    // The menu tha will be displayed. Please edit/alter the menu
    // to fit your application (i.e. replace "prodct" with "litterature"
    // etc.
    private String[] menuItems = {
            "1. List all newspapers",
            "2. Add new newspaper",
            "3. Find a newspaper by title",
    };
    private LiteratureRegister newspaperCollection;

    /**
     * Creates an instance of the ApplicationUI User interface. 
     */
    public ApplicationUI() 
    {
        this.newspaperCollection = new LiteratureRegister();
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    public void start() 
    {
        this.init();

        boolean quit = false;

        while (!quit) 
        {
            try 
            {
                int menuSelection = this.showMenu();
                switch (menuSelection) 
                {
                    case 1:
                        this.listAllNewspapers();
                        break;

                    case 2:
                        addNewspaper();
                        break;

                    case 3:
                        this.findNewspaperByName();
                        break;

                    case 4:
                        System.out.println("\nThank you for using Application v0.1. Bye!\n");
                        quit = true;
                        break;

                    default:
                }
            } 
            catch (InputMismatchException ime) 
            {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }        
        
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items. 
     * If the user inputs anything else, an InputMismatchException is thrown. 
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException if user enters an invalid number/menu choice
     */
    private int showMenu() throws InputMismatchException 
    {
        System.out.println("\n**** Application v0.1 ****\n");
        // Display the menu
        for ( String menuItem : menuItems )
        {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");
        // Read input from user
        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) 
        {
            throw new InputMismatchException();
        }
        return menuSelection;
    }
    
    // ------ The methods below this line are "helper"-methods, used from the menu ----
    // ------ All these methods are made private, since they are only used by the menu ---
    
    /**
     * Initializes the application.
     * Typically you would create the LiteratureRegistrer-instance here
     */
    private void init()
    {
        System.out.println("init() was called");
    }

    /**
     * Lists all the products/literature in the register
     */
    void listAllProducts()
    {
        System.out.println("listAllProducts() was called");
    }

    void listAllNewspapers()
    {
        Iterator<Newspaper> newsListIt = this.newspaperCollection.getIterator();
        while (newsListIt.hasNext())
        {
            Newspaper newspaper = newsListIt.next();

            System.out.println("Title: " + newspaper.getTitle() + "\n" +
                    "Number of publishments: " + newspaper.getNumberOfPublishments() + "\n" +
                    "Genre: " + newspaper.getGenre() + "\n" +
                    "Publisher: " + newspaper.getPublisher());
        }
    }

    
    /**
     * Add a new product/literature to the register.
     * In this method you have to add code to ask the
     * user for the necessary information you need to 
     * create an instance of the product, which you
     * then send as a parameter to the addNewspaper()-
     * method of the register.
     * Remember to also handle invalid input from the
     * user!!
     */
    void addNewProduct()
    {
        System.out.println("addNewProduct() was called");
        
    }

    /**
     * Find and display a product based om name (title).
     * As with the addNewProduct()-method, you have to
     * ask the user for the string (name/title/publisher)
     * to search for, and then use this string as input-
     * parameter to the method in the register-object.
     * Then, upon return from the register, you need
     * to print the details of the found item.
     */
    void findNewspaperByName()
    {
        System.out.print("Please enter title to search for: ");
        Scanner reader = new Scanner(System.in);
        String searchWord = reader.nextLine();
        Iterator<Newspaper> it = newspaperCollection.getIterator();
        while(it.hasNext())
        {
            Newspaper currentNewspaper = it.next();
            String currentNewspaperTitle = currentNewspaper.getTitle();
            if (currentNewspaperTitle.contains(searchWord))
            {
                System.out.println("Title: " + currentNewspaperTitle);
                System.out.println("Publisher: " + currentNewspaper.getPublisher());
                System.out.println("Genre: " + currentNewspaper.getGenre());
                System.out.println("Number of publishments: " + currentNewspaper.getNumberOfPublishments());
            }
        }
    }

    /**
     * Add a new product/literature to the register.
     * Uses Scanner class to fill the parameters needed to
     * create a new newspaper object. This object is later added to the
     * newspaper collection.
     */
    void addNewspaper()
    {
        System.out.println("Please enter the title of the newspaper: ");
        System.out.print("> ");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();

        System.out.println("Please enter the genre: ");
        System.out.print("> ");
        String genre = reader.nextLine();

        System.out.println("Please enter the publisher: ");
        System.out.print("> ");
        String publisher = reader.nextLine();

        System.out.println("Please enter the number of issues of the newspaper: ");
        System.out.println("Set to 0 if unknown");
        System.out.print("> ");
        int numberOfPublishments = Integer.parseInt(reader.nextLine());



        Newspaper newspaperToAdd = new Newspaper(title, genre, publisher, numberOfPublishments);
        newspaperCollection.addNewspaper(newspaperToAdd);
    }
}
