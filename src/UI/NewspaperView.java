package UI;
import Logic.Newspaper;

/**
 * This class is used to view and retrieve data about newspapers in the literature register.
 * It implements the SalesItemView interface.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public class NewspaperView implements SalesItemView
{
    Newspaper newspaper;

    /**
     * Constructor of the NewspaperView.
     *
     * @param newspaper The newspaper to be viewed.
     */
    public NewspaperView(Newspaper newspaper)
    {
        this.newspaper = newspaper;
    }

    /**
     * Used to collect all information about the newspaper item as a string.
     *
     * @return all information about the newspaper item as a string.
     */
    @Override
    public String show()
    {
        return "Title: " + this.newspaper.getTitle() + "\n" +
                "Publisher: " + this.newspaper.getPublisher() + "\n" +
                "Publish date: " + this.newspaper.getPublicationDate() + "\n" +
                "Publish year: " + this.newspaper.getPublishYear() + "\n" +
                "Language: " + this.newspaper.getLanguage() + "\n" +
                "Genre: " + this.newspaper.getGenre() + "\n" +
                "Price: " + this.newspaper.getPrice() + "\n" +
                "Quantity in stock: " + this.newspaper.getQuantityInStock() + "\n" +
                "Number of yearly publications: " + this.newspaper.getNumberOfYearlyPublications();
    }

    /**
     * Used to collect the Title, Publisher and Price of the newspaper item as a string.
     *
     * @return the Title, Publisher and Price of the newspaper item as a string.
     */
    @Override
    public String showLimited()
    {
        return "Title: " + this.newspaper.getTitle() + "\n" +
                "Publisher: " + this.newspaper.getPublisher() + "\n" +
                "Publication date: " + this.newspaper.getPublicationDate() + "\n" +
                "Price: " + this.newspaper.getPrice();
    }
}
