package UI;
import Logic.Magazine;

/**
 * This class is used to view and retrieve data about magazines in the literature register.
 * It extends the LiteratureView interface.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Gamnes Sneltvedt
 * @version 0.1 (2019.04.01)
 */

public class MagazineView implements LiteratureView
{
    private Magazine magazine;

    public MagazineView(Magazine magazine)
    {
        this.magazine = magazine;
    }

    /**
     * Used to collect all information about the magazine item as a string.
     *
     * @return all information about the magazine item as a string.
     */
    @Override
    public String show()
    {
        return "Title: " + this.magazine.getTitle() + "\n" +
                "Publisher: " + this.magazine.getPublisher() + "\n" +
                "Publish year: " + this.magazine.getPublishYear() + "\n" +
                "Language: " + this.magazine.getLanguage() + "\n" +
                "Genre: " + this.magazine.getGenre() + "\n" +
                "Price: " + this.magazine.getPrice() + "\n" +
                "Quantity in stock: " + this.magazine.getQuantityInStock() + "\n" +
                "Number of yearly publications: " + this.magazine.getNumberOfYearlyPublications();
    }

    /**
     * Used to collect the Title, Publisher and Price of the magazine item as a string.
     *
     * @return the Title, Publisher and Price of the magazine as a string.
     */
    @Override
    public String showLimited()
    {
        return "Title: " + this.magazine.getTitle() + "\n" +
                "Publisher: " + this.magazine.getPublisher() + "\n" +
                "Price: " + this.magazine.getPrice();
    }
}

