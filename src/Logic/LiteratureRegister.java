package Logic;

import Logic.Literature;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register of literature. The current version only holds a collection
 * of newspaper objects. The newspaper objects is stored in an ArrayList.
 *
 * @author Erlend Holseker, Arvin Khodabandeh, Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.06)
 */

public class LiteratureRegister
{

    private ArrayList<Literature> literatureCollection;
    private BookSeriesRegister bookSeriesRegister;

    /**
     * Creates a new registry to store different literature
     */
    public LiteratureRegister()
    {
        literatureCollection = new ArrayList<>();
    }

    /**
     * Adds new literature in the register.
     * If the given literature is a book, and the book is part of a bookseries,
     * the book will be added to the given bookseries.
     * @param literature The literature to be added to the register.
     * */
    public void addLiterature(Literature literature)
    {
        if(literature != null)
        {
            this.literatureCollection.add(literature);

            if (literature instanceof Book)
            {
                if (((Book) literature).isPartOfBookSeries())
                {
                    addBookToBookSeries((Book) literature);
                }
            }
        }
    }

    /**
     * Adds a book to a bookseries. If the bookseries the
     * book belongs to already exists in the application,
     * the book will be added to that bookseries.
     * If the bookseries does not exist in the application,
     * the new bookseries will be created, and the book will
     * be added to this bookseries.
     * @param book The book to be added to the bookseries.
     */
    private void addBookToBookSeries(Book book)
    {
        Iterator<BookSeries> bookSeriesRegIt = this.bookSeriesRegister.getIterator();
        boolean bookSeriesFound = false;
        String key = book.getTitle();
        while (bookSeriesRegIt.hasNext())
        {
            if (!bookSeriesFound)
            {
                BookSeries bookSeries = bookSeriesRegIt.next();
                if (bookSeries.exists(key))
                {
                    bookSeries.addBook(book);
                    bookSeriesFound = true;
                }
            }
        }

        if (!bookSeriesFound)
        {
            BookSeries newBookSeries = new BookSeries(book.getSeriesTitle());
            newBookSeries.addBook(book);
        }
    }

    /**
     * Returns an Iterator for the literature collection.
     * @return An Iterator for the ArrayList containing the literature objects.
     */
    public Iterator<Literature> getIterator()
    {
        return this.literatureCollection.iterator();
    }

    /**
     * Returns an ArrayList which contains a collection of literature.
     * @return An ArrayList which contains a collection of literature objects.
     */
    public ArrayList<Literature> getAllLiterature()
    {
        return this.literatureCollection;
    }

    /**
     * Returns the number of literature in the register.
     * @return The number of literature in the register.
     * */

    public int getNumberOfLiterature()
    {
        int numberOfLiterature = literatureCollection.size();
        return numberOfLiterature;
    }
}
