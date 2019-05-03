package LogicTest;

import Logic.*;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

/**
 * Test class for testing the functionality of the Newspaper class.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
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
     * A positive test of the getTitle-method in the Newspaper class.
     */
    @Test
    public void testGetTitle()
    {
        assertEquals("testTittel", this.testNewspaper.getTitle());
    }

    /**
     * A positive test of the getNumberOfYearlyPublications-method in the Newspaper class.
     */
    @Test
    public void testGetNumberOfPublications()
    {
        assertEquals(52, this.testNewspaper.getNumberOfYearlyPublications(), 0);
    }

    /**
     * A negative test testing that an empty string in the titleinput
     * of a newspaper-object will lead to an InputMismatchException.
     */
    @Test
    public void testEmptyTitle()
    {
        try
        {
            Newspaper testNewspaper2 = new Newspaper("", "VG", "2019", "Norsk",
                    "Nyheter", 20, 15, 52, "April 3rd");
        }
        catch (InputMismatchException e)
        {
            assertTrue(true);
        }
        catch (Exception e)
        {
            fail("Unexpected exception thrown.");
        }
    }

    /**
     * A negative test testing that an empty string in the titleinput
     * of a newspaper-object will lead to an InputMismatchException.
     */
    @Test
    public void testNullTitle()
    {
        try
        {
            Newspaper testNewspaper3 = new Newspaper(null, "VG", "2019", "Norsk",
                    "Nyheter", 20, 15, 52, "April 3rd");
        }
        catch (InputMismatchException ime)
        {
            assertTrue(true);
        }
        catch (Exception e)
        {
            fail("Unexpected exception thrown.");
        }
    }
}
