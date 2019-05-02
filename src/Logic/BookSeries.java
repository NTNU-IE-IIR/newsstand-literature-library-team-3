package Logic;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Represents a bookseries.
 * The bookseries class contains a collection of books which are
 * members of the same bookseries.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */

public class BookSeries extends SalesItem
{
    private String title;
    private HashMap<String,Book> bookSeries;

    /**
     * Constructor of a BookSeries-object.
     *
     * @param seriesTitle The title of the bookseries.
     * @param price The price of the bookseries.
     * @param quantityOfSeries The quantity of this bookseries in stock.
     */
    public BookSeries(String seriesTitle, int price, int quantityOfSeries)
    {
        super(price, quantityOfSeries);
        this.title = seriesTitle;
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
            int newPrice = getPrice() + book.getPrice();
            setPrice(newPrice);
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
    public String getTitle()
    {
        return this.title;
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
        if (this.title.equals(seriesTitle))
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
    /**
     * Reduces the current quantity of a specific book series by one.
     * This will also reduce the quantity of the books in the book series
     * by one.
     */
    @Override
    public void reduceQuantityByOne()
    {
        Iterator<Book> bookSeriesIterator = getIterator();
        while(bookSeriesIterator.hasNext())
        {
            Book book = bookSeriesIterator.next();
            book.reduceQuantityByOne();
        }
        super.reduceQuantityByOne();
    }

    /**
     * Returns an iterator for the values of the book series.
     * @return an iterator for the values of the book series.
     */
    public Iterator getIterator()
    {
        return this.bookSeries.values().iterator();
    }
}