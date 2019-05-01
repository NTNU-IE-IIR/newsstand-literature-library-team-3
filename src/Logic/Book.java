package Logic;

import java.util.InputMismatchException;

/**
 * Represents a book. The class inherits from the literature-class.
 * The book-class contains the following information about a book:
 * Title, publisher, publish-year, language, genre, price, quantity in stock, author and edition.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version 0.2 (2019.04.03)
 */

public class Book extends Literature
{
    private String author;
    private String edition;


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
     * If the input is empty, the author will
     * be set to "UNDEFINED".
     * @param author The author of the book.
     */
    private void setAuthor(String author)
    {
        this.author = setString(author);
    }

    /**
     * Sets the edition of the book.
     * If the input is empty, the edition will
     * be set to "UNDEFINED".
     * @param edition The edition of the book.
     */
    private void setEdition(String edition)
    {
        this.edition = setString(edition);
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

    public String getTitle()
    {
        return super.getTitle();
    }

    /**
     * Returns the publisher of the given book.
     *
     * @return publisher A string containing the publisher of the given book.
     */
    public String getPublisher()
    {
        return super.getPublisher();
    }

    /**
     * Returns the year the given book was published.
     *
     * @return publishYear A string containing the year the given book was published.
     */
    public String getPublishYear()
    {
        return super.getPublishYear();
    }

    /**
     * Returns the year the given book was published.
     *
     * @return publishYear A string containing the year the given book was published.
     */
    public String getLanguage()
    {
        return super.getLanguage();
    }

    /**
     * Returns the genre of the given book.
     *
     * @return genre A string containing the genre of the given book.
     */
    public String getGenre()
    {
        return super.getGenre();
    }

    /**
     * Returns the price of the given book.
     *
     * @return price An int representing the price of the given book, in NOK (Norwegian kroner).
     */
    public int getPrice()
    {
        return super.getPrice();
    }

    /**
     * Returns the amount of the given book in stock.
     *
     * @return quantityInStock An int representing the amount of the given book in stock.
     */
    public int getQuantityInStock()
    {
        return super.getQuantityInStock();
    }
}
