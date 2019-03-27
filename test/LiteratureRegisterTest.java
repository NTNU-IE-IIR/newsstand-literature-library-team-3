import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;
/**
    Represents a test class for the LiteratureRegister class. Contains test methods
    to verify the functions of the methods in the LiteratureRegister class.

    @author Arvin Khodabandeh, Erlend Holseker, Isak Sneltvedt Gamnes
    @version 0.1 (2019.03.06)

 */
public class LiteratureRegisterTest
{
    private LiteratureRegister testLitReg;

    @Before
    public void setUp() throws Exception
    {
        this.testLitReg = new LiteratureRegister();
    }

    /**
    A positive test of testAddNewspaper method. Making a Newspaper object and putting it in the LiteratureRegister
    object. Then retrieves an ArrayList from the LiteratureRegister object, and checks if this ArrayList contains
    the added newspaper object.
     */
    @Test
    public void testAddNewspaper()
    {
        Newspaper testNewspaper = new Newspaper("testTitle", "VG", "News", 52);
        this.testLitReg.addNewspaper(testNewspaper);
        ArrayList<Newspaper> testLitRegArrayList = testLitReg.getAllNewspapers();
        assertEquals(true, testLitRegArrayList.contains(testNewspaper));
    }

    @Test
    public void testAddNewspaper2()
    {
        Newspaper testNewspaper = null;
        this.testLitReg.addNewspaper(testNewspaper);
        int numberOfNewspapers = testLitReg.getNumberOfNewspapers();
        assertEquals(0, numberOfNewspapers, 0);
    }

    @Test
    public void testGetIterator()
    {
    }

    @Test
    public void testGetAllNewspapers()
    {
    }
}