/**
 * Stores information about "Newspaper" objects, such as
 * Title, Publisher, Genre and the number of publishments.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.06)
 */

public class Newspaper extends Periodical
{
    private String title;
    private String publisher;
    private String publishYear;
    private String language;
    private String genre;
    private int price;
    private int quantityInStock;
    private int numberOfYearlyPublications;


    /**
     * The object contains
     * information about the newspaper, such as Title, Publisher, Genre and
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
    public Newspaper(String title, String publisher, String publishYear, String language, String genre,
                     int price, int quantityInStock, int numberOfYearlyPublications)
    {
        super(title, publisher, publishYear, language, genre, price, quantityInStock, numberOfYearlyPublications);
    }


    /**
     * Returns a string that contains the title, publisher, genre and number
     * of publishments of the newspaper.
     *
     * @return A string containing title, publisher, genre and number of publishments.
     */
    public String getAllInfoAsString()
    {
        return "Title: " + this.title + "\n" +
                "Publisher: " + this.publisher + "\n" +
                "Genre: " + this.genre + "\n" +
                "Number of publications per year: " + this.numberOfYearlyPublications;
    }
}
