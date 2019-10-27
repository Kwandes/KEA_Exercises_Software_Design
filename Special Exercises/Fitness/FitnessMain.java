// Fitness Exercise, main Activity
// Jan Bogoryja-Zakrzewski, Dat19i

import java.util.ArrayList;

public class FitnessMain {

   public static void main(String[] args)
   {
      // a set of tests of all backend features. Creates multiple files.
      runUnitTests(false);
      
      Interface menu  = new Interface("Fitness Club");
      menu.display();
      
   }
   
   public static void runUnitTests(boolean showDetails)
   {
      /////////////////// testing init ///////////////////
      boolean success = true;
      Backend backend = new Backend();
      ArrayList<User> userArray = new ArrayList<User>();
      
      userArray.add(new User("basic", "CPR11111","0", "Test 1.0"));
      userArray.add(new User("full", "CPR11112", "0", "Test 1.1"));
      userArray.add(new User("admin", "CPR11113", "0", "Test 1.2"));
      userArray.add(new User("instructor", "CPR11114", "15", "Test 1.2"));
      userArray.add(new User("basic", "CPR11115", "0", "Test 2.0"));
      userArray.add(new User("basic", "CPR11116", "0", "Test 2.1"));
      
      /////////////////// saveToFile() ///////////////////
      System.out.print("Save to file() :");
      try{ backend.saveToFile(userArray, "testing_userlist.txt"); }
      catch (Exception e)
      {
         success = false;
         if (showDetails) System.out.println(e);
      }
      if (success) System.out.println(" Success\n");
      else
      {
         System.out.println(" Failed\n");
         success = true;
      }
      
      /////////////////// readFile() ///////////////////
      System.out.print("Read file() :");
      try{ userArray = backend.readFile("testing_userlist.txt"); }
      catch (Exception e)
      {
         success = false;
         if (showDetails) System.out.println(e);
      }
      if (success) System.out.println(" Success\n");
      else
      {
         System.out.println(" Failed\n");
         success = true;
      }
      
      /////////////////// searchArray() ///////////////////
      try
      {
         System.out.print("Search Array() :");
         ArrayList<User> searchResults = backend.searchArray(userArray, "");
         if (showDetails)
         {
            System.out.println("Expected results: 3 entries test 1.0, 2.0, 3.0");
            System.out.println("----------Search results--------");
            for(int i = 0; i < searchResults.size(); i++)
            {
               System.out.println(searchResults.get(i));
            }     
            System.out.println("--------------------------------");
         }
         
         backend.saveToFile(searchResults, "testing_searchResult.txt");
      }
      catch (Exception e)
      {
         success = false;
         if (showDetails) System.out.println(e);
      }
      if (success) System.out.println(" Success\n");
      else
      {
         System.out.println(" Failed\n");
         success = true;
      }
      
      
      /////////////////// renameFile() ///////////////////
      System.out.print("Rename File() :");
      try{ backend.renameFile("old", "new");
      backend.renameFile("new", "old"); }
      catch (Exception e)
      {
         success = false;
         if (showDetails) System.out.println(e);
      }
      if (success) System.out.println(" Success\n");
      else
      {
         System.out.println(" Failed\n");
         success = true;
      }

      
      /////////////////// deleteUser() ///////////////////
      System.out.print("Delete User() :");
      try
      {
         userArray.add(new User("basic", "CPR11117", "0", "Test MK3.0"));
         userArray.add(new User("basic", "CPR11118", "0", "Test MK3.1-delete"));
         userArray.add(new User("basic", "CPR11119", "0", "Test MK3.2"));
         
         backend.saveToFile(userArray, "testing_removalBase.txt");
         
         userArray = backend.deleteUser(userArray, "delete");
         
         backend.saveToFile(userArray, "testing_removalResult.txt");
      }
      catch (Exception e)
      {
         success = false;
         if (showDetails) System.out.println(e);
      }
      if (success) System.out.println(" Success\n");
      else
      {
         System.out.println(" Failed\n");
         success = true;
      }
      
      /////////////////// modifyUser() ///////////////////
      System.out.print("Modify User() :");
      try
      {
         userArray.add(new User("basic", "CPR11110", "0", "Test MK4.0"));
         User modifiedUser = new User("full", "CPR11110", "0", "Test MK4.1");
         backend.modifyUser(userArray, "Test MK4.0", modifiedUser);
         
         backend.saveToFile(userArray, "testing_userList.txt");
      }
      catch (Exception e)
      {
         success = false;
         if (showDetails) System.out.println(e);
      }
      if (success) System.out.println(" Success\n");
      else
      {
         System.out.println(" Failed\n");
         success = true;
      }
      
      System.out.println("Testing finished");
   }
}