/**
 * A periodical is a type of literature that is published according to a regular schedule.
 * This class inherits from the class Literature
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.25)
 */

public abstract class Periodical extends Literature
{
    private int numberOfYearlyPublications;


    public Periodical(String title, String publisher, String publishYear, String language, String genre,
                      int price, int quantityInStock,  int numberOfYearlyPublications)
    {
        super(title, publisher, publishYear, language, genre,
                price, quantityInStock);
        setNumberOfYearlyPublications(numberOfYearlyPublications);

    }


    /**
     * Set the number of yearly publications of the periodical
     * @param numberOfYearlyPublications the number of yearly publications of the periodical
     */
    protected void setNumberOfYearlyPublications(int numberOfYearlyPublications)
    {
        this.numberOfYearlyPublications = numberOfYearlyPublications;
    }

    /**
     * Get the number of yearly publications of the periodical
     * @return the number of yearly publications of the periodical
     */
    protected int getNumberOfYearlyPublications()
    {
        return this.numberOfYearlyPublications;
    }

}
