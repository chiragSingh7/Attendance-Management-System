package models;

public class IThead extends Admin{
    IThead(String name, int ID, String email){
        super(name,ID,email);
    }

    public void viewAttendance(){
        System.out.println("Your attendance is: ");
    }
}
