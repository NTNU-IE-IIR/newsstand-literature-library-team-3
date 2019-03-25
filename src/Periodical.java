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


    public Periodical(int numberOfYearlyPublications)
    {
        super();
        setNumberOfYearlyPublications(numberOfYearlyPublications);

    }

    protected void setNumberOfYearlyPublications(int numberOfYearlyPublications)
    {
        this.numberOfYearlyPublications = numberOfYearlyPublications;
    }

}
