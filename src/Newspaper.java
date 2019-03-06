/**
 * Stores information about "Newspaper" objects, such as
 * Title, Publisher, Genre and the number of publishments.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 1.0 (2019.03.06)
 */

public class Newspaper
{
    private String title;
    private String publisher;
    private String genre;
    private int numberOfPublishments;


    /**
     * The object contains
     * information about the newspaper, such as Title, Publisher, Genre and
     * the number of publishments.
     * @param title The title of the newspaper
     * @param publisher The publisher of the newspaper
     * @param genre The genre of the newspaper
     * @param numberOfPublishments The number of publishments of the newspaper
     */
    public Newspaper(String title, String publisher, String genre, int numberOfPublishments)
    {
        setTitle(title);
        setPublisher(publisher);
        setGenre(genre);
        setNumberOfPublishments(numberOfPublishments);
    }

    /**
     * The object contains nformation about the newspaper, such as Title, Publisher and genre.
     * The number of publishments will be set to 0 by default.
     * @param title The title of the newspaper
     * @param genre The genre of the newspaper
     * @param publisher The publisher of the newspaper.
     */
    public Newspaper(String title, String publisher, String genre)
    {
        setTitle(title);
        setPublisher(publisher);
        setGenre(genre);
        this.numberOfPublishments = 0;
    }

    /**
     * The object contains information about the newspaper,
     * such as title.
     * The genre and publisher are left blank.
     * Number of publishments will be set to 0 by default.
     * @param title The title of the newspaper
     */
    public Newspaper(String title)
    {
        setTitle(title);
        this.publisher = ("");
        this.genre = ("");
        this.numberOfPublishments = 0;
    }

    /**
     * Get the title of the object
     * @return title
     */

    public String getTitle()
    {
        return this.title;
    }

    /**
     * Get the genre of the object
     * @return genre
     */
    public String getGenre()
    {
         return this.genre;
    }

    /**
     * Get the number of publishments of the object
     * @return  number of publishments
     */
    public int getNumberOfPublishments()
    {
        return this.numberOfPublishments;
    }

    /**
     * Get the publisher of the object
     * @return  publisher
     */
    public String getPublisher()
    {
        return this.publisher;
    }

    /**
     *  Set the genre of the object
     * @param genre The genre of the newspaper
     */
    private void setGenre(String genre)
    {
        if(genre != null && !genre.isEmpty())
        {
            this.genre = genre;
        } else {
            this.genre = "UNDEFINED";
        }    }

    /**
     * Set the number of publishments of the newspaper.
     * If a negative number is chosen, the number is set to 0.
     * @param numberOfPublishments The number of publishments
     *                             of the newspaper
     */
    private void setNumberOfPublishments(int numberOfPublishments)
    {
        if(numberOfPublishments >= 0)
        {
            this.numberOfPublishments = numberOfPublishments;
        } else {
            this.numberOfPublishments = 0;
        }
    }

    /**
     * Set the publisher of the newspaper
     * @param publisher The publisher of the newspaper
     */
    private void setPublisher(String publisher)
    {
        if(publisher != null && !publisher.isEmpty())
        {
            this.publisher = publisher;
        } else {
            this.publisher = "UNDEFINED";
        }
    }

    /**
     * Set the title of the newspaper
     * @param title The title of the newspaper
     */
    private void setTitle(String title)
    {
        if(title != null && !title.isEmpty())
        {
            this.title = title;
        } else {
            this.title = "UNDEFINED";
        }
    }

    /**
     * Returns a string that contains the title, publisher, genre and number
     * of publishments of the newspaper.
     *
     * @return A string containing title, publisher, genre and number of publishments.
     */
    public String getAllInfoAsString()
    {
        return  "Title: " + this.title + "\n" +
                "Publisher: " + this.publisher + "\n" +
                "Genre: " + this.genre + "\n" +
                "Number of publishments: " + this.numberOfPublishments;
    }
}
