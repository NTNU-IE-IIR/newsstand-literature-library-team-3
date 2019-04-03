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

}
