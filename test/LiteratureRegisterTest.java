import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;

public class LiteratureRegisterTest
{
    private LiteratureRegister testLitReg;

    @Before
    public void setUp() throws Exception
    {
        this.testLitReg = new LiteratureRegister();
    }

    @Test
    public void testAddNewspaper()
    {
        Newspaper testNewspaper = new Newspaper("testTitle", "VG", "News", 52);
        this.testLitReg.addNewspaper(testNewspaper);
        ArrayList<Newspaper> testLitRegArrayList = testLitReg.getAllNewspapers();
        assertEquals(true, testLitRegArrayList.contains(testNewspaper));

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