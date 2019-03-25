/**
 *  The Magazine class makes objects of the type "Magazine". This class
 *  inherits from the "Periodical" class. It does not contain any fields on its own.
 *
 * @author  Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.25)
 */

public class Magazine extends Periodical
{
    public Magazine(String title, String publisher, String publishYear, String language, String genre,
                    int price, int quantityInStock, int numberOfYearlyPublications)
    {
        super(title, publisher, publishYear, language, genre,
        price, quantityInStock, numberOfYearlyPublications);

    }
}
