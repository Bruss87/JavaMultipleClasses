import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> privCollection;

    public Borrower(String name){
        this.name = name;
        this.privCollection = new ArrayList<Book>();
    }

    public String getName(){
        return this.name;
    }

    public void borrowBookFromLibrary(Library library){
        Book book = library.removeBook();
        this.privCollection.add(book);
    }
}
