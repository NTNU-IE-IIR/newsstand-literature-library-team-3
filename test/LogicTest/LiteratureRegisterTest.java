package LogicTest;

import org.junit.Before;
import org.junit.Test;

import Logic.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Represents a test class for the Logic.LiteratureRegister class. Contains test methods
 * to verify the functions of the methods in the Logic.LiteratureRegister class.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Sneltvedt Gamnes
 * @version 0.1 (2019.03.06)
 */


public class LiteratureRegisterTest
{

    @Before
    public void setUp()
    {
    }

    /**
     * A positive test of the addLiterature method. Making a Book object
     * and putting it in the LiteratureRegister object. Then retrieves a List
     * from the LiteratureRegister object, and checks if this List contains the added
     * book object.
     */
    @Test
    public void testAddBook()
    {
        LiteratureRegister testLitReg = new LiteratureRegister();
        Literature testBook = new Book("Harry Potter og de Vises Sten",
                "Cappelen Damm", "1999", "Norwegian",
                "Fantasy", 20, 50, "J.K. Rowling",
                "1", "Harry Potter");
        testLitReg.addLiterature(testBook);
        List<Literature> testLitRegList = testLitReg.getAllLiterature();
        assertEquals(true, testLitRegList.contains(testBook));
    }

    @Test
    public void testAddLiteratureNegative()
    {
        LiteratureRegister testLitReg = new LiteratureRegister();
        Literature testLiterature = null;
        testLitReg.addLiterature(testLiterature);
        assertEquals(0, testLitReg.getNumberOfLiterature());
    }

}
