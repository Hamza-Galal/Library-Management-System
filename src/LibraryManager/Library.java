package LibraryManager;
import Model.Book;
import Model.User;
import Exception.LibraryException;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }

    public void addUser(User user){
        users.add(user);
    }

    public void displayBook(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void removeBook(Book book)
        throws LibraryException {
            if (!books.contains(book)) {
                throw new LibraryException("Book Not Found ");
                
            }
             books.remove(book);
        }
       
    

    public Book searchByTitle(String title)
    throws LibraryException{

        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
         throw new LibraryException("Book not found");
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    }


