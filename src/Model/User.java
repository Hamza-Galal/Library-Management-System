package Model;
import java.util.ArrayList;
public abstract class User {
    private int User_id;
    private String Name;
    private String Email;
    private ArrayList<Book> borrowedBooks;

public User (int User_id , String Name , String Email){
    this.User_id = User_id; 
    this.Name = Name;
    this.Email = Email;
    this.borrowedBooks = new ArrayList<>();
}  

public abstract int getBorrowedLimit();

public boolean canBorrow(){
    return borrowedBooks.size() < getBorrowedLimit();
}

public void borrowBook (Book book){
    borrowedBooks.add(book);
}

public void returnBook(Book book){
    borrowedBooks.remove(book);
}

public int getUserId(){
    return User_id;
}

public String getName(){
    return Name;
}

public String getEmail(){
    return Email;
}

public ArrayList<Book> getBorrowedBooks(){
    return borrowedBooks;
}


}
