package UI;

import Logic.Book;

/**
 * Represents the viewer for books. Formats the requested information into a readable form
 * and returns it as a String.
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

    @Override
    public String show()
    {

    }

    @Override
    public String showRestricted()
    {

    }
}
