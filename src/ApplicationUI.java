
import java.sql.SQLOutput;
import java.util.*;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 *
 * @author Erlend Holseker, Arvin Khodabandeh, Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.06)
 */
public class ApplicationUI
{

    // An array containing strings to be displayed in the menu.
    private String[] menuItems = {
            "1. List all Literature",
            "2. Add new literature"
            //"3. Find a newspaper by title",
    };
    private LiteratureRegister newspaperCollection;
    private LiteratureRegister literatureCollection;

    /**
     * Creates an instance of the ApplicationUI User interface.
     */
    public ApplicationUI()
    {
        this.newspaperCollection = new LiteratureRegister();
        this.literatureCollection = new LiteratureRegister();
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
                        this.listAllLiterature();
                        break;

                    case 2:
                        this.addLiterature();
                        break;

                    //case 3:
                     //   this.findNewspaperByName();
                     //   break;

                    case 3:
                        System.out.println("\nThank you for using Application v0.1. Bye!\n");
                        quit = true;
                        break;

                    default:
                }
            } catch (InputMismatchException ime)
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
        for (String menuItem : menuItems)
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
    private void listAllProducts()
    {
        System.out.println("listAllProducts() was called");
    }

    private void listAllLiterature()
    {
        listAllBooks();
        listAllMagazines();
        listAllNewspapers();
    }

    private void listAllMagazines()
    {
        Iterator<Literature> litListIt = this.literatureCollection.getIterator();
        System.out.println("Magazines: \n");
        while (litListIt.hasNext())
        {
            Literature literature = litListIt.next();

            if (literature instanceof Magazine)
            {
                System.out.println(literature.getAllInfoAsString());
            }
        }
    }


    private void listAllBooks()
        {
            Iterator<Literature> litListIt = this.literatureCollection.getIterator();
            System.out.println("Books: \n");
            while (litListIt.hasNext())
            {
                Literature literature = litListIt.next();
                if (literature instanceof Book)
                {
                    System.out.println(literature.getAllInfoAsString());
                }
            }
        }


    /**
     * Lists all the literature in the register
     */
    private void listAllNewspapers()
    {
        Iterator<Literature> litListIt = this.literatureCollection.getIterator();
        System.out.println("Newspapers: ");
        while (litListIt.hasNext())
        {
            Literature literature = litListIt.next();
            if (literature instanceof Newspaper)
            {
                System.out.println(literature.getAllInfoAsString());
            }
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
        private void addNewProduct ()
        {
            System.out.println("addNewProduct() was called");
        }

//        /**
//         * Find and display a product based om name (title).
//         * As with the addNewProduct()-method, you have to
//         * ask the user for the string (name/title/publisher)
//         * to search for, and then use this string as input-
//         * parameter to the method in the register-object.
//         * Then, upon return from the register, you need
//         * to print the details of the found item.
//         */
//        private void findNewspaperByName ()
//        {
//            System.out.print("Please enter title to search for: ");
//            Scanner reader = new Scanner(System.in);
//            String searchWord = reader.nextLine();
//            Iterator<Newspaper> it = newspaperCollection.getIterator();
//            while (it.hasNext())
//            {
//                Newspaper currentNewspaper = it.next();
//                String currentNewspaperTitle = currentNewspaper.getTitle();
//                if (currentNewspaperTitle.contains(searchWord))
//                {
//                    System.out.println(currentNewspaper.getAllInfoAsString());
//                }
//            }
//        }
//
//        /**
//         * Add a new product/literature to the register.
//         * Uses Scanner class to fill the parameters needed to
//         * create a new newspaper object. This object is later added to the
//         * newspaper collection.
//         */
//        private void addNewspaper2 ()
//        {
//            System.out.println("Please enter the title of the newspaper: ");
//            Scanner reader = new Scanner(System.in);
//            String title = reader.nextLine();
//
//            System.out.println("Please enter the genre: ");
//            String genre = reader.nextLine();
//
//            System.out.println("Please enter the publisher: ");
//            String publisher = reader.nextLine();
//
//            System.out.println("Please enter the number of issues of the newspaper: ");
//            System.out.println("Set to 0 if unknown");
//            int numberOfPublishments = Integer.parseInt(reader.nextLine());
//
//
//            Newspaper newspaperToAdd = new Newspaper(title, publisher, genre, numberOfPublishments);
//            newspaperCollection.addNewspaper(newspaperToAdd);
//        }

//        /**
//         * Adds a new newspaper to the newspaper register.
//         * Uses a Scanner class to fill the parameters to create a
//         * new newspaper object. This object is added to the
//         * newspaper collection.
//         * A switch-case statement is used, where each parameter input is
//         * entered in its own case. The switch-case statement is used
//         * to secure the user from entering invalid input.
//         */
//        private void addNewspaper ()
//        {
//            String title = null;
//            String genre = null;
//            String publisher = null;
//            int numberOfPublishments = 0;
//
//            boolean completed = false;
//
//            int inputCase = 1;
//            Scanner reader = new Scanner(System.in);
//            while (!completed)
//            {
//                switch (inputCase)
//                {
//                    case 1:
//                        System.out.println("Please enter the title of the newspaper: ");
//                        String titleInput = reader.nextLine();
//                        if (titleInput.isEmpty())
//                        {
//                            System.out.println("You need to enter the title");
//                            break;
//                        } else
//                        {
//                            title = titleInput;
//                            inputCase = 2;
//                            break;
//                        }
//
//                    case 2:
//                        System.out.println("Please enter the genre: ");
//                        String genreInput = reader.nextLine();
//                        if (genreInput.isEmpty())
//                        {
//                            System.out.println("You need to enter the genre");
//                            break;
//                        } else
//                        {
//                            genre = genreInput;
//                            inputCase = 3;
//                            break;
//                        }
//
//                    case 3:
//                        System.out.println("Please enter the publisher: ");
//                        String publisherInput = reader.nextLine();
//                        if (publisherInput.isEmpty())
//                        {
//                            System.out.println("You need to enter the publisher");
//                            break;
//                        } else
//                        {
//                            publisher = publisherInput;
//                            inputCase = 4;
//                            break;
//                        }
//
//                    case 4:
//                        System.out.println("Please enter the number of issues of the newspaper: ");
//                        System.out.println("Set to 0 if unknown");
//                        String inputNumber = reader.nextLine();
//                        if (inputNumber.isEmpty())
//                        {
//                            System.out.println("You need to enter a number");
//                            break;
//                        } else
//                        {
//                            int numberOfPublishmentsInput = Integer.parseInt(inputNumber);
//                            numberOfPublishments = numberOfPublishmentsInput;
//                            inputCase = 5;
//                            break;
//                        }
//
//                    case 5:
//                        Newspaper newspaperToAdd = new Newspaper(title, publisher, genre, numberOfPublishments);
//                        newspaperCollection.addNewspaper(newspaperToAdd);
//                        System.out.println("The newspaper was successfully added to the register");
//                        completed = true;
//                        break;
//                }
//            }
//        }

    /**
     * Adds a new newspaper to the newspaper register.
     * Uses a Scanner class to fill the parameters to create a
     * new newspaper object. This object is added to the
     * newspaper collection.
     * A switch-case statement is used, where each parameter input is
     * entered in its own case. The switch-case statement is used
     * to secure the user from entering invalid input.
     */
    private void addLiterature()
    {
        String title = null;
        String genre = null;
        String publisher = null;
        String publishYear = null;
        String language = null;
        int price = 0;
        int quantity = 0;
        String author = null;
        String edition = null;
        int numberOfYearlyPublishments = 0;

        String[] choices = {
                "1. Book",
                "2. Newspaper",
                "3. Magazine"
        };
        int choice = 0;

        boolean completed = false;

        int inputCase = 0;
        Scanner reader = new Scanner(System.in);
        while (!completed)
        {
            switch (inputCase)
            {
                case 0:
                    System.out.println("Which kind of literature do you want to add?");
                    for (String literatureChoice : choices)
                    {
                        System.out.println(literatureChoice);
                    }
                    String choiceInput = reader.nextLine();
                    String[] validChoices = {
                            "1",
                            "2",
                            "3"
                    };
                    List<String> validChoiceList = Arrays.asList(validChoices);

                    if (validChoiceList.contains(choiceInput))
                    {
                        choice = Integer.parseInt(choiceInput);
                        inputCase = 1;
                        break;
                    }
                    else
                    {
                        System.out.println("You need to enter a number between 1-3");
                        System.out.println(choices);
                        break;
                    }

                case 1:
                    System.out.println("Please enter the title of the literature: ");
                    String titleInput = reader.nextLine();
                    if (titleInput.isEmpty())
                    {
                        System.out.println("You need to enter the title");
                        break;
                    } else
                    {
                        title = titleInput;
                        inputCase = 2;
                        break;
                    }

                case 2:
                    System.out.println("Please enter the genre: ");
                    String genreInput = reader.nextLine();
                    if (genreInput.isEmpty())
                    {
                        System.out.println("You need to enter the genre");
                        break;
                    } else
                    {
                        genre = genreInput;
                        inputCase = 3;
                        break;
                    }

                case 3:
                    System.out.println("Please enter the publisher: ");
                    String publisherInput = reader.nextLine();
                    if (publisherInput.isEmpty())
                    {
                        System.out.println("You need to enter the publisher");
                        break;
                    } else
                    {
                        publisher = publisherInput;
                        inputCase = 4;
                        break;
                    }

                case 4:
                    System.out.println("Please enter the publish-year");
                    System.out.println("Set to UNDEFINED if unknown");
                    String publishYearInput = reader.nextLine();
                    if (publishYearInput.isEmpty())
                    {
                        System.out.println("You need to enter the publish-year");
                        break;
                    } else
                    {
                        publishYear = publishYearInput;
                        inputCase = 5;
                        break;
                    }

                case 5:
                    System.out.println("Please enter the language the literature is written in");
                    System.out.println("Set to UNDEFINED if unknown");
                    String languageInput = reader.nextLine();
                    if (languageInput.isEmpty())
                    {
                        System.out.println("You need to enter the language");
                        break;
                    }
                    else
                    {
                        language = languageInput;
                        inputCase = 6;
                        break;
                    }

                case 6:
                    System.out.println("Please enter the price of the literature");
                    System.out.println("Set to 0 if unknown");
                    String priceInput = reader.nextLine();
                    if (priceInput.isEmpty())
                    {
                        System.out.println("You need to enter the price");
                        break;
                    }
                    else
                    {
                        price = Integer.parseInt(priceInput);
                        inputCase = 7;
                        break;
                    }

                case 7:
                    System.out.println("Please enter the quantity of this literature in stock");
                    System.out.println("Set to 0 if unknown");
                    String quantityInput = reader.nextLine();
                    if (quantityInput.isEmpty())
                    {
                        System.out.println("You need to enter the quantity");
                        break;
                    }
                    else
                    {
                        quantity = Integer.parseInt(quantityInput);
                        if (choice == 1)
                        {
                            inputCase = 8;
                            break;
                        }
                        else if (choice == 2)
                        {
                            inputCase = 11;
                            break;
                        }
                        else if (choice == 3)
                        {
                            inputCase = 13;
                            break;
                        }
                        break;
                    }

                case 8:
                    System.out.println("Please enter the name of the author of the book");
                    String authorInput = reader.nextLine();
                    if (authorInput.isEmpty())
                    {
                        System.out.println("You need to enter the name of the author");
                        break;
                    }
                    else
                    {
                        author = authorInput;
                        inputCase = 9;
                        break;
                    }

                case 9:
                    System.out.println("Please enter the edition of the book");
                    String editionInput = reader.nextLine();
                    if (editionInput.isEmpty())
                    {
                        System.out.println("You need to enter the edition of the book");
                        break;
                    }
                    else
                    {
                        edition = editionInput;
                        inputCase = 10;
                        break;
                    }

                case 10:
                    Book bookToAdd = new Book(title, publisher, publishYear, language, genre, price,
                            quantity, author, edition, "");
                    literatureCollection.addLiterature(bookToAdd);
                    System.out.println("The book was successfully added to the literature register");
                    completed = true;
                    break;

                case 11:
                    System.out.println("Please enter the number of yearly publishments of the newspaper");
                    String yearlyPublishInput = reader.nextLine();
                    if (yearlyPublishInput.isEmpty())
                    {
                        System.out.println("You need to enter the number of yearly publishments of the newspaper");
                        break;
                    }
                    else
                    {
                        numberOfYearlyPublishments = Integer.parseInt(yearlyPublishInput);
                        inputCase = 12;
                        break;
                    }

                case 12:
                    Newspaper newspaperToAdd = new Newspaper(title, publisher, publishYear, language,
                            genre, price, quantity, numberOfYearlyPublishments);
                    literatureCollection.addLiterature(newspaperToAdd);
                    System.out.println("The newspaper was successfully added to the literature register");
                    completed = true;
                    break;

                case 13:
                    System.out.println("Please enter the number of yearly publishments of the newspaper");
                    String yearlyMagPublishInput = reader.nextLine();
                    if (yearlyMagPublishInput.isEmpty())
                    {
                        System.out.println("You need to enter the number of yearly publishments of the newspaper");
                        break;
                    }
                    else
                    {
                        numberOfYearlyPublishments = Integer.parseInt(yearlyMagPublishInput);
                        inputCase = 14;
                        break;
                    }

                case 14:
                    Magazine magazineToAdd = new Magazine(title, publisher, publishYear, language,
                            genre, price, quantity, numberOfYearlyPublishments);
                    literatureCollection.addLiterature(magazineToAdd);
                    System.out.println("The magazine was successfully added to the literature register");
                    completed = true;
                    break;
            }
        }
    }
    }

