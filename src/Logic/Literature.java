package Logic;

/**
 * The literature-class contains information that is common for all literature.
 * It is not meant to create instances of type Logic.Literature.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.25)
 */

public abstract class Literature
{
    private String title;
    private String publisher;
    private String publishYear;
    private String language;
    private String genre;
    private int price;
    private int quantityInStock;

    public Literature(String title, String publisher, String publishYear, String language, String genre, int price, int quantityInStock)
    {
        setTitle(title);
        setPublisher(publisher);
        setPublishYear(publishYear);
        setLanguage(language);
        setGenre(genre);
        setPrice(price);
        setQuantityInStock(quantityInStock);
    }

    //------Set-methods------

    /**
     * Sets the title of the given literature.
     * If the input is empty, the title will
     * be set to "UNDEFINED".
     * @param title The title of the given literature.
     */
    protected void setTitle(String title)
    {
        this.title = setString(title);
    }

    /**
     * Sets the publisher of the given literature.
     * If the input is empty, the publisher will
     * be set to "UNDEFINED".
     * @param publisher The publisher of the given literature.
     */
    protected void setPublisher(String publisher)
    {
        this.publisher = setString(publisher);
    }

    /**
     * Sets the year the given literature was published.
     * If the input is empty, the publish-year will
     * be set to "UNDEFINED".
     * @param publishYear The year the given literature was published.
     */
    protected void setPublishYear(String publishYear)
    {
        this.publishYear = setString(publishYear);
    }

    /**
     * Sets the language the given literature is written in.
     * If the input is empty, the language will
     * be set to "UNDEFINED".
     * @param language The language the given literature is written in.
     */
    protected void setLanguage(String language)
    {
        this.language = setString(language);
    }

    /**
     * Sets the genre of the the given literature.
     * If the input is empty, the genre will
     * be set to "UNDEFINED".
     * @param genre The genre of the given literature.
     */
    protected void setGenre(String genre)
    {
        this.genre = setString(genre);
    }

    /**
     * Sets the price of the the given literature.
     * If the input is empty, the price will
     * be set to 0.
     * @param price The price of the given literature.
     */
    protected void setPrice(int price)
    {
        this.price = setInt(price);
    }

    /**
     * Sets the amount of the the given literature in stock.
     * If the input is empty, the amount will
     * be set to 0.
     * @param quantityInStock The amount of the given literature in stock.
     */
    protected void setQuantityInStock(int quantityInStock)
    {
        this.quantityInStock = setInt(quantityInStock);
    }

    /**
     * Used by all set-methods requiring datatype String
     * in this class and all sub-classes.
     * The method returns a String. If the input is empty,
     * it will return a String containing "UNDEFINED". If not,
     * the return String will be equal to the input.
     * @param input The input from the set-method calling on this method.
     * @return The String to be set in the field.
     */
    protected String setString(String input)
    {
        String returnString = "UNDEFINED";

        if (input != null )
        {
            if (!input.isEmpty())
            {
                returnString = input;
            }
        }
        return returnString;
    }

    /**
     * Used by all set-methods requiring datatype int,
     * in this class and all sub-classes.
     * The method returns an int. If the input is less or equal to 0,
     * it will return an int equal to 0. If not,
     * it will return an int equal to the input.
     * @param input The input from the set-method calling on this method.
     * @return The int to be set in the field.
     */
    protected int setInt(int input)
    {
        int returnInt = 0;

        if (input >= 0)
        {
            returnInt = input;
        }
        return returnInt;
    }

    //------Get-methods------

    /**
     * Returns the title of the given literature.
     * @return title A string containing the title of the given literature.
     */
    protected String getTitle()
    {
        return title;
    }

    /** Returns the publisher of the given literature.
     * @return publisher A string containing the publisher of the given literature.
     */
    protected String getPublisher()
    {
        return publisher;
    }

    /** Returns the year the given literature was published.
     * @return publishYear A string containing the year the given literature was published.
     */
    protected String getPublishYear()
    {
        return publishYear;
    }

    /** Returns the year the given literature was published.
     * @return publishYear A string containing the year the given literature was published.
     */
    protected String getLanguage()
    {
        return language;
    }

    /** Returns the genre of the given literature.
     * @return genre A string containing the genre of the given literature.
     */
    protected String getGenre()
    {
        return genre;
    }

    /** Returns the price of the given literature.
     * @return price An int representing the price of the given literature, in NOK (Norwegian kroner).
     */
    protected int getPrice()
    {
        return price;
    }

    /** Returns the amount of the given literature in stock.
     * @return quantityInStock An int representing the amount of the given literature in stock.
     */
    protected int getQuantityInStock()
    {
        return quantityInStock;
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
                "Publish year: " + this.publishYear + "\n" +
                "Language: " + this.language + "\n" +
                "Genre: " + this.genre + "\n" +
                "Price: " + this.price + "\n" +
                "Quantity in stock: " + this.quantityInStock;
    }

}
