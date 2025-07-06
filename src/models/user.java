public abstract class user {
    private String name;
    Role role;
    private int ID;

    user(){

    }

    public void setDetails(String name, String role, int ID){
        this.name = name;
        this.role = role;
        this.ID = ID;
    }


}
