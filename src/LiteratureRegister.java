import java.util.HashMap;


public class LiteratureRegister
{

    private HashMap<String, Newspaper> newspaperMap;

    /**
     * Makes a new registry to store different newspapers
     */
    public LiteratureRegister()
    {
        newspaperMap = new HashMap<>();
    }

    /**
     * Adds new newspapers in the register.
     * @param title title of the newspaper
     * @param genre genre of the newspaper
     * @param publisher genre of the newspaper
     * @param numberOfPublishments  number of publisments of the newspaper
     */
    public void addNewspaper(String title, String genre,
                             String publisher, int numberOfPublishments)
    {
        Newspaper newspaper = new Newspaper(title, publisher, genre, numberOfPublishments);
        this.newspaperMap.put(title, newspaper);
    }

    /**
     * Prints information about the newspaper, based on the title
     * @param title the title to retrieve information about
     */
    public void printNewspaperInfo(String title)
    {
        if(newspaperMap.containsKey(title))
        {
            Newspaper newspaper = this.newspaperMap.get(title);
            System.out.println("Title: " + title);
            System.out.println("Publisher: " + newspaper.getPublisher());
            System.out.println("Genre: " + newspaper.getGenre());
            System.out.println("Number of publishments: " + newspaper.getNumberOfPublishments());
        }
        else
        {
            System.out.println("No matches found.");
        }
    }

    /**
     * Removes a newspaper object from the registry
     * @param title the title of the newspaper to be removed
     */
    public void removeNewspaper(String title)
    {
        this.newspaperMap.remove(title);
        System.out.println("Removed " + title + " from the registry.");
    }

}
