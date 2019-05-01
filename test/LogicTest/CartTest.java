package LogicTest;

import Logic.Book;
import Logic.Literature;
import Logic.Cart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest
{

    @Before
    public void setUp()
    {

    }

    @Test
    public void TestQuantity()
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
}
