package UI;
import Logic.Magazine;

/**
 * This class is used to view and retrieve data about magazines in the literature register.
 * It implements the SalesItemView interface.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */

public class MagazineView implements SalesItemView
{
    private Magazine magazine;

    /**
     * Constructor of the MagazineView.
     *
     * @param magazine The magazine to be viewed.
     */
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
        return "Title                         : " + this.magazine.getTitle() + "\n" +
                "Publisher                    : " + this.magazine.getPublisher() + "\n" +
                "Publication date             : " + this.magazine.getPublicationDate() + "\n" +
                "Publish year                 : " + this.magazine.getPublishYear() + "\n" +
                "Language                     : " + this.magazine.getLanguage() + "\n" +
                "Genre                        : " + this.magazine.getGenre() + "\n" +
                "Price                        : " + this.magazine.getPrice() + "\n" +
                "Quantity in stock            : " + this.magazine.getQuantityInStock() + "\n" +
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
        return "Title            : " + this.magazine.getTitle() + "\n" +
                "Publisher       : " + this.magazine.getPublisher() + "\n" +
                "Publication date: " + this.magazine.getPublicationDate() + "\n" +
                "Price           : " + this.magazine.getPrice();
    }
}

