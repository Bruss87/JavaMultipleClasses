import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class LibraryTest {

     Library library;
     Book book;
     Book book1;
     Book book2;
     Book book3;

    @Before
    public void setUp(){
        library = new Library();
        book = new Book("Lord of the rings", "J.R.R. Tolkien", "Fantasy");
        book1 = new Book("The girl with the dragon tattoo", "Stieg Larsson", "Mystery");
        book2 = new Book("Liar", "Jakub Cwiek", "Fantasy");
        book3 = new Book("A Study in Scarlet", "Arthur Conan Doyle", "Detective novel");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void libraryHasBooks(){
        library.addBook(book1);
        library.addBook(book);
        library.addBook(book2);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.bookCount());

    }


}
