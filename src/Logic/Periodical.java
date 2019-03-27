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
    private int numberOfYearlyPublications;


    public Periodical(String title, String publisher, String publishYear, String language, String genre,
                      int price, int quantityInStock, int numberOfYearlyPublications)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock);
        setNumberOfYearlyPublications(numberOfYearlyPublications);


    }



    protected void setNumberOfYearlyPublications(int numberOfYearlyPublications)
    {
        if(numberOfYearlyPublications >= 0)
        {
            this.numberOfYearlyPublications = numberOfYearlyPublications;
        }
        else
        {
            this.numberOfYearlyPublications = 0;
        }
    }


    public int getNumberOfYearlyPublications()
    {
        return numberOfYearlyPublications;
    }

    /**
     * Returns a string that contains the title, publisher, genre and number
     * of publishments of the newspaper.
     *
     * @return A string containing title, publisher, genre and number of publishments.
     */
    @Override
    public String getAllInfoAsString()
    {
        return super.getAllInfoAsString() +
                "Number of publications per year: " + this.numberOfYearlyPublications;
    }
}
