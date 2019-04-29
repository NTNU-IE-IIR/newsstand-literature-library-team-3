package Logic;

import Logic.Literature;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register of literature. The current version only holds a collection
 * of newspaper objects. The newspaper objects is stored in an ArrayList.
 *
 * @author Erlend Holseker, Arvin Khodabandeh, Isak Gamnes Sneltvedt
 * @version 0.2 (2019.04.03)
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

    public int getNumberOfLiterature()
    {
        int numberOfLiterature = literatureCollection.size();
        return numberOfLiterature;
    }

    public Literature searchByTitle(String searchTitle)
    {
        Literature returnString = null;
        for (Literature literature : literatureCollection)
        {
            if(literature.getTitle().equals(searchTitle))
            {
                returnString = literature;
            }
        }
        return returnString;
    }

    public boolean containsBook(String bookTitle)
    {
        boolean result = false;

        Iterator<Literature> litListIt = this.literatureCollection.iterator();
            while (litListIt.hasNext() && !result)
            {
                Literature literature = litListIt.next();
                if (literature instanceof Book)
                {
                    if (literature.getTitle().equals(bookTitle))
                    {
                        result = true;
                    }
                }
            }
        return result;
    }

    public Book getBook(String title)
    {
        Book book = null;
        Iterator<Literature> litListIt = this.literatureCollection.iterator();
        while (litListIt.hasNext())
        {
            Literature literature = litListIt.next();
            if (literature instanceof Book)
            {
                if (literature.getTitle().equals(title))
                {
                    book = (Book) literature;
                }
            }
        }
        return book;
    }
}
