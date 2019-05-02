package Logic;

/**
 * Stores information about "Logic.Newspaper" objects, such as
 * Title, Publisher, Genre and the number of publications.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */

public class Newspaper extends Periodical
{

    /**
     * The object contains
     * information about the newspaper, such as Title, Publisher, Genre and
     * the number of publishments.
     *
     * @param title                         The title of the newspaper
     * @param publisher                     The publisher of the newspaper
     * @param publishYear                   The year of publishment
     * @param language                      The language used by the newspaper
     * @param genre                         The genre of the newspaper
     * @param price                         The price per newspaper
     * @param quantityInStock               The amount of newspapers left in stock
     * @param numberOfYearlyPublications    The number of yearly publications
     * @param publicationDate               The date this newspaper was published
     */
    public Newspaper(String title, String publisher, String publishYear, String language, String genre,
                     int price, int quantityInStock, int numberOfYearlyPublications, String publicationDate)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock, numberOfYearlyPublications,
                publicationDate);
    }

    //----------Get-methods---------
    /**
     * Returns the title of the given newspaper.
     * @return title A string containing the title of the given newspaper.
     */
    public String getTitle()
    {
        return super.getTitle();
    }

    /** Returns the publisher of the given newspaper.
     * @return publisher A string containing the publisher of the given newspaper.
     */
    public String getPublisher()
    {
        return super.getPublisher();
    }

    /** Returns the year the given newspaper was published.
     * @return publishYear A string containing the year the given newspaper was published.
     */
    public String getPublishYear()
    {
        return super.getPublishYear();
    }

    /** Returns the year the given newspaper was published.
     * @return publishYear A string containing the year the given newspaper was published.
     */
    public String getLanguage()
    {
        return super.getLanguage();
    }

    /** Returns the genre of the given newspaper.
     * @return genre A string containing the genre of the given newspaper.
     */
    public String getGenre()
    {
        return super.getGenre();
    }

    /** Returns the price of the given newspaper.
     * @return price An int representing the price of the given newspaper, in NOK (Norwegian kroner).
     */
    public int getPrice()
    {
        return super.getPrice();
    }

    /** Returns the amount of the given newspaper in stock.
     * @return quantityInStock An int representing the amount of the given newspaper in stock.
     */
    public int getQuantityInStock()
    {
        return super.getQuantityInStock();
    }

    /** Returns the publication date of the given newspaper.
     * @return the publication date of the given newspaper.
     */
    public String getPublicationDate()
    {
        return super.getPublicationDate();
    }

    /** Returns the number of yearly publications of the newspaper.
     * @return the number of yearly publications of the newspaper.
     */
    public int getNumberOfYearlyPublications()
    {
        return super.getNumberOfYearlyPublications();
    }
}
