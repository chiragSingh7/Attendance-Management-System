package models;

public abstract class User {
    protected String name;
    protected int ID;
    protected String email;

    User(String name, int ID, String email){
        this.name = name;
        this.ID = ID;
        this.email = email;
    }

    public void getDetails(String name, int ID){
        System.out.println("Name: " + this.name);
        System.out.printf("ID: %d",this.ID);
        System.out.println("Email: " + this.email);
    }

    public abstract void viewAttendance();
}
