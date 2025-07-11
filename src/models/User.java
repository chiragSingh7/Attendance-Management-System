package models;

public class User {
    protected String name;
    protected int ID;
    protected String email;
    protected String password;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return this.ID;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + ID + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    //public abstract void viewAttendance();
}
