package UI;

import Logic.*;

/**
 * Makes a viewer object. Sorts objects and creates an appropriate viewer class.
 * @author Arvin Khodabandeh, Erlend Holsker, Isak Gamnes Sneltvedt.
 * @version 0.2 (2019.04.03)
 */
public class Viewer
{

    public Viewer()
    {
    }

    /**
     * Creates and returns an appropriate viewer object based on the type of literature in the input.
     * @param literature the literature to make a viewer of.
     * @return a viewer of the appropriate type.
     */
    public LiteratureView createViewer(Literature literature)
    {
        LiteratureView viewer = null;
        if (literature instanceof Book)
        {
            viewer = new BookView((Book) literature);
        }
        else if (literature instanceof Newspaper)
        {
            viewer = new NewspaperView((Newspaper) literature);
        }
        else if (literature instanceof Magazine)
        {
            viewer = new MagazineView((Magazine) literature);
        }
        return viewer;
    }
}
