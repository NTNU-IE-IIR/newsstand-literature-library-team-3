package UI;

import Logic.*;
import Exception.*;

import java.util.*;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 *
 * @author Erlend Holseker, Arvin Khodabandeh, Isak Gamnes Sneltvedt
 * @version 0.2 (2019.04.03)
 */
public class ApplicationUI
{

    // An array containing strings to be displayed in the menu.
    private String[] menuItems = {
            "1. List literature",
            "2. Add new literature",
            "3. List book series/ book collections",
            "4. Create book series / book collection",
            "5. Manage cart"
    };
    private LiteratureRegister literatureCollection;
    private BookSeriesRegister bookSeriesRegister;
    private Cart cart;

    private UserInput userInput;

    /**
     * Creates an instance of the UI.ApplicationUI User interface.
     */
    public ApplicationUI()
    {
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
                        this.listSalesItems();
                        break;

                    case 2:
                        this.addLiterature();
                        break;

                    case 3:
                        this.listBookSeries();
                        break;

                    case 4:
                        this.createBookSeries();
                        break;

                    case 5:
                        this.cartMenu();
                        break;

                    case 6:
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
        System.out.println("\n**** Super Literature Store 3000 ****\n");
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
     * Creates the literatureregister-instance, bookseriesregister-instance and the cart-instance.
     */
    private void init()
    {
        this.literatureCollection = new LiteratureRegister();
        this.bookSeriesRegister = new BookSeriesRegister();
        this.cart = new Cart();
        this.userInput = new UserInput();
    }

    /**
     * The user will get the opportunity to list the type
     * of literature he or she is interested in.
     */
    private void listSalesItems()
    {
        int inputCase = 1;
        boolean completed = false;
        while (!completed)
        {
            try
            {
                switch (inputCase)
                {
                    case 1:
                        inputCase = printSalesItemViewChoices();
                        break;

                    case 2:
                        listBooks();
                        completed = true;
                        break;

                    case 3:
                        listNewspapers();
                        completed = true;
                        break;

                    case 4:
                        listMagazines();
                        completed = true;
                        break;

                    case 5:
                        listBookSeries();
                        completed = true;
                        break;

                    case 6:
                        listAllLiterature();
                        completed = true;
                        break;

                    case 7:
                        completed = true;
                        break;
                }
            } catch (NumberFormatException ne)
            {
                System.out.println(ne.getMessage());
            } catch (UserInterruptException e)
            {
                System.out.println(e.toString());
                completed = true;
            } catch (RegretChoiceException e)
            {
                System.out.println(e.toString());
            }
        }
    }


    /**
     * Sends a String-array to the listChoices-method, which
     * displays the choices to the user. The listChoices-method
     * then returns an int based on the input from the user, which
     * is then returned by this method.
     *
     * @return An int based on the input from the user.
     */
    private int printSalesItemViewChoices() throws UserInterruptException, RegretChoiceException
    {
        String[] choices = {
                "1. Books",
                "2. Newspapers",
                "3. Magazines",
                "4. Book series",
                "5. All literature",
                "6. Back"
        };

        return listChoices(choices);
    }

    /**
     * Used by methods that wants to display specified
     * choices to the user. A String-array containing the
     * choices is taken in as a parameter, and displayed to the user.
     * An int based on the input from the user is returned.
     *
     * @param choices An Array of Strings containing the choices to be displayed.
     * @return An int based on the user input.
     */
    private int listChoices(String[] choices) throws UserInterruptException, RegretChoiceException
    {
        int inputCase = 1;
        try
        {
            for (String menuItem : choices)
            {
                System.out.println(menuItem);
            }

            int input = userInput.asInteger();
            if ((input < 1) || (input > choices.length))
            {
                throw new NumberFormatException("You must enter a number between 1 and " + choices.length + ".");
            } else
            {
                inputCase = input + 1;
            }
        } catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        return inputCase;
    }

    /**
     * The user will get the opportunity to list either
     * all information about each book, or only a limited amount
     * of the information about each book.
     */
    private void listBooks()
    {
        String[] choices = {
                "1. List all information about the books",
                "2. List keyinformation about the books",
                "3. Back"
        };

        int inputCase = 1;
        boolean completed = false;

        while (!completed)
        {
            try
            {
                switch (inputCase)
                {
                    case 1:
                        inputCase = listChoices(choices);
                        break;

                    case 2:
                        listAllBooks(true);
                        completed = true;
                        break;

                    case 3:
                        listAllBooks(false);
                        completed = true;
                        break;

                    case 4:
                        completed = true;
                        break;
                }
            } catch (NumberFormatException ne)
            {
                System.out.println(ne.getMessage());
            } catch (UserInterruptException ue)
            {
                System.out.println(ue.toString());
                completed = true;
            } catch (RegretChoiceException re)
            {
                System.out.println(re.toString());
            }
        }
    }

    /**
     * The user will get the opportunity to list either
     * all information about each magazine, or only a limited amount
     * of the information about each magazine.
     */
    private void listMagazines()
    {
        String[] choices = {
                "1. List all information about the magazines",
                "2. List keyinformation about the books",
                "3. Back"
        };

        int inputCase = 1;
        boolean completed = false;

        while (!completed)
        {
            try
            {
                switch (inputCase)
                {
                    case 1:
                        inputCase = listChoices(choices);
                        break;

                    case 2:
                        listAllMagazines(true);
                        completed = true;
                        break;

                    case 3:
                        listAllMagazines(false);
                        completed = true;
                        break;

                    case 4:
                        completed = true;
                        break;
                }
            } catch (NumberFormatException ne)
            {
                System.out.println(ne.getMessage());
            } catch (UserInterruptException ue)
            {
                System.out.println(ue.toString());
                completed = true;
            } catch (RegretChoiceException re)
            {
                System.out.println(re.toString());
            }
        }
    }

    /**
     * The user will get the opportunity to list either
     * all information about each newspaper, or only a limited amount
     * of the information about each newspaper.
     */
    private void listNewspapers()
    {
        String[] choices = {
                "1. List all information about the newspapers",
                "2. List keyinformation about the newspapers",
                "3. Back"
        };

        int inputCase = 1;
        boolean completed = false;

        while (!completed)
        {
            try
            {
                switch (inputCase)
                {
                    case 1:
                        inputCase = listChoices(choices);
                        break;

                    case 2:
                        listAllNewspapers(true);
                        completed = true;
                        break;

                    case 3:
                        listAllNewspapers(false);
                        completed = true;
                        break;

                    case 4:
                        completed = true;
                        break;
                }
            } catch (NumberFormatException ne)
            {
                System.out.println(ne.getMessage());
            } catch (UserInterruptException ue)
            {
                System.out.println(ue.toString());
                completed = true;
            } catch (RegretChoiceException re)
            {
                System.out.println(re.toString());
            }
        }
    }

    /**
     * Lists all the literature in the register
     */
    private void listAllLiterature()
    {
        String[] choices = {
                "1. List all information about all literature",
                "2. List keyinformation about all literature",
                "3. Back"
        };

        int inputCase = 1;
        boolean completed = false;

        while (!completed)
        {
            try
            {
                switch (inputCase)
                {
                    case 1:
                        inputCase = listChoices(choices);
                        break;

                    case 2:
                        listAllBooks(true);
                        listAllMagazines(true);
                        listAllNewspapers(true);
                        completed = true;
                        break;

                    case 3:
                        listAllBooks(false);
                        listAllMagazines(false);
                        listAllNewspapers(false);
                        completed = true;
                        break;

                    case 4:
                        completed = true;
                        break;
                }
            } catch (NumberFormatException ne)
            {
                System.out.println(ne.getMessage());
            } catch (UserInterruptException ue)
            {
                System.out.println(ue.toString());
                completed = true;
            } catch (RegretChoiceException re)
            {
                System.out.println(re.toString());
            }
        }
    }

    /**
     * Lists all the magazines in the register.
     * Takes in a boolean parameter. If the parameter is true,
     * the magazines will be listed with all info. If false,
     * the magazines will be listed with limited info.
     *
     * @param showExtended Determines whether all the info or only
     *                     a limited amount of the info is going to
     *                     be printed.
     */
    private void listAllMagazines(boolean showExtended)
    {
        Iterator<Literature> litListIt = this.literatureCollection.getIterator();
        boolean headerHasBeenPrinted = false;
        while (litListIt.hasNext())
        {
            Literature literature = litListIt.next();
            if (literature instanceof Magazine)
            {
                if (!headerHasBeenPrinted)
                {
                    System.out.println("Magazines: \n");
                    headerHasBeenPrinted = true;
                }
                printLiteratureInformation(showExtended, literature);
            }
        }
        if (!headerHasBeenPrinted)
        {
            System.out.println("There is no magazines in the bookstore.");
            System.out.println();
        }
    }


    /**
     * Lists all the books in the register.
     * Takes in a boolean parameter. If the parameter is true,
     * the books will be listed with all info. If false,
     * the books will be listed with limited info.
     *
     * @param showExtended Determines whether all the info or only
     *                     a limited amount of the info is going to
     *                     be printed.
     */
    private void listAllBooks(boolean showExtended)
    {
        Iterator<Literature> litListIt = this.literatureCollection.getIterator();
        boolean headerHasBeenPrinted = false;
        while (litListIt.hasNext())
        {
            Literature literature = litListIt.next();
            if (literature instanceof Book)
            {
                if (!headerHasBeenPrinted)
                {
                    System.out.println("Books: \n");
                    headerHasBeenPrinted = true;
                }
                printLiteratureInformation(showExtended, literature);
            }
        }
        if (!headerHasBeenPrinted)
        {
            System.out.println("There is no books in the bookstore.");
            System.out.println();
        }
    }


    /**
     * Lists all the newspapers in the register.
     * Takes in a boolean parameter. If the parameter is true,
     * the newspapers will be listed with all info. If false,
     * the newspapers will be listed with limited info.
     *
     * @param showExtended Determines whether all the info or only
     *                     a limited amount of the info is going to
     *                     be printed.
     */
    private void listAllNewspapers(boolean showExtended)
    {
        Iterator<Literature> litListIt = this.literatureCollection.getIterator();
        boolean headerHasBeenPrinted = false;
        while (litListIt.hasNext())
        {
            Literature literature = litListIt.next();
            if (literature instanceof Newspaper)
            {
                if (!headerHasBeenPrinted)
                {
                    System.out.println("Newspapers: \n");
                    headerHasBeenPrinted = true;
                }
                printLiteratureInformation(showExtended, literature);
            }
        }
        if (!headerHasBeenPrinted)
        {
            System.out.println("There is no newspapers in the bookstore.");
            System.out.println();
        }
    }

    /**
     * Prints the information of all instances of a given literaturetype.
     * Takes in a boolean variable, which determines whether the information
     * to be printed should be limited, of extended.
     *
     * @param showExtended Decides whether the information to be printed
     *                     should be limited or extended.
     * @param literature   The literature type to be examined. The literature type
     *                     is chosen by the method calling this method.
     */
    private void printLiteratureInformation(boolean showExtended, Literature literature)
    {
        if (!showExtended)
        {
            System.out.println(new Viewer().createViewer(literature).showLimited());
        }
        if (showExtended)
        {
            System.out.println(new Viewer().createViewer(literature).show());
        }
    }


    /**
     * Lists either extended information about the book series with
     * additional information about the books in the series, or a limited
     * amount of information containing the series title, the price and
     * the quantity in stock.
     */
    private void listBookSeries()
    {
        String[] choices = {
                "1. List all information about the book series",
                "2. List key information about the book series",
                "3. Back"
        };
        Iterator<BookSeries> bookSeriesIterator = this.bookSeriesRegister.getIterator();
        int inputCase = 0;
        boolean completed = false;
        while (!completed)
        {
            try
            {
                switch (inputCase)
                {
                    case 0:
                        inputCase = listChoices(choices) - 1;
                        break;

                    case 1:
                        while (bookSeriesIterator.hasNext())
                        {
                            BookSeries bookSeries = bookSeriesIterator.next();
                            System.out.println(new Viewer().createViewer(bookSeries).show());
                        }
                        completed = true;
                        break;

                    case 2:
                        while (bookSeriesIterator.hasNext())
                        {
                            BookSeries bookSeries = bookSeriesIterator.next();
                            System.out.println(new Viewer().createViewer(bookSeries).showLimited());
                        }
                        completed = true;
                        break;
                }
            } catch (NumberFormatException ne)
            {
                System.out.println(ne.getMessage());
            } catch (UserInterruptException ue)
            {
                System.out.println(ue.toString());
                completed = true;
            } catch (RegretChoiceException re)
            {
                System.out.println(re.toString());
            }
        }
    }

    /**
     * Creates a new bookseries / bookcollection. The user gets a list
     * of all available books, and is asked to type the titles of the
     * books he or she wants to add to the collection.
     * The price of the collection is calculated by adding the prices of
     * each book together. If the user wants to redefine the price,
     * he or she will be asked to do so.
     * The quantity of the collection is determined by the book in the
     * collection with the lowest quantity.
     */
    private void createBookSeries()
    {
        String seriesTitle = null;
        int price = 0;
        HashMap<String, Book> booksToAdd = new HashMap<>();
        int inputCase = 0;
        Scanner reader = new Scanner(System.in);

        boolean completed = false;

        while (!completed)
        {
            switch (inputCase)
            {
                case 0:
                    System.out.println("Please enter the title of the collection you want to create");
                    String seriesTitleInput = reader.nextLine();
                    if (seriesTitleInput.isEmpty())
                    {
                        System.out.println("You need to enter the title of the collection you want to create");
                    } else
                    {
                        seriesTitle = seriesTitleInput;
                        inputCase = 1;
                    }
                    break;

                case 1:
                    System.out.println("Please type the title of the books you want to add to a collection.");
                    System.out.println("One title at the time.");
                    System.out.println("These are the books you can add:");
                    listAllBooks(false);

                    String titleInput = reader.nextLine();
                    if (this.literatureCollection.containsBook(titleInput))
                    {
                        Book bookToAdd = this.literatureCollection.getBook(titleInput);
                        booksToAdd.put(titleInput, bookToAdd);
                        price += bookToAdd.getPrice();
                        inputCase = 2;
                    } else
                    {
                        System.out.println("The title you entered does not exist in the register.");
                    }
                    break;

                case 2:
                    System.out.println("Are you finished adding books to the collection?");
                    System.out.println("Please type yes or no.");

                    String answer = reader.nextLine();
                    char choice = answer.charAt(0);

                    if (choice == 'y')
                    {
                        inputCase = 3;
                    } else
                    {
                        inputCase = 1;
                    }
                    break;

                case 3:
                    System.out.println("The total price of this collection is calculated to be:");
                    System.out.println(price + " NOK");
                    System.out.println("Do you want to change the price of the collection?");
                    System.out.println("Please type yes or no.");

                    answer = reader.nextLine();
                    choice = answer.charAt(0);

                    if (choice == 'y')
                    {
                        System.out.println("Please enter the price you want to set for the collection.");

                        price = reader.nextInt();

                        System.out.println("The price of the collection is now " + price + " NOK");

                        inputCase = 4;
                    } else
                    {
                        inputCase = 4;
                    }
                    break;

                case 4:
                    int quantity = 0;
                    boolean firstQuantityFound = false;
                    Iterator<Book> bookListIt = booksToAdd.values().iterator();
                    while (bookListIt.hasNext())
                    {
                        if (!firstQuantityFound)
                        {
                            Book book = bookListIt.next();
                            quantity = book.getQuantityInStock();
                            firstQuantityFound = true;
                        } else
                        {
                            Book book = bookListIt.next();

                            if (book.getQuantityInStock() < quantity)
                            {
                                quantity = book.getQuantityInStock();
                            }
                        }
                    }
                    BookSeries newBookSeries = new BookSeries(seriesTitle, price, quantity);
                    newBookSeries.getBookSeries().putAll(booksToAdd);
                    this.bookSeriesRegister.addBookSeries(newBookSeries);

                    System.out.println("The collection was successfully created.");
                    completed = true;
                    break;
            }
        }
    }

    /**
     * Adds a new literature-object to the literatureregister.
     * Uses a Scanner class to fill the parameters to create a
     * new literature object. This object is added to the
     * literature collection.
     * A switch-case statement is used, where each parameter input is
     * entered in its own case. The switch-case statement is used
     * to secure the user from entering invalid input.
     * An InputMismatchException will be thrown if the input is invalid.
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
        int numberOfYearlyPublications = 0;
        String publicationDate = null;
        String litChoice = "literature";

        String[] choices = {
                "1. Book",
                "2. Newspaper",
                "3. Magazine"
        };
        int choice = 0;

        boolean completed = false;

        int inputCase = 0;
        ;
        while (!completed)
        {
            try
            {
                switch (inputCase)
                {
                    case 0:
                        System.out.println("Which kind of literature do you want to add?");
                        for (String literatureChoice : choices)
                        {
                            System.out.println(literatureChoice);
                        }
                        int choiceInput = userInput.asInteger();
                        Integer[] validChoices = {
                                1,
                                2,
                                3
                        };
                        List<Integer> validChoiceList = Arrays.asList(validChoices);

                        if (validChoiceList.contains(choiceInput))
                        {
                            choice = choiceInput;
                            if (choice == 1)
                            {
                                litChoice = "book";
                            } else if (choice == 2)
                            {
                                litChoice = "newspaper";
                            } else if (choice == 3)
                            {
                                litChoice = "magazine";
                            }
                            inputCase = 1;
                        } else
                        {
                            System.out.println("You need to enter a number between 1-3");
                        }
                        break;

                    case 1:
                        System.out.print("Please enter the title of the " + litChoice + ". ");
                        String titleInput = userInput.asString();

                        if (titleInput.isEmpty())
                        {
                            throw new InputMismatchException();
                        } else
                        {
                            title = titleInput;
                            inputCase = 2;
                        }
                        break;

                    case 2:
                        System.out.print("Please enter the genre. ");
                        String genreInput = userInput.asString();

                        if (genreInput.isEmpty())
                        {
                            throw new InputMismatchException();
                        } else
                        {
                            genre = genreInput;
                            inputCase = 3;
                        }
                        break;

                    case 3:
                        System.out.print("Please enter the publisher. ");
                        String publisherInput = userInput.asString();

                        if (publisherInput.isEmpty())
                        {
                            throw new InputMismatchException();
                        } else
                        {
                            publisher = publisherInput;
                            inputCase = 4;
                        }
                        break;

                    case 4:
                        System.out.print("Please enter the publish-year. ");
                        String publishYearInput = userInput.asString();

                        if (publishYearInput.isEmpty())
                        {
                            throw new InputMismatchException();
                        } else
                        {
                            publishYear = publishYearInput;
                            inputCase = 5;
                        }
                        break;

                    case 5:
                        System.out.print("Please enter the language the " + litChoice + " is written in. ");
                        String languageInput = userInput.asString();

                        if (languageInput.isEmpty())
                        {
                            throw new InputMismatchException();
                        } else
                        {
                            language = languageInput;
                            inputCase = 6;
                        }
                        break;

                    case 6:
                        System.out.print("Please enter the price of the " + litChoice + ". ");
                        price = userInput.asInteger();
                        inputCase = 7;
                        break;

                    case 7:
                        System.out.println("Please enter the quantity of this " + litChoice + " in stock. ");
                        quantity = userInput.asInteger();
                        if (choice == 1)
                        {
                            inputCase = 8;
                        } else if (choice == 2 || choice == 3)
                        {
                            inputCase = 11;
                        }
                        break;

                    case 8:
                        System.out.println("Please enter the name of the author of the book");
                        String authorInput = userInput.asString();

                        if (authorInput.isEmpty())
                        {
                            throw new InputMismatchException();
                        } else
                        {
                            author = authorInput;
                            inputCase = 9;
                        }
                        break;

                    case 9:
                        System.out.println("Please enter the edition of the book");
                        String editionInput = userInput.asString();

                        if (editionInput.isEmpty())
                        {
                            throw new InputMismatchException();
                        } else
                        {
                            edition = editionInput;
                            inputCase = 10;
                        }
                        break;

                    case 10:
                        Book bookToAdd = new Book(title, publisher, publishYear, language, genre, price,
                                quantity, author, edition);
                        literatureCollection.addLiterature(bookToAdd);
                        System.out.println("The book was successfully added to the literature register");
                        completed = true;
                        break;

                    case 11:
                        System.out.println("Please enter the number of yearly publications of the " + litChoice);
                        int yearlyPublishInput = userInput.asInteger();

                        if (yearlyPublishInput <= 0)
                        {
                            throw new InputMismatchException("ERROR: Number of yearly publications must be greater than 0");
                        } else
                        {
                            numberOfYearlyPublications = yearlyPublishInput;
                            inputCase = 12;
                        }
                        break;

                    case 12:
                        System.out.println("Please enter the publication date of the " + litChoice);
                        String publishDateInput = userInput.asString();

                        if (publishDateInput.isEmpty())
                        {
                            throw new InputMismatchException();
                        } else
                        {
                            publicationDate = publishDateInput;
                            if (choice == 2)
                            {
                                inputCase = 13;
                            } else if (choice == 3)
                            {
                                inputCase = 14;
                            }
                        }
                        break;

                    case 13:
                        Newspaper newspaperToAdd = new Newspaper(title, publisher, publishYear, language,
                                genre, price, quantity, numberOfYearlyPublications, publicationDate);
                        literatureCollection.addLiterature(newspaperToAdd);
                        System.out.println("The newspaper was successfully added to the literature register");
                        completed = true;
                        break;

                    case 14:
                        Magazine magazineToAdd = new Magazine(title, publisher, publishYear, language,
                                genre, price, quantity, numberOfYearlyPublications, publicationDate);
                        literatureCollection.addLiterature(magazineToAdd);
                        System.out.println("The magazine was successfully added to the literature register");
                        completed = true;
                        break;
                }
            } catch (InputMismatchException e)
            {
                if (e.getMessage() == null)
                {
                    System.out.println("Sorry! Your input seems to be empty. Please try again.");
                } else
                {
                    System.out.println(e.getMessage());
                }
            } catch (NumberFormatException ne)
            {
                System.out.println("ERROR: You must enter a number.");
            } catch (UserInterruptException e)
            {
                System.out.println(e.toString());
                completed = true;
            } catch (RegretChoiceException re)
            {
                System.out.println(re.toString());
            }
        }
    }


    /**
     * Displays the cart menu by calling the printMainCartMenu-method.
     * Uses the user input to determine which methods to call.
     * If the user tries to add an item to the cart, with a desired quantity
     * higher than the available quantity, and InsufficientQuantityException will be caught.
     * If the input is invalid, an InputMismatchException will be caught.
     */
    private void cartMenu()
    {
        boolean completed = false;
        int inputCase = 1;


        while (!completed)
        {

            try
            {
                switch (inputCase)
                {
                    case 1:
                        inputCase = printMainCartMenu();
                        break;

                    case 2:
                        System.out.println(this.cart.showCart());
                        inputCase = 1;
                        break;

                    case 3:
                        showCartPrice();
                        inputCase = 1;
                        break;

                    case 4:
                        inputCase = addItemToCart();
                        break;

                    case 5:
                        removeItemFromCart();
                        inputCase = 1;
                        break;

                    case 6:
                        completed = proceedToCheckOut();
                        inputCase = 1;
                        break;

                    case 7:
                        completed = true;
                        break;
                }
            }

            catch (InsufficientQuantityException e)
            {
                System.out.println(e.toString());
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input.");
            }
            catch(UserInterruptException e)
            {
                System.out.println("The operation was cancelled by the user.");
                inputCase = 1;
            }
            catch(RegretChoiceException e)
            {
                System.out.println(e.toString());
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please type an integer value.");
            }
        }
    }


    /**
     * Prints the main menu for the manage cart option. Will check that the number entered is valid.
     *
     * @return The inputcase used in the switchcase in the cart menu. will return 1 if the number entered is invalid
     */
    private int printMainCartMenu() throws UserInterruptException, RegretChoiceException
    {
        String[] choices = {
                "1. Show content in cart",
                "2. Show total price",
                "3. Add items to cart",
                "4. Remove items from cart",
                "5. Check out",
                "6. Back"
        };
        return listChoices(choices);
    }


    /**
     * prints the total price for all the products in the cart. if there are no
     * items in the cart, a message will be sent to the user.
     */
    private void showCartPrice()
    {
        int price;
        if (cart.getSize() == 0)
        {
            System.out.println("There are no items in your cart.");
        } else
        {
            price = cart.getTotalPrice();
            System.out.println("The total price in your cart is: " + price + "$");
        }
    }


    /**
     * Lets the user add an item to the cart. Requiers the user to search for the
     * product by title. If the cart is empty, and message will be sent to the user.
     *
     * @return The inputCase used in the switch case in the cartMenu.
     */
    private int addItemToCart() throws InsufficientQuantityException,
            UserInterruptException, RegretChoiceException
    {
        boolean completed = false;
        int inputCase = 1;
        String[] choices =
                {
                        "1. Books",
                        "2. Newspapers",
                        "3. Magazines",
                        "4. Book series",
                        "5. Back",
                };
        System.out.println("Please choose the type of item you wish to purchase: ");
        for (String menuItem : choices)
        {
            System.out.println(menuItem);
        }
        int inputChoice = userInput.asInteger();


        while (!completed)
        {
            switch (inputChoice)
            {
                case 1:
                    listBooks();
                    completed = true;
                    break;

                case 2:
                    listNewspapers();
                    completed = true;
                    break;

                case 3:
                    listMagazines();
                    completed = true;
                    break;

                case 4:
                    listBookSeries();
                    completed = true;
                    break;

                case 5:
                    inputCase = 1;
                    completed = true;
                    break;

                default:
                    inputChoice = 5;
                    break;
            }
        }

        if (inputChoice != 5)
        {
            System.out.println("Please enter the title of the item you are interested in: ");
            String searchWord = userInput.asString();
            SalesItem result = null;
            if ((inputChoice == (1)) || (inputChoice == (2)) || (inputChoice == (3)))
            {
                result = literatureCollection.searchByTitle(searchWord);
            } else if (inputChoice == 4)
            {
                result = bookSeriesRegister.searchByTitle(searchWord);
            }
            if (result == null)
            {
                System.out.println("Could not find any product matching your search.");
                inputCase = 1;
            } else
            {
                Viewer itemView = new Viewer();
                String itemInfo = itemView.createViewer(result).showLimited();
                System.out.println(itemInfo);
                System.out.println("Do you wish to add this item to your cart?");
                System.out.println("Enter yes or no");
                String answer = userInput.asString();
                if (answer.equals("yes"))
                {
                    System.out.println("Please enter the amount you wish to add.");
                    System.out.println("Quantity in stock: " + result.getQuantityInStock());
                    int amount = userInput.asInteger();
                    if (amount <= result.getQuantityInStock())
                    {
                        for (int i = 1; i <= amount; i++)
                        {
                            this.cart.addToCart(result);
                        }
                    } else
                    {
                        throw new InsufficientQuantityException(amount, result.getQuantityInStock());
                    }
                    System.out.println(result.getTitle() + " has been successfully added to your cart.");
                    System.out.println("Do you wish to add another product?");
                    System.out.println("Enter yes or no");

                    answer = userInput.asString();
                    if (answer.equals("yes"))
                    {
                        inputCase = 4;
                    } else
                    {
                        inputCase = 1;
                    }

                } else if (answer.equals("no"))
                {
                    System.out.println(result.getTitle() + " was not added to your cart.");
                    inputCase = 1;
                } else
                {
                    System.out.println("You entered an invalid answer. Request aborted.");
                    inputCase = 1;
                }
            }
        }
        return inputCase;
    }

    /**
     * Lets the user remove an item from the cart. Requiers the user to search for the
     * product by title. If the cart is empty, and message will be sent to the user.
     */

    private void removeItemFromCart() throws UserInterruptException, RegretChoiceException
    {

        if (cart.getSize() == 0)
        {
            System.out.println("You have no items in your cart.");

        } else
        {
            cart.showCart();
            System.out.println("Please enter the title of the product you wish to remove");
            String productToRemove = userInput.asString();
            SalesItem removeProduct = cart.searchByTitle(productToRemove);

            if (removeProduct == null)
            {
                System.out.println("Could not find any product matching your search.");
            } else
            {
                System.out.println("Do you wish to remove this product from your cart?");

                Viewer litView = new Viewer();
                String litInfo = litView.createViewer(removeProduct).showLimited();
                System.out.println(litInfo);
                System.out.println("Please enter yes or no");
                String answer = userInput.asString();
                if (answer.equals("yes"))
                {
                    System.out.println(removeProduct.getTitle() + " was successfully removed from your cart.");
                    cart.removeFromCart(removeProduct);
                } else if (answer.equals("no"))
                {
                    System.out.println(removeProduct.getTitle() + " was not removed from your cart");
                } else
                {
                    System.out.println("You entered an invalid answer. Request aborted.");
                }

            }
        }
    }

    /**
     * Allows the user to pay for the products in the cart. Change will be given if the amount
     * is too big. If there are no items in the cart or the pay amount is too low a message will be sent to the user.
     *
     * @return true if the payment is successful
     */

    private boolean proceedToCheckOut() throws UserInterruptException, RegretChoiceException
    {
        boolean returnBoolean = false;

        if (cart.getSize() == 0)
        {
            System.out.println("You have no items in cart.");
        } else
        {

            System.out.println(cart.showCart());

            int priceToPay = cart.getTotalPrice();
            System.out.println("Total price: " + priceToPay + "$");
            System.out.println();
            System.out.println("Please enter the amount to pay");

            int enteredAmount = userInput.asInteger();

            if (enteredAmount < priceToPay)
            {
                System.out.println("Payment aborted. Amount was too low.");

            } else if (enteredAmount > priceToPay)
            {
                int change = enteredAmount - priceToPay;
                System.out.println("Entered amount exceeded the total price.");
                System.out.println("An amount of " + change + "$ will automatically be refunded to your bank account");
                cart.checkOut();
                returnBoolean = true;
            } else
            {
                System.out.println("Thank you! Have a nice day.");
                cart.checkOut();
                returnBoolean = true;
            }
        }
        return returnBoolean;
    }
}