// Fitness Exercise, File working setup
// Jan Bogoryja-Zakrzewski, Dat19i

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Backend {

   public void displayAllContents()
   {
      File file = new File("userList.txt");
      
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
               Employee user = new Employee(userList.next(), userList.next(), userList.nextLine());
               System.out.println(user);
            }
            else if (userID.startsWith("M"))
            {
               Member user = new Member(userList.next(), userList.next(), userList.next(), userList.nextLine());
               System.out.println(user);
            }         
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Critcal error - file missing!");
      }
   }
   
   public void addNewUser()
   {
   
   
   }
}