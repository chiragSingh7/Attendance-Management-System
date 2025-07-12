package modifyDB;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class updateUser {

    protected void updateName(String name, String mail) throws FileNotFoundException {
        try(FileReader reader = new FileReader("data/Database.json")){
            Gson gson = new Gson();

            Type userListType = new TypeToken<ArrayList<User>>(){}.getType();
            List<User> aUser = gson.fromJson(reader, userListType);

            for(User u : aUser){
                if(u.getEmail().equals(mail)){
                    u.setName(name);
                }
            }

            try(FileWriter writer = new FileWriter("data/Database.json")){
                gson.toJson(aUser, writer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void updateMail(String newMail, String mail){
        try(FileReader reader = new FileReader("data/Database.json")){
            Gson gson = new Gson();

            Type userListType = new TypeToken<ArrayList<User>>(){}.getType();
            List<User> aUser = gson.fromJson(reader, userListType);

            for(User u : aUser){
                if(u.getEmail().equals(mail)){
                    u.setEmail(newMail);
                }
            }

            try(FileWriter writer = new FileWriter("data/Database.json")){
                gson.toJson(aUser, writer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected static void changePassword(String mail){
        try(FileReader reader = new FileReader("data/Database.json")){
            Gson gson = new Gson();
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nEnter your old password : ");
            String password = scanner.nextLine();

            Type userListType = new TypeToken<ArrayList<User>>(){}.getType();
            List<User> aUser = gson.fromJson(reader, userListType);

            for(User u : aUser){
                if(u.getEmail().equals(mail)){
                    if(u.getPassword().equals(password)){
                        System.out.println("Enter the new password : ");
                        password = scanner.nextLine();

                        System.out.println("Enter the password again to confirm : ");
                        String pass = scanner.nextLine();

                        while (!password.equals(pass)) {
                            System.out.println("\nThe passwords don't match. Re-check your password. ");
                            pass = scanner.nextLine();
                        }

                        u.setPassword(password);
                        break;
                    }
                }
            }
            scanner.close();
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
