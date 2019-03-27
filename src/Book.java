/**
 * Represents a book. The class inherits from the literature-class.
 * The book-class contains the following information about a book:
 * Title, publisher, publish-year, language, genre, price, quantity in stock, author and edition.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.25)
 */

public class Book extends Literature
{
    private String author;
    private String edition;
    private String seriesTitle;

    private boolean partOfBookSeries;

    public Book(String title, String publisher, String publishYear, String language, String genre, int price,
                int quantityInStock, String author, String edition, String seriesTitle)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock);
        setAuthor(author);
        setEdition(edition);
        setSeriesTitle(seriesTitle);
        setPartOfBookSeries();
    }

    //------Set-methods------

    /**
     * Sets the author of the book.
     * If the input is empty, the author will
     * be set to "UNDEFINED".
     * @param author The author of the book.
     */
    private void setAuthor(String author)
    {
        this.author = setString(author);
    }

    /**
     * Sets the edition of the book.
     * If the input is empty, the edition will
     * be set to "UNDEFINED".
     * @param edition The edition of the book.
     */
    private void setEdition(String edition)
    {
        this.edition = setString(edition);
    }

    /**
     * Sets the title of the bookseries the book is part of.
     * If the input is empty, the series-title will
     * be set to "UNDEFINED".
     * @param seriesTitle The title of the bookseries the book is part of.
     */
    private void setSeriesTitle(String seriesTitle)
    {
        this.seriesTitle = setString(seriesTitle);
    }

    /**
     * Sets the boolean field "partOfBookSeries".
     * If the book is not a part of a bookseries,
     * which means that the "seriesTitle"-field will
     * contain "UNDEFINED",
     * the "partOfBookSeries"-field will be set to false.
     * If not, it will be set to true.
     */
    private void setPartOfBookSeries()
    {
        this.partOfBookSeries = false;

        if (this.seriesTitle != "UNDEFINED")
        {
            this.partOfBookSeries = true;
        }
    }

    //------Get-methods------

    /** Returns the author of the given book.
     * @return author A string containing the author of the given book.
     */
    public String getAuthor()
    {
        return this.author;
    }

    /** Returns the edition of the given book.
     * @return edition A string containing the edition of the given book.
     */
    public String getEdition()
    {
        return this.edition;
    }

    /**
     * Returns the title of the bookseries the book is part of.
     * @return The title of the bookseries the book is part of.
     */
    public String getSeriesTitle()
    {
        return this.seriesTitle;
    }

    /**
     * Returns a boolean value representing whether
     * the book is part of a bookseries or not.
     * True if the book is part of a bookseries,
     * false if not.
     * @return A boolean value representing whether the book is part of a bookseries or not.
     */
    public boolean isPartOfBookSeries()
    {
        return this.partOfBookSeries;
    }
}
