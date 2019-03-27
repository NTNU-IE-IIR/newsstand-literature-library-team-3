package Logic;

/**
 *  Represents a magazine. This class inherits from the periodical class.
 *
 * @author  Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 0.1 (2019.3.27)
 */

public class Magazine extends Periodical
{
    /**
     * The object contains
     * information about the magazine, such as Title, Publisher, Genre and
     * the number of publishments.
     *
     * @param title                         The title of the newspaper
     * @param publisher                     The publisher of the newspaper
     * @param publishYear                   The year of publishment
     * @param language                      The language used by the newspaper
     * @param genre                         The genre of the newspaper
     * @param price                         The price per newspaper
     * @param quantityInStock               The amount of newspapers left in stock
     * @param numberOfYearlyPublications    The number of yearly publications
     */
    public Magazine(String title, String publisher, String publishYear, String language, String genre,
                    int price, int quantityInStock, int numberOfYearlyPublications)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock, numberOfYearlyPublications);
    }
}
