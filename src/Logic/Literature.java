package Logic;

/**
 * The literature-class contains information that is common for all literature.
 * It is not meant to create instances of type Logic.Literature.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */

public abstract class Literature extends SalesItem
{
    private String title;
    private String publisher;
    private String publishYear;
    private String language;
    private String genre;

    /**
     * Constructor of Literature-class.
     *
     * @param title The title of the literature.
     * @param publisher The publisher of the literature.
     * @param publishYear The year the literature was published.
     * @param language The language the literature is written in.
     * @param genre The genre of the literature.
     * @param price The price of the literature.
     * @param quantityInStock The quantity of this literature in stock.
     */
    public Literature(String title, String publisher, String publishYear, String language, String genre, int price, int quantityInStock)
    {
        super(price, quantityInStock);
        setTitle(title);
        setPublisher(publisher);
        setPublishYear(publishYear);
        setLanguage(language);
        setGenre(genre);
    }

    //------Set-methods------

    /**
     * Sets the title of the given literature.
     * If the input is empty, an
     * InputMismatchException will be
     * thrown from the validateString-method.
     *
     * @param title The title of the given literature.
     */
    protected void setTitle(String title)
    {
        this.title = validateString(title);
    }

    /**
     * Sets the publisher of the given literature.
     * If the input is empty, an
     * InputMismatchException will be
     * thrown from the validateString-method.
     *
     * @param publisher The publisher of the given literature.
     */
    protected void setPublisher(String publisher)
    {
        this.publisher = validateString(publisher);
    }

    /**
     * Sets the year the given literature was published.
     * If the input is empty, an
     * InputMismatchException will be
     * thrown from the validateString-method.
     *
     * @param publishYear The year the given literature was published.
     */
    protected void setPublishYear(String publishYear)
    {
        this.publishYear = validateString(publishYear);
    }

    /**
     * Sets the language the given literature is written in.
     * If the input is empty, an
     * InputMismatchException will be
     * thrown from the validateString-method.
     *
     * @param language The language the given literature is written in.
     */
    protected void setLanguage(String language)
    {
        this.language = validateString(language);
    }

    /**
     * Sets the genre of the the given literature.
     * If the input is empty, an
     * InputMismatchException will be
     * thrown from the validateString-method.
     *
     * @param genre The genre of the given literature.
     */
    protected void setGenre(String genre)
    {
        this.genre = validateString(genre);
    }


    //------Get-methods------

    /**
     * Returns the title of the given literature.
     *
     * @return title A string containing the title of the given literature.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the publisher of the given literature.
     *
     * @return publisher A string containing the publisher of the given literature.
     */
    public String getPublisher()
    {
        return publisher;
    }

    /**
     * Returns the year the given literature was published.
     *
     * @return publishYear A string containing the year the given literature was published.
     */
    public String getPublishYear()
    {
        return publishYear;
    }

    /**
     * Returns the year the given literature was published.
     *
     * @return publishYear A string containing the year the given literature was published.
     */
    public String getLanguage()
    {
        return language;
    }

    /**
     * Returns the genre of the given literature.
     *
     * @return genre A string containing the genre of the given literature.
     */
    public String getGenre()
    {
        return genre;
    }

}
