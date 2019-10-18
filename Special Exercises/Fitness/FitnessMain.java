// Fitness Exercise, main Activity
// Jan Bogoryja-Zakrzewski, Dat19i

import java.util.ArrayList;

public class FitnessMain {

   public static void main(String[] args)
   {
      //Interface menu  = new Interface("Fitness Club");
      //menu.display();
      
      // GUI
      Interface gui = new Interface();
      
      gui.display();
      
      // GUI testing
      //GUI gui = new GUI();
      
      //gui.display();
      
      // a set of tests of all backend features. Creates multiple files.
      //testing();
   }
   
   public static void testing()
   {
      // test init
      Backend backend = new Backend();
      ArrayList<User> userArray = new ArrayList<User>();
      
      userArray.add(new User("CPR11111", "basic", "Test 1.0"));
      userArray.add(new User("CPR11112", "full", "Test 1.1"));
      userArray.add(new User("CPR11113", "admin", "Test 1.2"));
      userArray.add(new User("CPR11114", "Instructor", "Test 1.2"));
      userArray.add(new User("CPR11115", "basic", "Test 2.0"));
      userArray.add(new User("CPR11116", "basic", "Test 2.1"));
      
      // test saveToFile()
      backend.saveToFile(userArray, "testing_userlist.txt");
      
      // test readFile()
      userArray = backend.readFile("testing_userlist.txt");
      
      // test searchArray()
      ArrayList<User> searchResults = backend.searchArray(userArray, "basic");
      System.out.println("Expected results: 3 entries test 1.0, 2.0, 3.0");
      System.out.println("----------Search results--------");
      for(int i = 0; i < searchResults.size(); i++)
      {
         System.out.println(searchResults.get(i));
      }     
      System.out.println("--------------------------------");
      
      backend.saveToFile(searchResults, "testing_searchResult.txt");
      
      // test renameFile()
      backend.renameFile("old", "new");
      backend.renameFile("new", "old");
      
      // test deleteUser()
      userArray.add(new User("CPR11117", "basic", "Test MK3.0"));
      userArray.add(new User("CPR11118", "basic", "Test MK3.1-delete"));
      userArray.add(new User("CPR11119", "basic", "Test MK3.2"));
      
      backend.saveToFile(userArray, "testing_removalBase.txt");
      
      userArray = backend.deleteUser(userArray, "delete");
      
      backend.saveToFile(userArray, "testing_removalResult.txt");
      
      // test modifyUser
      userArray.add(new User("CPR11110", "basic", "Test MK4.0"));
      User modifiedUser = new User("CPR11110", "full", "Test MK4.1");
      backend.modifyUser(userArray, "Test MK4.0", modifiedUser);
      
      backend.saveToFile(userArray, "testing_userList.txt");
      
      System.out.println("Testing finished");
   }
}