package Model;
public class Student extends User {
    public Student (int User_id , String Name , String Email ){
        super(User_id, Name, Email);
    }
    public int getBorrowedLimit(){
        return 3;
    }

}
