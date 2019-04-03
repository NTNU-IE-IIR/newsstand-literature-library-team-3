package Logic;

import Logic.Literature;

/**
 * A periodical is a type of literature that is published according to a regular schedule.
 * This class inherits from the class Logic.Literature
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.25)
 */

public abstract class Periodical extends Literature
{
    private String publicationDate;
    private int numberOfYearlyPublications;


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
