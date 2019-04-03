package UI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Logic.*;

import static org.junit.Assert.*;

public class ViewerTest
{

    Viewer viewer;
    @Before
    public void setUp() throws Exception
    {
        this.viewer = new Viewer();
    }

    @Test
    public void testCreateBookViewer()
    {
        Book book = new Book("Harry Potter og de Vises Sten",
                "Cappelen Damm", "1999", "Norwegian",
                "Fantasy", 20, 50, "J.K. Rowling",
                "1", "Harry Potter");

    }

    @Test
    public void testCreateMagazineViewer()
    {
    }

    @Test
    public void testCreateNewspaperViewer()
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }
}