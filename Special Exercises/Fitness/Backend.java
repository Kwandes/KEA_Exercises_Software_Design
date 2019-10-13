// Fitness Exercise, File working setup
// Jan Bogoryja-Zakrzewski, Dat19i

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.io.FileWriter;

public class Backend {
   
   String FILE_NAME = "userList.txt";
   
   public void displayAllContents()
   {
      File file = new File(FILE_NAME);
      
      try
      {
         file.createNewFile();
      }
      catch (IOException e) {}
      try
      {
         Scanner userList = new Scanner(file);
         
         while(userList.hasNext())
         {
            String userID = userList.next();
            if(userID.startsWith("E"))
            {
               User user = new User(userList.next(), userList.next(), userList.nextLine());
               System.out.println(user);
            }
            else if (userID.startsWith("M"))
            {
               User user = new User(userList.next(), userList.next(), userList.next(), userList.nextLine());
               System.out.println(user);
            }         
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Critcal error - file missing!");
      }
   }
   
   // Member adding
   public void addNewUser(String type, String cpr, String paymentStatus, String name)
   {
      System.out.print("adding new user...");
      String userID = "M" + Character.toUpperCase(type.charAt(0)) + cpr.charAt(3) + cpr.charAt(5) + cpr.charAt(7);
      String userLine = "\n" + userID + " " + type + " " + cpr + " " + paymentStatus + " " + name;
      try{    
           FileWriter file = new FileWriter(FILE_NAME, true);    
           file.write(userLine);    
           file.close();    
          }
      catch(Exception e){  System.out.println("error: " + e); }
   
   }
}