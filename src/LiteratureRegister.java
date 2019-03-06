import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register of literature. The current version only holds a collection
 * of newspaper objects. The newspaper objects is stored in an ArrayList.
 *
 * @author Erlend Holseker, Arvin Khodabandeh, Isak Gamnes Sneltvedt
 * @version 1.0 (2019.03.06)
 */

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

    /**
     * Returns an Iterator for the newspaper collection.
     * @return An Iterator for the ArrayList containing the newspaper objects.
     */
    public Iterator<Newspaper> getIterator()
    {
        return this.newspaperCollection.iterator();
    }

    /**
     * Returns an ArrayList which contains a collection of newspapers.
     * @return An ArrayList which contains a collection of newspaper objects.
     */
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
