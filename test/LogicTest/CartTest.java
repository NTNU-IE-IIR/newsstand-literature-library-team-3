package LogicTest;

import Logic.Book;
import Logic.Literature;
import Logic.Cart;
import Exception.InsufficientQuantityException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test-class for the Cart-class.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public class CartTest
{

    @Before
    public void setUp()
    {
    }

    /**
     * Positive test testing that the quantity of a book is reduced by one
     * if one book is purchased.
     */
    @Test
    public void TestQuantity()
    {
        try
        {
            Cart cart = new Cart();
            Literature testBook = new Book("Harry Potter og de Vises Sten",
                    "Cappelen Damm", "1999", "Norwegian",
                    "Fantasy", 20, 50, "J.K. Rowling",
                    "1");
            cart.addToCart(testBook);
            cart.checkOut();
            assertEquals(49, testBook.getQuantityInStock());
        }
        catch (InsufficientQuantityException iqe)
        {
            System.out.println("ERROR");
        }
    }
}
