import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public Book removeBook(){
        return this.books.remove(0);
    }

    public void checkLibraryCapacity(Book book){
        if (this.bookCount() < this.capacity){
            this.books.add(book);
        }

    }


}
