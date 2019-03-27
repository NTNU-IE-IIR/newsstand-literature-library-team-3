import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewspaperTest {

    private Newspaper testNewspaper;



    @Before
    public void setUp() throws Exception
    {
        this.testNewspaper = new Newspaper("testTittel", "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52);
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
        assertEquals(52, this.testNewspaper.getNumberOfYearlyPublications(), 0);
    }

    /**
     * Tests that it is not possible to enter null in title.
     * */
    @Test
    public void testEmptyTitle()
    {
        Newspaper testNewspaper2 = new Newspaper("", "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52);
        Newspaper testNewspaper3 = new Newspaper(null, "VG", "2019", "Norsk",
                "Nyheter", 20, 15, 52);
        assertEquals("UNDEFINED", testNewspaper2.getTitle());
        assertEquals("UNDEFINED", testNewspaper3.getTitle());
    }
}