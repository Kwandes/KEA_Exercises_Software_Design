// Fitness Exercise, File working setup
// Jan Bogoryja-Zakrzewski, Dat19i

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.io.FileWriter;

public class Backend{

   public Backend(){}
   
   public ArrayList<User> modifyUser(ArrayList<User> userArray, String searchQuery, User modifiedUser)
   {
      System.out.println("Debugging modifyUser()");
      
      for(int i = 0; i < userArray.size(); i++)
      {
         if(userArray.get(i).toString().toLowerCase().contains(searchQuery.toLowerCase())) userArray.set(i, modifiedUser);
      }
      return userArray;
   }
   
   public ArrayList<User> deleteUser(ArrayList<User> userArray, String searchQuery)
   {
      System.out.println("Debugging deleteUser()");
      
      for(int i = 0; i < userArray.size(); i++)
      {
         if(userArray.get(i).toString().toLowerCase().contains(searchQuery.toLowerCase())) userArray.remove(i);
      }
      return userArray;
   }
   
   
   // File operations
   public ArrayList<User> readFile(String fileName)
   {
      System.out.println("Debugging readFile()");
      ArrayList<User> userArray = new ArrayList<User>();
      
      File file = new File(fileName);
            
      try
      {
         Scanner fileContent = new Scanner(file);
         
         while(fileContent.hasNext())
         {
            String userID = fileContent.next();
            String userCPR = fileContent.next();
            String userType = fileContent.next();
            String userName = fileContent.nextLine();
            userArray.add(new User(userCPR, userType, userName.replaceFirst(" ", "")));   // Weird bug, it adds a whitespace to the beginning of the name. Faisal halp
         }
      }
      catch (FileNotFoundException e) { System.out.println("Critcal error - file missing!\n" + e);   }
      
      return userArray;
   }
   
   public void saveToFile(ArrayList<User> userArray, String fileName)
   {
      System.out.println("Debugging saveToFile()");
      
      try
      {
         FileWriter file = new FileWriter(fileName);
         
         for(int i = 0; i < userArray.size(); i++)
         {
            file.write(userArray.get(i).toStringFileFormat());
         }
         file.close();
      }
      catch (IOException e) { System.out.println(e); }
   }
   
   public void renameFile(String fileName, String newFileName)
   {
      System.out.println("Debugging renameFile()");
      
      File file = new File(fileName);
      File newFile = new File(newFileName);
      
      try{ file.createNewFile(); }
      catch (IOException e) { System.out.println(e);  }
      
      if (!file.renameTo(newFile))
      {
         System.out.println("Renaming went wrong");
      }
   }
   
   public ArrayList<User> searchArray(ArrayList<User> userArray, String searchQuery)
   {
      System.out.println("Debugging SearchArray()");
      
      ArrayList<User> userMatches = new ArrayList<User>();
      
      searchQuery = searchQuery.toLowerCase();
      
      for(int i = 0; i < userArray.size(); i++)
      {
         if((userArray.get(i).toString().toLowerCase()).contains(searchQuery.toLowerCase()))
         {
            userMatches.add(userArray.get(i));
         }
      }
      return userMatches;
   } 
}