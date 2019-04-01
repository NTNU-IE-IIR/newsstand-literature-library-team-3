package UI;

import Logic.*;

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
            "1. List all literature",
            "2. Add new literature",
            "3. Manage cart"
            //"3. Find a newspaper by title",
    };
    private LiteratureRegister literatureCollection;
    private BookSeriesRegister bookSeriesRegister;
    private Cart cart;

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
                        this.listAllLiterature();
                        break;

                    case 2:
                        this.addLiterature();
                        break;

                    case 3:
                        this.cartMenu();
                        break;
                    //case 3:
                    //   this.findNewspaperByName();
                    //   break;

                    case 4:
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
     * Creates the literatureregister-instance, bookseriesregister-instance and the cart-instance.
     */
    private void init()
    {
        this.literatureCollection = new LiteratureRegister();
        this.bookSeriesRegister = new BookSeriesRegister();
        this.cart = new Cart();
    }

    /**
     * Lists all the products/literature in the register
     */
    private void listAllProducts()
    {
        System.out.println("listAllProducts() was called");
    }

    /**
     * Lists all the literature in the register
     */
    private void listAllLiterature()
    {
        listAllBooks();
        listAllMagazines();
        listAllNewspapers();
    }

    /**
     * Lists all the magazines in the register
     */
    private void listAllMagazines()
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
                System.out.println(new MagazineView((Magazine)literature).show());
                System.out.println();
            }
        }
    }


    /**
     * Lists all the books in the register
     */
    private void listAllBooks()
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
                System.out.println(literature.getAllInfoAsString());
                System.out.println();
            }
        }
    }


    /**
     * Lists all the newspapers in the register
     */
    private void listAllNewspapers()
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
                System.out.println(literature.getAllInfoAsString());
                System.out.println();
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
    private void addNewProduct()
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
//            Iterator<Logic.Newspaper> it = newspaperCollection.getIterator();
//            while (it.hasNext())
//            {
//                Logic.Newspaper currentNewspaper = it.next();
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
//            Logic.Newspaper newspaperToAdd = new Logic.Newspaper(title, publisher, genre, numberOfPublishments);
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
//                        Logic.Newspaper newspaperToAdd = new Logic.Newspaper(title, publisher, genre, numberOfPublishments);
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
        String seriesTitle = null;
        int numberOfYearlyPublications = 0;

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
                    } else
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
                    } else
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
                    } else
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
                    } else
                    {
                        quantity = Integer.parseInt(quantityInput);
                        if (choice == 1)
                        {
                            inputCase = 8;
                            break;
                        } else if (choice == 2)
                        {
                            inputCase = 12;
                            break;
                        } else if (choice == 3)
                        {
                            inputCase = 14;
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
                    } else
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
                    } else
                    {
                        edition = editionInput;
                        inputCase = 10;
                        break;
                    }

                case 10:
                    System.out.println("Please enter the seriestitle");
                    String seriesTitleInput = reader.nextLine();
                    seriesTitle = seriesTitleInput;
                    inputCase = 11;
                    break;


                case 11:
                    Book bookToAdd = new Book(title, publisher, publishYear, language, genre, price,
                            quantity, author, edition, "");
                    literatureCollection.addLiterature(bookToAdd);
                    if (bookToAdd.isPartOfBookSeries())
                    {
                        addBookToBookSeries(bookToAdd);
                    }
                    System.out.println("The book was successfully added to the literature register");
                    completed = true;
                    break;

                case 12:
                    System.out.println("Please enter the number of yearly publications of the literature");
                    String yearlyPublishInput = reader.nextLine();
                    if (yearlyPublishInput.isEmpty())
                    {
                        System.out.println("You need to enter the number of yearly publications of the literature");
                        break;
                    } else
                    {
                        numberOfYearlyPublications = Integer.parseInt(yearlyPublishInput);
                        inputCase = 13;
                        break;
                    }

                case 13:
                    Newspaper newspaperToAdd = new Newspaper(title, publisher, publishYear, language,
                            genre, price, quantity, numberOfYearlyPublications);
                    literatureCollection.addLiterature(newspaperToAdd);
                    System.out.println("The newspaper was successfully added to the literature register");
                    completed = true;
                    break;

                case 14:
                    System.out.println("Please enter the number of yearly publications of the magazine");
                    String yearlyMagPublishInput = reader.nextLine();
                    if (yearlyMagPublishInput.isEmpty())
                    {
                        System.out.println("You need to enter the number of yearly publications of the magazine");
                        break;
                    } else
                    {
                        numberOfYearlyPublications = Integer.parseInt(yearlyMagPublishInput);
                        inputCase = 15;
                        break;
                    }

                case 15:
                    Magazine magazineToAdd = new Magazine(title, publisher, publishYear, language,
                            genre, price, quantity, numberOfYearlyPublications);
                    literatureCollection.addLiterature(magazineToAdd);
                    System.out.println("The magazine was successfully added to the literature register");
                    completed = true;
                    break;
            }
        }
    }

    /**
     * Adds a book to a bookseries. If the bookseries the
     * book belongs to already exists in the application,
     * the book will be added to that bookseries.
     * If the bookseries does not exist in the application,
     * the new bookseries will be created, and the book will
     * be added to this bookseries.
     * @param book The book to be added to the bookseries.
     */
    private void addBookToBookSeries(Book book)
    {
        Iterator<BookSeries> bookSeriesRegIt = this.bookSeriesRegister.getIterator();
        boolean bookSeriesFound = false;
        String key = book.getTitle();
        while (bookSeriesRegIt.hasNext())
        {
            if (!bookSeriesFound)
            {
                BookSeries bookSeries = bookSeriesRegIt.next();
                if (bookSeries.exists(key))
                {
                    bookSeries.addBook(book);
                    bookSeriesFound = true;
                }
            }
        }

        if (!bookSeriesFound)
        {
            BookSeries newBookSeries = new BookSeries(book.getSeriesTitle());
            newBookSeries.addBook(book);
        }
    }

    private void cartMenu()
    {
        boolean completed = false;
        int inputCase = 1;


        while (!completed)

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


    /**
     * Prints the main menu for the manage cart option. Will check that the number entered is valid.
     * @return The inputcase used in the switchcase in the cart menu. will return 1 if the number entered is invalid
     * */
    private int printMainCartMenu()
    {
        int inputCase;
        Scanner reader = new Scanner(System.in);
        String[] choices = {
                "1. Show content in cart",
                "2. Show total price",
                "3. Add items to cart",
                "4. Remove items from cart",
                "5. Check out",
                "6. Back"
        };

        for(String menuItem : choices)
        {
            System.out.println(menuItem);
        }

        inputCase = reader.nextInt() + 1;

        if(inputCase <= 1 || inputCase > (choices.length + 1))
        {
            System.out.println("Please enter a number between 1 - " + choices.length);
            inputCase = 1;
        }

        return inputCase;
    }



    /**
     * prints the total price for all the products in the cart. if there are no
     * items in the cart, a message will be sent to the user.
     * */
    private void showCartPrice()
    {
        int price;
        if (cart.getSize() == 0)
        {
            System.out.println("There are no items in your cart.");
        }
        else
        {
            price = cart.getTotalPrice();
            System.out.println("The total price in your cart is: " + price + "$");
        }
    }


    /**
     * Lets the user add an item to the cart. Requiers the user to search for the
     * product by title. If the cart is empty, and message will be sent to the user.
     * @return The inputCase used in the switch case in the cartMenu.
     * */
    private int addItemToCart()
    {
        int inputCase;
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the title of the literature you are interested in");
        String searchWord = reader.nextLine();
        Literature result = literatureCollection.searchByTitle(searchWord);
        if (result == null)
        {
            System.out.println("Could not find any product matching your search.");
            inputCase = 1;
        }
        else
        {
            System.out.println(result.getAllInfoAsString());
            System.out.println("Do you wish to add this item to your cart?");
            System.out.println("Enter yes or no");
            String answer = reader.nextLine();
            if (answer.equals("yes"))
            {
                this.cart.addToCart(result);
                System.out.println(result.getTitle() + " has been successfully added to your cart.");
                System.out.println("Do you wish to add another product?");
                System.out.println("Enter yes or no");

                answer = reader.nextLine();
                if (answer.equals("yes"))
                {
                    inputCase = 4;
                }
                else
                {
                    inputCase = 1;
                }

            } else if (answer.equals("no"))
            {
                System.out.println(result.getTitle() + " was not added to your cart.");
                inputCase = 1;
            }
            else
            {
                System.out.println("You entered an invalid answer. Request aborted.");
                inputCase = 1;
            }

        }
       return inputCase;
    }

    /**
     * Lets the user remove an item from the cart. Requiers the user to search for the
     * product by title. If the cart is empty, and message will be sent to the user.
     * */

    private void removeItemFromCart()
    {
        Scanner reader = new Scanner(System.in);

        if(cart.getSize() == 0)
        {
            System.out.println("You have no items in your cart.");

        }
        else
        {
            cart.showCart();
            System.out.println("Please enter the title of the product you wish to remove");
            String productToRemove = reader.nextLine();
            Literature removeProduct = cart.searchByTitle(productToRemove);

            if(removeProduct == null)
            {
                System.out.println("Could not find any product matching your search.");
            }
            else
            {
                System.out.println("Do you wish to remove this product from your cart?");
                System.out.println(removeProduct.getAllInfoAsString());
                System.out.println("Please enter yes or no");
                String answer = reader.nextLine();
                if(answer.equals("yes"))
                {
                    System.out.println(removeProduct.getTitle() + " was successfully removed from your cart.");
                    cart.removeFromCart(removeProduct);
                }
                else if (answer.equals("no"))
                {
                    System.out.println(removeProduct.getTitle() + " was not removed from your cart");
                }
                else
                {
                    System.out.println("You entered an invalid answer. Request aborted.");
                }

            }
        }
    }

    /**
     * Allows the user to pay for the products in the cart. Change will be given if the amount
     * is too big. If there are no items in the cart or the pay amount is too low a message will be sent to the user.
     * @return true if the payment is successful
     * */

    private boolean proceedToCheckOut()
    {
        boolean returnBoolean = false;
        Scanner reader = new Scanner(System.in);

        if (cart.getSize() == 0)
        {
            System.out.println("You have no items in cart.");
        }
        else
        {

            System.out.println(cart.showCart());

            int priceToPay = cart.getTotalPrice();
            System.out.println("Total price: " + priceToPay + "$");
            System.out.println();
            System.out.println("Please enter the amount to pay");

            int enteredAmount = reader.nextInt();

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


