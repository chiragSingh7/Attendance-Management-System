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

public class updateUser {

    public void updateName(String name, String mail) throws FileNotFoundException {
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

    public void updateMail(String newMail, String mail){
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

    
}
