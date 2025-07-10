import login.userLogin;
import login.userSignup;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    static public void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        boolean working = true;

        String filepath = "Database.txt";

        while(working){
            System.out.println("Welcome User ");
            System.out.println("Select whether to login/signup : \n");
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("0. Exit");

            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                //if login
                case 1 : System.out.println("\n Registered user login ");
                         System.out.println("Enter your ID : ");
                         int ID = scanner.nextInt();

                         //checking if the ID exists among the registered users or not
                         while(!userLogin.checkID(ID)){
                             System.out.println("Your ID doesn't matches with the registered ID. Check the ID you have entered and try again!!");
                             ID = scanner.nextInt();
                         }

                         System.out.println("Enter the password : ");
                         String password = scanner.next();

                         //checking if the password is correct or not
                         while(!userLogin.checkPswd(password)){
                             System.out.println("Your password doesn't matches with the registered password. Check the password you have enetered and try again!!");
                             password = scanner.next();
                         }

                         break;

                //if signup
                case 2 : System.out.println("\n New user signup");
                         System.out.println("Please fill in the following details : ");

                         userSignup.enterDetails();


                         //show details to verify with the user before moving onto the next step, if correction needed enter information again

                         System.out.println("3. Enter your password : ");
                         password = scanner.next();

                         System.out.println("Re enter the password for checking : ");
                         String pass = scanner.next();

                         while(!password.equals(pass)){
                             System.out.println("You have not entered the same password. Re enter the password to check.");
                             pass = scanner.next();
                         }

                         break;

                // if exit
                case 0 : System.out.println("Exiting the program");
                         working = false;
                         break;

                //default
                default :
                    System.out.println("Enter a valid choice .");
            }
        }


        scanner.close();
    }
}