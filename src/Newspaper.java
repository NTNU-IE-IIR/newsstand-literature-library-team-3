/**
 * Stores information about "Newspaper" objects, such as
 * Title, Publisher, Genre and the number of publishments.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 0.1 (2019.02.11)
 */

public class Newspaper
{
    private String title;
    private String publisher;
    private String genre;
    private String numberOfPublishments;


    /**
     * The object contains
     * information about the newspaper, such as Title, Publisher, Genre and
     * the number of publishments.
     * @param title The title of the newspaper
     * @param publisher The publisher of the newspaper
     * @param genre The genre of the newspaper
     * @param numberOfPublishments The number of publishments of the newspaper
     */
    public Newspaper(String title, String publisher, String genre, String numberOfPublishments)
    {
        setTitle(title);
        setPublisher(publisher);
        setGenre(genre);
        setNumberOfPublishments(numberOfPublishments);
    }

    /**
     * The object contains nformation about the newspaper, such as Title, Publisher and genre.
     * The number of publishments are left blank
     * @param title The title of the newspaper
     * @param genre The genre of the newspaper
     * @param publisher The publisher of the newspaper.
     */
    public Newspaper(String title, String publisher, String genre)
    {
        setTitle(title);
        setPublisher(publisher);
        setGenre(genre);
        this.numberOfPublishments = "";
    }

    /**
     * The object contains information about the newspaper,
     * such as title.
     * The genre, publisher and number of publishments are left blank.
     * @param title
     */
    public Newspaper(String title)
    {
        setTitle(title);
        this.publisher = ("");
        this.genre = ("");
        this.numberOfPublishments = ("");
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
     * @return  genre
     */
    public String getGenre()
    {
         return this.genre;
    }

    /**
     * Get the number of publishments of the object
     * @return  number of publishments
     */
    public String getNumberOfPublishments()
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
     * @param genre
     */
    public void setGenre(String genre)
    {
        if (genre.length() > 0)
        {
            this.genre = genre;
        }
        else
        {
            System.out.println("Please enter genre");
        }
    }

    /**
     * Set the number of publishments of the object
     * @param numberOfPublishments
     */
    public void setNumberOfPublishments(String numberOfPublishments)
    {
        if (numberOfPublishments.length() > 0)
        {
            this.numberOfPublishments = numberOfPublishments;
        }
        else
        {
            System.out.println("Please enter number of publishments");
        }
    }

    /**
     * Set the publisher of the object
     * @param publisher
     */
    public void setPublisher(String publisher)
    {
        if (publisher.length() > 0)
        {
            this.publisher = publisher;
        }
        else
        {
            System.out.println("Please enter publisher");
        }
    }

    /**
     * Set the title of the object
     * @param title
     */
    public void setTitle(String title)
    {
        if(title.length() > 0)
        {
            this.title = title;
        }
        else
        {
            System.out.println("Please enter title");
        }
    }
}
