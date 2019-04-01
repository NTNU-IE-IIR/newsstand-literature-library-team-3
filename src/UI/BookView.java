package UI;

import Logic.Book;

/**
 * Represents the viewer for books. Formats the requested information into a readable form
 * and returns it as a String.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version 0.1 (2019.04.01)
 */
public class BookView implements LiteratureView
{
    private Book book;

    /**
     * Constructor of the BookView-class.
     * @param book The book to be viewed.
     */
    public BookView(Book book)
    {
        this.book = book;
    }

    /**
     * Returns all the information of the book.
     * @return A String containing all the information of the book.
     */
    @Override
    public String show()
    {
        return  "Seriestitle: " + book.getSeriesTitle() + "\n" +
                "Title: " + book.getTitle() + "\n" +
                "Author:" + book.getAuthor() + "\n" +
                "Edition: " + book.getEdition() + "\n" +
                "Publisher: " + book.getPublisher() + "\n" +
                "Publish year: " + book.getPublishYear() + "\n" +
                "Language: " + book.getLanguage() + "\n" +
                "Genre: " + book.getGenre() + "\n" +
                "Price: " + book.getPrice() + "\n" +
                "Quantity in stock: " + book.getQuantityInStock() + "\n";
    }

    /**
     * Returns the title, publisher and price of the book.
     * @return A String containing the title, publisher and price of the book.
     */
    @Override
    public String showLimited()
    {
       return "Title: " + book.getTitle() + "\n" +
               "Publisher: " + book.getPublisher() + "\n" +
               "Price: " + book.getPrice() + "\n";
    }
}
