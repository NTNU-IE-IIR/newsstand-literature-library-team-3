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
     * Used to display all information about the magazine item.
     */
    public void show()
    {
        "Title: " + this.magazine.getTitle() + "\n" +
                "Publisher: " + this.publisher + "\n" +
                "Publish year: " + this.publishYear + "\n" +
                "Language: " + this.language + "\n" +
                "Genre: " + this.genre + "\n" +
                "Price: " + this.price + "\n" +
                "Quantity in stock: " + this.quantityInStock;
    }

    /**
     * Used to display Title, Publisher and Price of the magazine item.
     */
    public void showRestricted()
    {

    }


}

