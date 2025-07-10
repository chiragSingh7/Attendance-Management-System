package modifyDB;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.User;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class modifyDatabase {

    public static void addToDatabase(String name, String mail, String password){
        try{
            File file = new File("Database.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            User u1 = new User(name, mail, password);

            if (!file.exists()) {
                file.createNewFile();

                try {
                    FileWriter writer = new FileWriter(file);
                    writer.write("[]");
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            //check if the file is empty
            if (file.length() == 0) {
                //if yes then create a list and add the first user to list and write
                List<User> allUser = new ArrayList<>();
                allUser.add(u1);
                gson.toJson(allUser);
            } else {
                try {/*get list from Json
                add to list
                overwrite the list
                */
                    FileReader reader = new FileReader("Database.json");
                    FileWriter writer = new FileWriter("Database.json");

                    //defining the type you want to store
                    Type userListType = new TypeToken<ArrayList<User>>() {
                    }.getType();
                    List<User> aUser = gson.fromJson(reader, userListType);

                    aUser.add(u1);
                    gson.toJson(aUser, writer);

                    //closing the reader and writer
                    writer.close();
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
