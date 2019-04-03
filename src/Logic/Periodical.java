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


    protected void setPublicationDate(String publicationDate)
    {
        this.publicationDate = setString(publicationDate);
    }

    protected void setNumberOfYearlyPublications(int numberOfYearlyPublications)
    {
       this.numberOfYearlyPublications = setInt(numberOfYearlyPublications);
    }

    public String getPublicationDate()
    {
        return publicationDate;
    }

    public int getNumberOfYearlyPublications()
    {
        return numberOfYearlyPublications;
    }
}
