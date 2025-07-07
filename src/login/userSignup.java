package login;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class userSignup {

    public static void enterDetails(){

        File file = new File("Database.txt");
        Scanner scanner = new Scanner(System.in);
        int newID = 2021001;

        try{
            if(file.exists()){
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                int lastID = 0;

                while((line = reader.readLine()) != null){
                    if(!line.isEmpty()){
                        String[] parts = line.split(",");
                        try{
                            int currentID = Integer.parseInt(parts[0].trim());
                            if(currentID > lastID){
                                lastID = currentID;
                            }
                        }
                        catch(NumberFormatException ignored){}
                    }
                }
                reader.close();
                newID = lastID + 1;
            }

            System.out.println("1. Enter your full name : ");
            String name = scanner.nextLine();

            System.out.println("2. Enter your emailID : ");
            String emailID = scanner.next();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(newID + "," + name + "," + emailID + ",");
            writer.newLine();
            writer.close();
        }
        catch(IOException e){
            System.out.println("File error occurred");
            e.printStackTrace();
        }
    }
}
