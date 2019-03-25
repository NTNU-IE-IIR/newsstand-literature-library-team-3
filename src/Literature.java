/**
 * The literature-class contains information that is common for all literature.
 * It is not meant to create instances of type Literature.
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
        if (title != null )
        {
            if (!title.isEmpty())
            {
                this.title = title;
            }
        }
        else
        {
            this.title = "UNDEFINED";
        }
    }

    /**
     * Sets the publisher of the given literature.
     * If the input is empty, the publisher will
     * be set to "UNDEFINED".
     * @param publisher The publisher of the given literature.
     */
    protected void setPublisher(String publisher)
    {
        if (publisher != null )
        {
            if (!publisher.isEmpty())
            {
                this.publisher = publisher;
            }
        }
        else
        {
            this.publisher = "UNDEFINED";
        }
    }

    /**
     * Sets the year the given literature was published.
     * If the input is empty, the publish-year will
     * be set to "UNDEFINED".
     * @param publishYear The year the given literature was published.
     */
    protected void setPublishYear(String publishYear)
    {
        if (publishYear != null )
        {
            if (!publishYear.isEmpty())
            {
                this.publishYear = publishYear;
            }
        }
        else
        {
            this.publishYear = "UNDEFINED";
        }
    }

    /**
     * Sets the language the given literature is written in.
     * If the input is empty, the language will
     * be set to "UNDEFINED".
     * @param language The language the given literature is written in.
     */
    protected void setLanguage(String language)
    {
        if (language != null )
        {
            if (!language.isEmpty())
            {
                this.language = language;
            }
        }
        else
        {
            this.language = "UNDEFINED";
        }
    }

    /**
     * Sets the genre of the the given literature.
     * If the input is empty, the genre will
     * be set to "UNDEFINED".
     * @param genre The genre of the given literature.
     */
    protected void setGenre(String genre)
    {
        if (genre != null )
        {
            if (!genre.isEmpty())
            {
                this.genre = genre;
            }
        }
        else
        {
            this.genre = "UNDEFINED";
        }
    }

    /**
     * Sets the price of the the given literature.
     * If the input is empty, the price will
     * be set to 0.
     * @param price The price of the given literature.
     */
    protected void setPrice(int price)
    {
        if (price >= 0)
        {
            this.price = price;
        }
        else
        {
            this.price = 0;
        }
    }

    /**
     * Sets the amount of the the given literature in stock.
     * If the input is empty, the amount will
     * be set to 0.
     * @param quantityInStock The amount of the given literature in stock.
     */
    protected void setQuantityInStock(int quantityInStock)
    {
        if (quantityInStock >= 0)
        {
            this.quantityInStock = quantityInStock;
        }
        else
        {
            this.quantityInStock = 0;
        }
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
}
