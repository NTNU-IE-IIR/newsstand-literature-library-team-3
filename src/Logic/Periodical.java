package Logic;

/**
 * A periodical is a type of literature that is published according to a regular schedule.
 * This class inherits from the class Logic.Literature
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */

public abstract class Periodical extends Literature
{
    private String publicationDate;
    private int numberOfYearlyPublications;


    /**
     * Constructor of the Periodical-class.
     *
     * @param title The title of the periodical.
     * @param publisher The publisher of the periodical.
     * @param publishYear The year the periodical was published.
     * @param language The language the periodical is written in.
     * @param genre The genre of the periodical.
     * @param price The price of the periodical.
     * @param quantityInStock The quantity of this periodical in stock.
     * @param numberOfYearlyPublications The number of yearly publications of this periodical.
     * @param publicationDate The date the periodical was published.
     */
    public Periodical(String title, String publisher, String publishYear, String language, String genre,
                      int price, int quantityInStock, int numberOfYearlyPublications, String publicationDate)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock);
        setNumberOfYearlyPublications(numberOfYearlyPublications);
        setPublicationDate(publicationDate);
    }

    /**
     * Sets the publication date of the periodical.
     *
     * @param publicationDate the publication date of the periodical.
     */
    protected void setPublicationDate(String publicationDate)
    {
        this.publicationDate = setString(publicationDate);
    }

    /**
     * Sets the number of yearly publications of the periodical.
     *
     * @param numberOfYearlyPublications the number of yearly publications of the periodical.
     */
    protected void setNumberOfYearlyPublications(int numberOfYearlyPublications)
    {
        this.numberOfYearlyPublications = setInt(numberOfYearlyPublications);
    }

    /**
     * Returns the publication date of the given periodical.
     *
     * @return the publication date of the given periodical.
     */
    public String getPublicationDate()
    {
        return publicationDate;
    }

    /**
     * Returns the number of yearly publications of the periodical.
     *
     * @return the number of yearly publications of the periodical.
     */
    public int getNumberOfYearlyPublications()
    {
        return numberOfYearlyPublications;
    }
}
