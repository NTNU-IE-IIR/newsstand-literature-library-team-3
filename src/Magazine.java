/**
 *
 *
 * @author
 * @version
 */

public class Magazine extends Periodical
{
    public Magazine(String title, String publisher, String publishYear, String language, String genre,
                    int price, int quantity, int numberOfYearlyPublications)
    {
        super(numberOfYearlyPublications);
        setTitle(title);
        setPublisher(publisher);
        setPublishYear(publishYear);
        setLanguage(language);
        setGenre(genre);
        setPrice(price);
        setQuantity(quantity);
        setNumberOfYearlyPublications(numberOfYearlyPublications);

    }
}
