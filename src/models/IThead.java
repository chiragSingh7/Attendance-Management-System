package models;

public class IThead extends Admin{
    IThead(String name, String email, String password){
        super(name,email,password);
    }

    public void viewAttendance(){
        System.out.println("Your attendance is: ");
    }
}
