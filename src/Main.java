import java.util.Scanner;

public class Main{
    static public void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        boolean working = true;

        while(working){
            System.out.println("Hello User.\n");
            System.out.println("Select the login/signup : \n");
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("0. Exit");

            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                //if login
                case 1 : System.out.println("Registered user login ");
                         System.out.println("Enter your ID : ");
                         int ID = scanner.nextInt();

                         //check if the login ID matches or
                         System.out.println("Invalid ID!! Please check the ID you have entered.\n");

                         break;

                //if signup
                case 2 : System.out.println("New user signup \n");
                         System.out.println("Please fill in the following details : ");

                         System.out.println("1. Enter the user ID provided by HR : ");
                         ID = scanner.nextInt();

                         System.out.println("2. Enter your password : ");
                         String password = scanner.next();

                         break;

                // if exit
                case 3 : System.out.println("Exiting the program");
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