package Logic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register of literature. The current version only holds a collection
 * of newspaper objects. The newspaper objects is stored in an ArrayList.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
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
     *
     * @param literature The literature to be added to the register.
     */
    public void addLiterature(Literature literature)
    {
        if (literature != null)
        {
            this.literatureCollection.add(literature);
        }
    }

    /**
     * Returns an Iterator for the literature collection.
     *
     * @return An Iterator for the ArrayList containing the literature objects.
     */
    public Iterator<Literature> getIterator()
    {
        return this.literatureCollection.iterator();
    }

    /**
     * Returns an ArrayList which contains a collection of literature.
     *
     * @return An ArrayList which contains a collection of literature objects.
     */
    public ArrayList<Literature> getAllLiterature()
    {
        return this.literatureCollection;
    }

    /**
     * Returns the number of literature in the register.
     *
     * @return The number of literature in the register.
     */

    public int getNumberOfLiterature()
    {
        int numberOfLiterature = literatureCollection.size();
        return numberOfLiterature;
    }

    /**
     * Searches the literature register for a specific literature,
     * given by the title which is searched for.
     *
     * @param searchTitle The title of the literature
     * @return If the literature was found in the register, this
     * literature will be returned.
     * If no literature matches the searchword, null will be returned.
     */
    public Literature searchByTitle(String searchTitle)
    {
        Literature returnString = null;
        for (Literature literature : literatureCollection)
        {
            if (literature.getTitle().equals(searchTitle))
            {
                returnString = literature;
            }
        }
        return returnString;
    }

    /**
     * Checks if the register contains a given book.
     * Uses the title of the desired book to check if it
     * exists in the register.
     *
     * @param bookTitle The title of the book.
     * @return true if the book exists in the register,
     * false if not.
     */
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

    /**
     * Returns a desired book if it exists in the register.
     * Uses the title as parameter.
     *
     * @param title The title of the given book.
     * @return The desired book, if it exists in the register.
     * If the book does not exist in the register, null will be returned.
     */
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

    /**
     * Searches for a specific literature item in the literature register based on user input,
     * title and publisher. Both must match an item in the register to return a Literature object.
     * If no object matches the search criteria, null will be returned.
     * @param title the title to search for
     * @param publisher the publisher to search for
     * @return a Literature object, will have value <code>null</code> if no matching results were found.
     */
    public Literature findLiteratureByTitleAndPublisher(String title, String publisher)
    {
        Literature foundLiterature = null;
        boolean searching = true;
        Iterator<Literature> litIt = this.literatureCollection.iterator();
        while (litIt.hasNext() && searching)
        {
            Literature tempLit = litIt.next();
            if (tempLit.getTitle().equals(title))
            {
                if (tempLit.getPublisher().equals(publisher))
                {
                    foundLiterature = tempLit;
                    searching = false;
                }
            }
        }
        return foundLiterature;
    }
}
