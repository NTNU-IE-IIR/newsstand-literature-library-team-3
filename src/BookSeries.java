import java.util.ArrayList;

/**
 * Represents a bookseries.
 * The bookseries class contains a collection of books which are
 * members of the same bookseries.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.25)
 */

public class BookSeries
{
    private String seriesTitle;
    private ArrayList<Book> bookSeries;

    public BookSeries(String seriesTitle)
    {
        this.seriesTitle = seriesTitle;
        bookSeries = new ArrayList<>();
    }

    /**
     * Adds a book to the bookseries.
     * @param book The book to be added in the bookseries.
     */
    public void addBook(Book book)
    {
        if (book != null)
        {
            this.bookSeries.add(book);
        }
    }

    /**
     * Removes a book from the bookseries.
     * @param book The book to be removed from the bookseries.
     */
    public void removeBook(Book book)
    {
        if (this.bookSeries.contains(book))
        {
            this.bookSeries.remove(book);
        }
    }

    /**
     * Returns an ArrayList containing all books in the bookseries.
     * @return An ArrayList containing all books in the bookseries.
     */
    public ArrayList<Book> getBookSeries()
    {
        return this.bookSeries;
    }

    /**
     * Returns the title of the bookseries.
     * @return The title of the bookseries.
     */
    public String getSeriesTitle()
    {
        return this.seriesTitle;
    }
}