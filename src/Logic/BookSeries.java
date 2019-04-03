package Logic;

import java.util.HashMap;

/**
 * Represents a bookseries.
 * The bookseries class contains a collection of books which are
 * members of the same bookseries.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version 0.2 (2019.04.03)
 */

public class BookSeries
{
    private String seriesTitle;
    private HashMap<String,Book> bookSeries;

    public BookSeries(String seriesTitle)
    {
        this.seriesTitle = seriesTitle;
        bookSeries = new HashMap<>();
    }

    /**
     * Adds a book to the bookseries.
     * @param book The book to be added in the bookseries.
     */
    public void addBook(Book book)
    {
        if (book != null)
        {
            this.bookSeries.put(book.getTitle(), book);
        }
    }

    /**
     * Removes a book from the bookseries.
     * @param book The book to be removed from the bookseries.
     */
    public void removeBook(Book book)
    {
        if (this.bookSeries.containsValue(book))
        {
            this.bookSeries.remove(book);
        }
    }

    /**
     * Returns an HashMap containing all books in the bookseries.
     * @return An HashMap containing all books in the bookseries.
     */
    public HashMap<String ,Book> getBookSeries()
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

    /**
     * Checks if the bookseries already exists in the application.
     * Returns true if the bookseries already exists, false if not.
     * @param seriesTitle The title of the bookseries.
     * @return True if the bookseries already exists, false if not.
     */
    public boolean exists(String seriesTitle)
    {
        boolean result = false;
        if (this.seriesTitle.equals(seriesTitle))
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
}