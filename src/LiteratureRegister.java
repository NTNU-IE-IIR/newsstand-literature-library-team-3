import java.util.ArrayList;
import java.util.Iterator;


public class LiteratureRegister
{

    private ArrayList<Newspaper> newspaperCollection;

    /**
     * Creates a new registry to store different newspapers
     */
    public LiteratureRegister()
    {
        newspaperCollection = new ArrayList<>();
    }

    /**
     * Adds new newspapers in the register.
     * @param newspaper The newspaper to be added to the register.
     * */
    public void addNewspaper(Newspaper newspaper)
    {
        this.newspaperCollection.add(newspaper);
    }

    public Iterator<Newspaper> getIterator()
    {
        return this.newspaperCollection.iterator();
    }

    public ArrayList<Newspaper> getAllNewspapers()
    {
        return this.newspaperCollection;
    }

    /**
     * Removes a newspaper object from the registry
     * @param title the title of the newspaper to be removed
    public void removeNewspaper(String title)
    {
        this.newspaperMap.remove(title);
        System.out.println("Removed " + title + " from the registry.");
    }
    */


}
