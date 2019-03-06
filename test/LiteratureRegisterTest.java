import org.junit.Before;
import org.junit.Test;

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
        Newspaper testNewspaper = new Newspaper();
        this.testLitReg.addNewspaper();

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