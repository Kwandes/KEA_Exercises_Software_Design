// Fitness Exercise, File working setup
// Jan Bogoryja-Zakrzewski, Dat19i

// Backend, handles all File operations and complex ArrayList operations
// Doesn't print anything to console

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.io.FileWriter;

public class Backend{

   public Backend(){}
   
   ///////////////////  ArrayList Operations /////////////////// 
   public ArrayList<User> modifyUser(ArrayList<User> userArray, String searchQuery, User modifiedUser)
   {     
      for(int i = 0; i < userArray.size(); i++)
      {
         if(userArray.get(i).toString().toLowerCase().contains(searchQuery.toLowerCase())) userArray.set(i, modifiedUser);
      }
      return userArray;
   }
   
   public ArrayList<User> deleteUser(ArrayList<User> userArray, String searchQuery)
   {      
      for(int i = 0; i < userArray.size(); i++)
      {
         if(userArray.get(i).toString().toLowerCase().contains(searchQuery.toLowerCase())) userArray.remove(i);
      }
      return userArray;
   }
   
   
   ///////////////////  File Operations /////////////////// 
   public ArrayList<User> readFile(String fileName)
   {
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
            String userHoursWorked = fileContent.next();
            String userName = fileContent.nextLine();
            userArray.add(new User(userType, userCPR, userHoursWorked, userName.replaceFirst(" ", "")));   // Weird bug, it adds a whitespace to the beginning of the name. Faisal halp
         }
      }
      catch (FileNotFoundException e) { System.out.println("Critcal error - file missing!\n" + e);   }
      
      return userArray;
   }
   
   public void saveToFile(ArrayList<User> userArray, String fileName)
   {
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