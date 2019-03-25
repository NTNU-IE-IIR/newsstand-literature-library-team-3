/**
 * Represents a book. The class inherits from the literature-class.
 * The book-class contains the following information about a book:
 * Title, publisher, publish-year, language, genre, price, quantity in stock, author and edition.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @verion 0.1 (2019.03.25)
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
        if (author != null )
        {
            if (!author.isEmpty())
            {
                this.author = author;
            }
        }
        else
        {
            this.author = "UNDEFINED";
        }
    }


    /**
     * Sets the edition of the book.
     * If the input is empty, the edition will
     * be set to "UNDEFINED".
     * @param edition The edition of the book.
     */
    private void setEdition(String edition)
    {
        if (edition != null )
        {
            if (!edition.isEmpty())
            {
                this.edition = edition;
            }
        }
        else
        {
            this.edition = "UNDEFINED";
        }
    }

    //------Get-methods------

    /** Returns the author of the given book.
     * @return author A string containing the author of the given book.
     */
    public String getAuthor()
    {
        return author;
    }

    /** Returns the edition of the given book.
     * @return edition A string containing the edition of the given book.
     */
    public String getEdition()
    {
        return edition;
    }
}
