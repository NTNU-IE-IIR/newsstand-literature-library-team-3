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

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setEdition(String edition)
    {
        this.edition = edition;
    }
}
