import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void setUp(){
        book = new Book("The girl with the dragon tattoo", "Stieg Larsson", "Mystery");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The girl with the dragon tattoo", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Stieg Larsson", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Mystery", book.getGenre());
    }

}

