package UI;
import Logic.Book;
import Logic.BookSeries;
import java.util.Iterator;

public class BookSeriesView implements SalesItemView
{
    private BookSeries bookSeries;

    public BookSeriesView(BookSeries bookSeries)
    {
        this.bookSeries = bookSeries;
    }

    @Override
    public String show()
    {
        Iterator<Book> bookSeriesIt = bookSeries.getIterator();

        String returnString = ("Title: " + bookSeries.getTitle() + "\n" +
                "Price: " + bookSeries.getPrice() + "\n" +
                "Quantity in stock: " + bookSeries.getQuantityInStock() + "\n");
        if (bookSeriesIt.hasNext())
        {
            returnString += ("Books in the collection: \n");
            while (bookSeriesIt.hasNext())
            {
                Book book = bookSeriesIt.next();
                returnString += ("Title: " + book.getTitle() + "\n" +
                        "Author: " + book.getAuthor() + "\n" +
                        "Genre: " + book.getGenre() + "\n" + "\n");
            }

        }
        return returnString;
    }

    @Override
    public String showLimited()
    {
        return "Title: " + bookSeries.getTitle() + "\n" +
                "Price: " + bookSeries.getPrice() + "\n" +
                "Quantity in stock: " + bookSeries.getQuantityInStock();

    }
}
