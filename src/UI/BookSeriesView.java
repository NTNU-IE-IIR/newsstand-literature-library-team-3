package UI;
import Logic.Book;
import Logic.BookSeries;
import java.util.Iterator;

/**
 * Represents the viewer for book series. Formats the requested information into a readable form
 * and returns it as a String.
 * Implements the SalesItemView interface.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public class BookSeriesView implements SalesItemView
{
    private BookSeries bookSeries;

    /**
     * Constructor of the BookSeriesView-class.
     *
     * @param bookSeries The book series to be viewed.
     */
    public BookSeriesView(BookSeries bookSeries)
    {
        this.bookSeries = bookSeries;
    }

    /**
     * Returns all the information of the book series.
     *
     * @return A String containing all the information of the book series.
     */
    @Override
    public String show()
    {
        Iterator<Book> bookSeriesIt = bookSeries.getIterator();

        String returnString = ( "Title            : " + bookSeries.getTitle() + "\n" +
                                "Price            : " + bookSeries.getPrice() + "\n" +
                                "Quantity in stock: " + bookSeries.getQuantityInStock() + "\n");
        if (bookSeriesIt.hasNext())
        {
            returnString += ("Books in the collection: \n");
            while (bookSeriesIt.hasNext())
            {
                Book book = bookSeriesIt.next();
                returnString += ("Title : " + book.getTitle() + "\n" +
                                 "Author: " + book.getAuthor() + "\n" +
                                 "Genre : " + book.getGenre() + "\n\n");
            }

        }
        return returnString;
    }


    /**
     * Returns the title, price and quantity of the book series.
     *
     * @return A String containing the title, price and quantity of the book series.
     */
    @Override
    public String showLimited()
    {
        return  "Title            : " + bookSeries.getTitle() + "\n" +
                "Price            : " + bookSeries.getPrice() + "\n" +
                "Quantity in stock: " + bookSeries.getQuantityInStock() + "\n";

    }
}
