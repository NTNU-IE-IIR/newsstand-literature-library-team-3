package Logic;

/**
 *  Represents a magazine. This class inherits from the periodical class.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */

public class Magazine extends Periodical
{
    /**
     * The object contains
     * information about the magazine, such as Title, Publisher, Genre and
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
     * @param publicationDate               The date this magazine was published
     */
    public Magazine(String title, String publisher, String publishYear, String language, String genre,
                    int price, int quantityInStock, int numberOfYearlyPublications, String publicationDate)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock, numberOfYearlyPublications,
                publicationDate);
    }

    //----------Get-methods---------
    /**
     * Returns the title of the given magazine.
     * @return title A string containing the title of the given magazine.
     */
    @Override
    public String getTitle()
    {
        return super.getTitle();
    }

    /** Returns the publisher of the given magazine.
     * @return publisher A string containing the publisher of the given magazine.
     */
    @Override
    public String getPublisher()
    {
        return super.getPublisher();
    }

    /** Returns the year the given magazine was published.
     * @return publishYear A string containing the year the given magazine was published.
     */
    @Override
    public String getPublishYear()
    {
        return super.getPublishYear();
    }

    /** Returns the year the given magazine was published.
     * @return publishYear A string containing the year the given magazine was published.
     */
    @Override
    public String getLanguage()
    {
        return super.getLanguage();
    }

    /** Returns the genre of the given magazine.
     * @return genre A string containing the genre of the given magazine.
     */
    @Override
    public String getGenre()
    {
        return super.getGenre();
    }

    /** Returns the price of the given magazine.
     * @return price An int representing the price of the given magazine, in NOK (Norwegian kroner).
     */
    @Override
    public int getPrice()
    {
        return super.getPrice();
    }

    /** Returns the amount of the given magazine in stock.
     * @return quantityInStock An int representing the amount of the given magazine in stock.
     */
    @Override
    public int getQuantityInStock()
    {
        return super.getQuantityInStock();
    }

    /** Returns the publication date of the given magazine.
     * @return the publication date of the given magazine.
     */
    @Override
    public String getPublicationDate()
    {
        return super.getPublicationDate();
    }

    /** Returns the number of yearly publications of the magazine.
     * @return the number of yearly publications of the magazine.
     */
    @Override
    public int getNumberOfYearlyPublications()
    {
        return super.getNumberOfYearlyPublications();
    }
}
