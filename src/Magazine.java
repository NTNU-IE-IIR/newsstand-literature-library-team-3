/**
 *  Represents a magazine. This class inherits from the periodical class.
 *
 * @author  Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 0.1 (2019.3.27)
 */

public class Magazine extends Periodical
{
    public Magazine(String title, String publisher, String publishYear, String language, String genre,
                    int price, int quantityInStock, int numberOfYearlyPublications)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock, numberOfYearlyPublications);
    }
}
