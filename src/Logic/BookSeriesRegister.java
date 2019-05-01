package Logic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A register to hold all BookSeries. Used to add or remove Book-objects from a BookSeries.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version 0.2 (2019.04.03)
 */
public class BookSeriesRegister
{
    private ArrayList<BookSeries> bookSeriesCollection;

    /**
     * Creates a register to store different BookSeries-objects.
     */
    public BookSeriesRegister()
    {
        bookSeriesCollection = new ArrayList<>();
    }

    /**
     * Returns an Iterator for the bookseries collection.
     * @return An Iterator for the ArrayList containing the bookseries objects.
     */
    public Iterator<BookSeries> getIterator()
    {
        return this.bookSeriesCollection.iterator();
    }

    /**
     * Adds a bookseries to the register.
     * @param bookSeries The bookseries to be added to the register.
     */
    public void addBookSeries(BookSeries bookSeries)
    {
        if (bookSeries != null)
        {
            this.bookSeriesCollection.add(bookSeries);
        }
    }

    /**
     * Removes a given bookseries from the bookseries register.
     * If the register contains the given bookseries, the
     * bookseries will be removed, and boolean true will be returned.
     * If the register does not contain the given bookseries,
     * hence the bookseries will not be removed, and boolean false will be returned.
     *
     * @param bookSeries The bookseries to be removed from the register.
     * @return true if the bookseries was successfully removed,
     *         false if not.
     */
    public boolean removeBookSeries(BookSeries bookSeries)
    {
        boolean success = false;

        if (this.bookSeriesCollection.contains(bookSeries))
        {
            this.bookSeriesCollection.remove(bookSeries);
            success = true;
        }

        return success;
    }

}
