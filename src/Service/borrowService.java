package Service;
import Model.Book;
import Model.User;
import Logger.Logger;
import Exception.LibraryException;
public class borrowService {
    private NotificationService notificationService;
    private Logger logger;
public borrowService(NotificationService notificationService , Logger logger){
    this.notificationService = notificationService;
    this.logger = logger;
}
public void borrowBook (User user, Book book)
    throws LibraryException {
        if (!book.isAvailable()) {
            throw new LibraryException("Book already borrowed");     
        }
        if (user.getBorrowedBooks().size() >= user.getBorrowedLimit() ) {
            throw new LibraryException ("Borrow limit exceeded");
        }
        user.borrowBook(book);
        book.setAvailable(false);
        notificationService.sendNotification(user.getName() + " borrowed " + book.getBookTitle());
        logger.log(user.getName() + " borrowed " + book.getBookTitle());
    }
    public void returnBook(User user , Book book)
    throws LibraryException{
        if (!user.getBorrowedBooks().contains(book)) {
            throw new LibraryException ("The user did not borrow this book");
            
        }
        user.returnBook(book);
        book.setAvailable(true);
        notificationService.sendNotification(user.getName() + "returned" + book.getBookTitle() );
        logger.log(user.getName() + "returned" + book.getBookTitle());
    }
}

