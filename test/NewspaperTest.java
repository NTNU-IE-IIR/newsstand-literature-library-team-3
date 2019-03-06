import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewspaperTest {

    private Newspaper testNewspaper;



    @Before
    public void setUp() throws Exception
    {
        this.testNewspaper = new Newspaper("testTittel", "VG", "Nyheter", 52);
    }

    @Test

    /**
     * Tests the getTitle method in the Newspaper class.
     * */

    public void getTitle()
    {
        assertEquals("testTittel", this.testNewspaper.getTitle());
    }

    /**
     * Tests the getNumberOfPublishments method in the Newspaper class.
     * */
    @Test
    public void getNumberOfPublishments()
    {
        assertEquals(52, this.testNewspaper.getNumberOfPublishments(), 0);
    }

    /**
     * Tests that it is not possible to enter null in title.
     * */
    @Test
    public void testEmptyTitle()
    {
        Newspaper testNewspaper2 = new Newspaper("", "VG", "Nyheter", 10);
        Newspaper testNewspaper3 = new Newspaper(null, "VG", "Nyheter", 10);
        assertEquals("UNDEFINED", testNewspaper2.getTitle());
        assertEquals("UNDEFINED", testNewspaper3.getTitle());
    }



}