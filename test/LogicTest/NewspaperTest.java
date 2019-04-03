package LogicTest;

import Logic.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class NewspaperTest
{

    private Newspaper testNewspaper;


    @Before
    public void setUp()
    {
        this.testNewspaper = new Newspaper("testTittel", "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52, "April 3rd");
    }


    /**
     * Tests the getTitle method in the Newspaper class.
     */
    @Test
    public void testGetTitle()
    {
        assertEquals("testTittel", this.testNewspaper.getTitle());
    }

    /**
     * Tests the getNumberOfPublications method in the Newspaper class.
     */

    @Test
    public void testGetNumberOfPublications()
    {
        assertEquals(52, this.testNewspaper.getNumberOfYearlyPublications(), 0);
    }

    /**
     * Tests that it is not possible to enter null in title.
     */

    @Test
    public void testEmptyTitle()
    {
        Newspaper testNewspaper2 = new Newspaper("", "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52, "April 3rd");
        Newspaper testNewspaper3 = new Newspaper(null, "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52, "April 3rd");
        assertEquals("UNDEFINED", testNewspaper2.getTitle());
        assertEquals("UNDEFINED", testNewspaper3.getTitle());
    }
}
