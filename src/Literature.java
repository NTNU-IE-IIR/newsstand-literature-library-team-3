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
    protected void setTitle(String title)
    {
        this.title = title;
    }

    protected void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    protected void setPublishYear(String publishYear)
    {
        this.publishYear = publishYear;
    }

    protected void setLanguage(String language)
    {
        this.language = language;
    }

    protected void setGenre(String genre)
    {
        this.genre = genre;
    }

    protected void setPrice(int price)
    {
        this.price = price;
    }

    protected void setQuantityInStock(int quantityInStock)
    {
        this.quantityInStock = quantityInStock;
    }

    //------Get-methods------

    protected String getTitle()
    {
        return title;
    }

    protected String getPublisher()
    {
        return publisher;
    }

    protected String getPublishYear()
    {
        return publishYear;
    }

    protected String getLanguage()
    {
        return language;
    }

    protected String getGenre()
    {
        return genre;
    }

    protected int getPrice()
    {
        return price;
    }

    protected int getQuantityInStock()
    {
        return quantityInStock;
    }
}
