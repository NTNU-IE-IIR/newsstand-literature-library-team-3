package UI;

import Logic.*;

/**
 * Makes a viewer object. Sorts objects and creates an appropriate viewer class.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public class Viewer
{

    /**
     * Constructor of the Viewer.
     * Left blank intentionally.
     */
    public Viewer()
    {
    }

    /**
     * Creates and returns an appropriate viewer object based on the type of literature in the input.
     *
     * @param salesItem the salesItem to make a viewer of.
     * @return a viewer of the appropriate type.
     */
    public SalesItemView createViewer(SalesItem salesItem)
    {
        SalesItemView viewer = null;
        if (salesItem instanceof Book)
        {
            viewer = new BookView((Book) salesItem);
        }
        else if (salesItem instanceof Newspaper)
        {
            viewer = new NewspaperView((Newspaper) salesItem);
        }
        else if (salesItem instanceof Magazine)
        {
            viewer = new MagazineView((Magazine) salesItem);
        }
        else if (salesItem instanceof BookSeries)
        {
            viewer = new BookSeriesView((BookSeries) salesItem);
        }
        return viewer;
    }
}
