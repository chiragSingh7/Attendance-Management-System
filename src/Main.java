import java.util.Scanner;

public class Main{
    static public void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello User.\n");
        System.out.println("Select the login/signup : \n");
        System.out.println("1. Login");
        System.out.println("2. Signup");

        //if login
        System.out.println("Registered user login ");
        System.out.println("Enter your ID : ");
        int ID = scanner.nextInt();
        // check if ID matches or else
        System.out.println("Invalid ID!! Please check the ID you have entered.\n");

        System.out.println("Enter your password : ");
        String password = scanner.next();
        // check if password matches or else
        System.out.println("Invalid password!! Please check the password you have entered.\n");

        // if both matches with our data then check whose ID it is, the HR or the Employee
        // if it matches with the Employee
        System.out.println("Hello " + );

        // if Signup
        System.out.println("New user signup \n");
        System.out.println("Please fill in the following details : ");

        System.out.println("1. Enter the user ID provided by HR : ");
        ID = scanner.nextInt();

        System.out.println("2. Enter your password : ");
        password = scanner.next();

        scanner.close();
    }
}