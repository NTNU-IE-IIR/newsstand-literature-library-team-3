package LogicTest;

import org.junit.Before;
import org.junit.Test;

import Logic.*;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Represents a test class for the Logic.LiteratureRegister class. Contains test methods
 * to verify the functions of the methods in the Logic.LiteratureRegister class.
 *
 * @author Arvin Khodabandeh, Erlend Holseker, Isak Sneltvedt Gamnes
 * @version 0.2 (2019.04.03)
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
     * Book object.
     */
    @Test
    public void testAddBook()
    {
        LiteratureRegister testLitReg = new LiteratureRegister();
        Literature testBook = new Book("Harry Potter og de Vises Sten",
                "Cappelen Damm", "1999", "Norwegian",
                "Fantasy", 20, 50, "J.K. Rowling",
                "1");
        testLitReg.addLiterature(testBook);
        List<Literature> testLitRegList = testLitReg.getAllLiterature();
        assertEquals(true, testLitRegList.contains(testBook));
    }

    /**
     * A positive test of the addLiterature method. Making a Magazine object
     * and putting it in the LiteratureRegister object. Then retrieves a List
     * from the LiteratureRegister object, and checks if this List contains the added
     * Magazine object.
     */
    @Test
    public void testAddMagazine()
    {
        LiteratureRegister testLitReg = new LiteratureRegister();
        Literature testMagazine = new Magazine("Teknisk Ukeblad", "TU Media", "2019",
                "Norwegian", "Technology", 10, 17,
                52, "June 20th");
        testLitReg.addLiterature(testMagazine);
        List<Literature> testLitRegList = testLitReg.getAllLiterature();
        assertEquals(true, testLitRegList.contains(testMagazine));
    }

    /**
     * A positive test of the addLiterature method. Making a Newspaper object
     * and putting it in the LiteratureRegister object. Then retrieves a List
     * from the LiteratureRegister object, and checks if this List contains the added
     * Newspaper object.
     */
    @Test
    public void testAddNewspaper()
    {
        LiteratureRegister testLitReg = new LiteratureRegister();
        Literature testNewspaper = new Newspaper("VG", "Schibsted", "2019",
                "Norwegian", "News", 10, 17,
                52, "June 20th");
        testLitReg.addLiterature(testNewspaper);
        List<Literature> testLitRegList = testLitReg.getAllLiterature();
        assertEquals(true, testLitRegList.contains(testNewspaper));
    }

    /**
     * A negative test of the addLiterature class. If the value of the added object
     * is null, the object won't be added to the literature register.
     */
    @Test
    public void testAddLiteratureNegative()
    {
        LiteratureRegister testLitReg = new LiteratureRegister();
        Literature testLiterature = null;
        testLitReg.addLiterature(testLiterature);
        assertEquals(0, testLitReg.getNumberOfLiterature());
    }

}
