package UITest;

import UI.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Logic.*;

import static org.junit.Assert.*;


/**
 * Test class for checking the functionality of the Viewer class.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public class ViewerTest
{

    Viewer viewer;
    @Before
    public void setUp()
    {
        this.viewer = new Viewer();
    }

    /**
     * Tests that the Viewer makes a bookViewer and NOT a magazineViewer or newspaperViewer.
     */
    @Test
    public void testCreateBookViewer()
    {
        Literature book = new Book("Harry Potter og de Vises Sten",
                "Cappelen Damm", "1999", "Norwegian",
                "Fantasy", 20, 50, "J.K. Rowling",
                "1");
        SalesItemView literatureView = this.viewer.createViewer(book);
        assertFalse(literatureView instanceof MagazineView);
        assertFalse(literatureView instanceof NewspaperView);
        assertTrue(literatureView instanceof BookView);
    }

    /**
     * Tests that the Viewer makes a magazineViewer and NOT a bookViewer or newspaperViewer.
     */
    @Test
    public void testCreateMagazineViewer()
    {
        Literature magazine = new Magazine("Teknisk Ukeblad", "TU Media", "2019",
                "Norwegian", "Technology", 10, 17,
                52, "June 20th");
        SalesItemView literatureView = this.viewer.createViewer(magazine);
        assertFalse(literatureView instanceof NewspaperView);
        assertFalse(literatureView instanceof BookView);
        assertTrue(literatureView instanceof MagazineView);
    }

    /**
     * Tests that the Viewer makes a newspaperViewer and NOT a magazineViewer or bookViewer.
     */
    @Test
    public void testCreateNewspaperViewer()
    {
        Literature newspaper = new Newspaper("VG", "Schibsted", "2019",
                "Norwegian", "News", 10, 17,
                52, "June 20th");
        SalesItemView literatureView = this.viewer.createViewer(newspaper);
        assertFalse(literatureView instanceof MagazineView);
        assertFalse(literatureView instanceof BookView);
        assertTrue(literatureView instanceof NewspaperView);
    }

    @After
    public void tearDown()
    {
    }
}