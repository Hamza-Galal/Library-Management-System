package Model;
public class Teacher extends User {
    public Teacher (int User_id , String Name , String Email){
        super(User_id, Name, Email);
    }
    public int getBorrowedLimit(){
        return 5;
    }

}
