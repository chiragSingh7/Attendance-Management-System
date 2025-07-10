package models;

public class Admin extends User{
    Admin(String name, String email, String password){
        super(name,email,password);
    }

    public void viewAttendance(){
        System.out.println("Your attendance is: ");
    }
}
