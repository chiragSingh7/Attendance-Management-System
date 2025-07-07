package models;

public class Admin extends User{
    Admin(String name, int ID, String email){
        super(name,ID,email);
    }

    public void viewAttendance(){
        System.out.println("Your attendance is: ");
    }
}
