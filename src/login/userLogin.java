package login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

public class userLogin {
    //ignorecase for mail
//    public static boolean checkID(int ID) throws IOException {
//        String filepath = "C:\\Users\\Chirag Singh Rathore\\IdeaProjects\\HR Management System\\src\\Database.txt";
//        boolean temp = false;
//
//        try(FileReader br = new FileReader("Database.json"){
//
//            if(!found){
//                System.out.println("This is not a registered ID. Please check the ID you have entered or try signing in again.");
//            }
//        }
//
//        catch (IOException e) {
//            System.out.println("Error reading the file: " + e.getMessage());
//        }
//
//        return temp;
//    }

//    public static boolean checkPswd(String password){
//        String filepath = "Database.txt";
//        boolean temp = false;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(filepath))){
//            String line ;
//            boolean found = false;
//
//            while((line = br.readLine()) != null){
//                String[] parts = line.split(",\\s*");
//
//                if(parts.length >= 4){
//                    String searchPassword = parts[3];
//
//                    if(searchPassword.equals(password)){
//                        found = true;
//                        temp = true;
//                        break;
//                    }
//                }
//            }
//        }
//
//        catch(IOException e){
//            System.out.println("Error reading this file: " + e.getMessage());
//        }
//
//        return temp;
//    }
}
