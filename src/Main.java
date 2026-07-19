import Model.*;
import Service.*;
import Logger.*;
import Exception.*;
import LibraryManager.*;
public class Main {
    public static void main(String[] args){
        try{
            Library library = new Library();
            Book book1 = new Book(10, " Java Basics ", " Peter Parker ", " programming "); 
            Book book2 = new Book(20, " Cyber Security basics ", " Bruce Wayne ", " Programming ");
            library.addBook(book1);
            library.addBook(book2);
            User student = new Student(1001, " Hamza " , " Hamza@gmail.com ");
            NotificationService notificationService = new emailNotification();
            Logger logger = new consoleLogger();
            borrowService BorrowService = new borrowService(notificationService, logger);
            BorrowService.borrowBook(student , book1);
            BorrowService.returnBook(student, book1);   
            library.displayBook();
         }
         catch(LibraryException e){
            System.out.println(" error " + e.getMessage());
         }
        
        
    }
}
