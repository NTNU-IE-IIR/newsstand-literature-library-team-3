package Logic;

import Logic.Literature;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register of literature. The current version only holds a collection
 * of newspaper objects. The newspaper objects is stored in an ArrayList.
 *
 * @author Erlend Holseker, Arvin Khodabandeh, Isak Gamnes Sneltvedt
 * @version 0.1 (2019.03.06)
 */

public class LiteratureRegister
{

    private ArrayList<Literature> literatureCollection;

    /**
     * Creates a new registry to store different literature
     */
    public LiteratureRegister()
    {
        literatureCollection = new ArrayList<>();
    }

    /**
     * Adds new literature in the register.
     * @param literature The literature to be added to the register.
     * */
    public void addLiterature(Literature literature)
    {
        if(literature != null)
        {
            this.literatureCollection.add(literature);
        }
    }

    /**
     * Returns an Iterator for the literature collection.
     * @return An Iterator for the ArrayList containing the literature objects.
     */
    public Iterator<Literature> getIterator()
    {
        return this.literatureCollection.iterator();
    }

    /**
     * Returns an ArrayList which contains a collection of literature.
     * @return An ArrayList which contains a collection of literature objects.
     */
    public ArrayList<Literature> getAllLiterature()
    {
        return this.literatureCollection;
    }

    /**
     * Returns the number of literature in the register.
     * @return The number of literature in the register.
     * */

    public int getNumberOfNewspapers()
    {
        int numberOfNewspapers = literatureCollection.size();
        return numberOfNewspapers;
    }
}
