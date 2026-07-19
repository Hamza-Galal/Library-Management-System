package  Model;
public class Book {
    private int book_Id;
    private String title;
    private String author;
    private String category;
    private boolean available;

public Book (int book_Id , String title , String author , String category){
    this.book_Id = book_Id;
    this.title = title; 
    this.author = author;
    this.category = category;
    this.available = true;
}

public int getBookId(){
   return book_Id; 
}

public String getBookTitle(){
    return title;
}

public String getauthor(){
    return author;
}

public String getBookCategory(){
    return category;
}

public boolean isAvailable(){
    return available;
}

public void setAvailable(boolean available){
    this.available = available;

}

public String toString(){
    return "book_Id: " + book_Id +
     " , Title:" + title +
     " , Author:" + author +
     " , Category:" + category + 
     " , Availability:" + available ;
}

}
