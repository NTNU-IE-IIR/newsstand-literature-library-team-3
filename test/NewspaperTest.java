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
     * Tests the setTitle method in the Newspaper class.
     * */
    @Test
    public void setTitle()
    {
        this.testNewspaper.setTitle("testTittel2");
        assertEquals("testTittel2", this.testNewspaper.getTitle());
    }
}