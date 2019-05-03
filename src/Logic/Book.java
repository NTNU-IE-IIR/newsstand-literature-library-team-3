package Logic;

/**
 * Represents a book. The class inherits from the literature-class.
 * The book-class contains the following information about a book:
 * Title, publisher, publish-year, language, genre, price, quantity in stock, author and edition.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */

public class Book extends Literature
{
    private String author;
    private String edition;


    /**
     * Constructor of a Book-object.
     *
     * @param title The title of the book.
     * @param publisher The publisher of the book.
     * @param publishYear The year the book was published.
     * @param language The language the book is written in.
     * @param genre The genre of the book.
     * @param price The price of the book.
     * @param quantityInStock The quantity of this book in stock.
     * @param author The author of the book.
     * @param edition The edition of the book.
     */
    public Book(String title, String publisher, String publishYear, String language, String genre, int price,
                int quantityInStock, String author, String edition)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock);
        setAuthor(author);
        setEdition(edition);
    }

    //------Set-methods------

    /**
     * Sets the author of the book.
     * If the input is empty, an
     * InputMismatchException will be
     * thrown from the validateString-method.
     * @param author The author of the book.
     */
    private void setAuthor(String author)
    {
        this.author = validateString(author);
    }

    /**
     * Sets the edition of the book.
     * If the input is empty, an
     * InputMismatchException will be
     * thrown from the validateString-method.
     * @param edition The edition of the book.
     */
    private void setEdition(String edition)
    {
        this.edition = validateString(edition);
    }

    //------Get-methods------

    /** Returns the author of the given book.
     * @return author A string containing the author of the given book.
     */
    public String getAuthor()
    {
        return this.author;
    }

    /** Returns the edition of the given book.
     * @return edition A string containing the edition of the given book.
     */
    public String getEdition()
    {
        return this.edition;
    }

    /**
     * Returns the title of the given book.
     * @return The title of the given book.
     */
    @Override
    public String getTitle()
    {
        return super.getTitle();
    }

    /**
     * Returns the publisher of the given book.
     *
     * @return publisher A string containing the publisher of the given book.
     */
    @Override
    public String getPublisher()
    {
        return super.getPublisher();
    }

    /**
     * Returns the year the given book was published.
     *
     * @return publishYear A string containing the year the given book was published.
     */
    @Override
    public String getPublishYear()
    {
        return super.getPublishYear();
    }

    /**
     * Returns the year the given book was published.
     *
     * @return publishYear A string containing the year the given book was published.
     */
    @Override
    public String getLanguage()
    {
        return super.getLanguage();
    }

    /**
     * Returns the genre of the given book.
     *
     * @return genre A string containing the genre of the given book.
     */
    @Override
    public String getGenre()
    {
        return super.getGenre();
    }

    /**
     * Returns the price of the given book.
     *
     * @return price An int representing the price of the given book, in NOK (Norwegian kroner).
     */
    @Override
    public int getPrice()
    {
        return super.getPrice();
    }

    /**
     * Returns the amount of the given book in stock.
     *
     * @return quantityInStock An int representing the amount of the given book in stock.
     */
    @Override
    public int getQuantityInStock()
    {
        return super.getQuantityInStock();
    }
}
