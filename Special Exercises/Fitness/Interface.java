// Fitness Exercise, User Interface setup
// Jan Bogoryja-Zakrzewski, Dat19i

// User interface handles displaying everything in console
// as well as user input
// Most of the code is here

import java.util.Scanner;
import java.util.ArrayList;

public class Interface{

   private String title;
   private boolean running;      // Is the Menu still active
   private int screenNumber;
   
   private boolean adminPerm;
   private String ADMIN_PASSWORD = "abcDEF123";   // yes, I should pull it from config or DB but KISS
   
   private String fileName;
   private ArrayList<User> userList;
   private ArrayList<User> searchResults;
   
   private Backend backend;
   
   ///////////////////// Menu Navigation /////////////////////
   public Interface(String appName)
   {
      this.title = appName;
      this.running = true;
      this.screenNumber  = 1;
      this.adminPerm = false;
      this.fileName = "userList.txt";
      
      backend = new Backend();
      userList = backend.readFile(fileName);
   }
   
   public void display()
   {
      while(running)
      {
         clearScreen();
         switch(screenNumber)
         {
            case 1:     mainMenu();       
               break;
            case 2:     showUsers();      
               break;
            case 3:     searchUsers();    
               break;
            case 4:     modifyUser(false);
               break;
            case 45:    modifyUser(true); 
               break;
            case 5:     addUser();        
               break;
            case 6:     settingsMenu();   
               break;
            case 7:     quitMenu();       
               break;
            default:    quitMenu();       
               break;
         }
      }
   }
   
   // Menus:
   
   // Screen 1
   public void mainMenu()
   {
      topBar("Main Menu");
   
      System.out.println(" What would you like to do: ");
      System.out.print(" [1] See all users \n [2] Search users \n [3] Add a new user \n [4] Modify a user \n [5] Remove a user \n [6] Quit \n");
      System.out.print(" >");
   
      switch(input().toLowerCase())
      {
         case "1":      this.screenNumber = 2;  
            break;
         case "2":      this.screenNumber = 3;  
            break;
         case "3":      this.screenNumber = 5;  
            break;
         case "4":      this.screenNumber = 4;  
            break;
         case "5":      this.screenNumber = 45; 
            break;
         case "6":      this.screenNumber = 7;  
            break;
         case "quit":   this.screenNumber = 7;  
            break;
         default:       this.screenNumber = 1;  
            break;
      }
      
   }
   
   // Screen 2
   public void showUsers()
   {
      topBar("Users");
      
      userList = backend.readFile(fileName);
      
      if(userList == null) System.out.println("<<< NO RESULTS >>>");
      else displayUsers(userList);
      System.out.println("----------------------------------------------------------------");
      
      System.out.println(" What would you like to do: ");
      System.out.print(" [1] Search for a specific user \n [2] Modify a user \n [3] Add a new user \n [4] Main Menu \n");
      System.out.print(" >");
      
      switch(input().toLowerCase())
      {
         case "1":      this.screenNumber = 3;  
            break;
         case "2":      this.screenNumber = 4;  
            break;
         case "3":      this.screenNumber = 5;  
            break;
         case "4":      this.screenNumber = 1;  
            break;
         default:       this.screenNumber = 2;  
            break;
      }
   }
   
   // Screen 3
   public void searchUsers()
   {
      topBar("Search");
      
      System.out.print(" Input your search query (a name, CPR, user type etc). If you want to return, input \"return\" \n");
      System.out.print(" >");
   
      String tempInput = input().toLowerCase();
   
      switch(tempInput)
      {
         case "return": this.screenNumber = 1;  
            break;
         case "quit":   this.screenNumber = 1;  
            break;
         default:
            clearScreen();
            topBar("Search Results \"" + tempInput + "\"");
            
            searchResults = backend.searchArray(userList, tempInput);
            
            if(searchResults.isEmpty()) System.out.println("<<< NO RESULTS >>>");
            else displayUsers(searchResults);
            System.out.println("----------------------------------------------------------------");
            searchResults = null;
            
            System.out.println(" What would you like to do: ");
            System.out.print(" [1] Perform another search \n [2] Modify a user \n [3] Delete a user \n [4] return \n");
            System.out.print(" >");
            tempInput = input().toLowerCase();
            
            switch(tempInput)
            {
               case "1":		   this.screenNumber = 3;  
                  break;
               case "2":         modifyUser(false);	this.screenNumber = 1;  
                  break;
               case "3":         modifyUser(true);	   this.screenNumber = 1;  
                  break;
               case "4":         this.screenNumber = 1;  
                  break;
               case "quit":	   this.screenNumber = 7;  
                  break;
               case "return":	   this.screenNumber = 1;	
                  break;
               default:          this.screenNumber = 1;  
                  break;
            }
            break;
      }
   
   }

   // Screen 4
   public void modifyUser(boolean deleteUser)
   {
      if(deleteUser)topBar("Delete User"); 
      else topBar("Modify User");
      
      // Check Admin perms
      if ( !adminLogon()) this.screenNumber = 1;
      
      System.out.print(" Input User name or CPR number. If you want to return, input \"return\" \n");
      System.out.print(" >");
      
      String tempInput = input().toLowerCase();
      System.out.println("----------------------------------------------------------------");
   
      switch(tempInput)
      {
         case "return":
            this.screenNumber = 1;  
            break;
            
         case "quit":
            this.screenNumber = 1;  
            break;
            
         default:
            
            boolean repeat = true;
            
            while(repeat)
            {
            
               searchResults = backend.searchArray(userList, tempInput);
               
               System.out.println("----------------------------------------------------------------");
               
               if(searchResults.isEmpty())
               {
                  System.out.println(" No results. Try using a different query. Type \"return\" to go back");
                  System.out.print(" >");
                  tempInput = input().toLowerCase();
                  System.out.println("----------------------------------------------------------------");
                  if(deleteUser) this.screenNumber = 45; 
                  else this.screenNumber = 4;
                  
                  // Return to main menu
                  if(tempInput.equals("return"))
                  {
                     this.screenNumber = 1;
                     break;
                  }
               }
               else if(searchResults.size() >= 2)
               {
                  System.out.println(" Multiple matches. Try using the CPR number. Type \"return\" to go back");
                  System.out.print(" >");
                  tempInput = input().toLowerCase();
                  System.out.println("----------------------------------------------------------------");
                  if(deleteUser) this.screenNumber = 45; 
                  else this.screenNumber = 4;
                  
                  // Return to main Menu
                  if(tempInput.equals("return"))
                  {
                     this.screenNumber = 1;
                     break;
                  }
               }
               else
               {
                  // tempInput is the searchQuery that will have only one match.
                  displayUsers(searchResults);                  
                  System.out.println("----------------------------------------------------------------");
                  repeat = false;
                  System.out.println("all good, proceeding");
                  //input();
                  this.screenNumber = 1;
                  
                  if(deleteUser)
                  {
                     userList = backend.deleteUser(userList, tempInput);
                  }
                  else
                  {
                     userList = backend.modifyUser(userList, tempInput, createNewUser(searchResults.get(0).getName()));
                  }
                  backend.saveToFile(userList, fileName);
                  searchResults = null;
               }
            }
            break;
      }
   }
   // Screen 5
   public void addUser()
   {
      topBar("New User");
      
      // Check Admin Perms
      if ( !adminLogon()) this.screenNumber = 1;
      else
      {
         System.out.print(" What is the name of the user ? If you want to return, type \"return\" \n");
         System.out.print(" >");
         
         String tempInput = input().toLowerCase();
         
         switch(tempInput)
         {
            case "return": this.screenNumber = 1;  
               break;
            case "quit":   this.screenNumber = 1;  
               break;
            default:       
               this.screenNumber = 1;
               userList.add(createNewUser(tempInput));
               backend.saveToFile(userList, fileName);
               break;
         }
      }
   }   
   
   // Screen 6
   public void settingsMenu()
   {
      topBar("Options");
      
      System.out.print("Here are your options: \n");
      System.out.print(" - Suck a dick \n");
      System.out.print(" [1] Main Menu \n");
      System.out.print(" >");
      
      switch(input().toLowerCase())
      {
         case "1":            this.screenNumber = 1;  
            break;
         case "main":    this.screenNumber = 1;  
            break;
         case "quit":         this.screenNumber = 1;  
            break;
         default:             this.screenNumber = 6;  
            break;
      }
   }
   
   // Screen 7
   public void quitMenu()
   {
      this.running = false;
      this.screenNumber = 99;
   }
   
   // Extra Interface displays
   
   public void topBar(String screenTitle)
   {
      System.out.println(this.title + " - " + screenTitle);
      System.out.println("----------------------------------------------------------------");
   }
   
   public String input()
   {
      Scanner console = new Scanner(System.in);
      return console.nextLine();      
   }
   
   public void clearScreen()
   {  
      System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");      // 30 newlines
   }
   //---------------------------------------------------
   
   
   
   ///////////////////// User Logic /////////////////////
   public void setPerms(boolean perms)
   {
      this.adminPerm = perms;
   }
   
   public boolean checkPerms()
   {
      return this.adminPerm;
   }
   
   public boolean adminLogon()
   {
      if(checkPerms()) 
         return true;
      
      System.out.println("you need admin permissions to perform this action.");
      System.out.print("password:>");
      if ( input().equals(ADMIN_PASSWORD))
      {
         setPerms(true);
         System.out.println("password is correct. Hello Admin");
         System.out.println("----------------------------------------------------------------");
         return true;
      }
      else 
      {  
         Logo accessDenied = new Logo();
         accessDenied.printLogo();
         System.out.println("Incorrect password. ACCESS DENIED");
         try {Thread.sleep(5000);}
         catch (InterruptedException e) {};
         clearScreen();
         return false;
      }
   }
   
   public void displayUsers(ArrayList<User> array)
   {
      if(array != null )
      {
         for(int i = 0; i < array.size(); i++)
         {
            System.out.println(array.get(i).toString());
         }
      }
   }
   
   public User createNewUser(String name)
   {
      Backend system = new Backend();
      
      String type = "basic";
      String cpr = "CPR69420";
      String hoursWorked = "0";
      
      boolean repeat = true;
      
      // CPR
      System.out.println("What is their CPR? Remember, 5 digits");
      
      while(repeat)
      {
         
         System.out.print(" >");
         cpr = input();
         if (cpr.length() == 8) repeat = false;
         else if (cpr.length() == 5) 
         {
            cpr = "CPR" + cpr;
            repeat = false;
         }
         else
         {
            System.out.println("The CPR is wrong. Please input correct CPR");      
         }
      }
      repeat = true;
      
      // User Type
      System.out.println("What is the type of the user:"
                           + "\n[1]an employee"
                           + "\n[2]a member");
      System.out.print(" >");
      type = input().toLowerCase();
      System.out.println("----------------------------------------------------------------");
      
      while(repeat)
      {
         if(type.equals("employee") || type.equals("e") || type.equals("1"))
         {
            System.out.println("What is their position:"
                                 + "\n[1]an admin"
                                 + "\n[2]a Instructor");
            System.out.print(" >");
            
            type = input().toLowerCase();
            
            System.out.println("----------------------------------------------------------------");
            while(repeat)
            {
               if( type.equals("admin") || type.equals("a") || type.equals("1"))
               {
                  type = "admin";
                  repeat = false;
               }
               else if ( type.equals("instructor") || type.equals("i") || type.equals("2"))
               {
                  type = "instructor";
                  repeat = false;
                  
                  // Hours Worked, on average
                  System.out.println("How many hours do they work, on avg:");
                  System.out.print(" >");
                  hoursWorked = input().toLowerCase();
                  System.out.println("----------------------------------------------------------------");
               }
               else
               {
                  System.out.println("Incorrect type. Please use either admin or instructor!");
                  System.out.print(" >");
                  type = input().toLowerCase();
                  System.out.println("----------------------------------------------------------------");
               }
            }
         }
         
         
         else if ( type.equals("member") || type.equals("m") || type.equals("2"))
         {
            System.out.println("What is their membership type:"
                                 + "\n[1]basic"
                                 + "\n[2]full");
            System.out.print(" >");
            System.out.println("----------------------------------------------------------------");
            
            type = input().toLowerCase();
            while(repeat)
            {
               
               if( type.equals("basic") || type.equals("b") || type.equals("1"))
               {
                  type = "basic";
                  repeat = false;
               }
               else if ( type.equals("full") || type.equals("f") || type.equals("2"))
               {
                  type = "full";
                  repeat = false;
               }
               else
               {
                  System.out.println("Incorrect type. Please use either basic or full!");
                  System.out.print(" >");
                  type = input().toLowerCase();
                  System.out.println("----------------------------------------------------------------");
               }
            }
         }
         else
         {
            System.out.println("Incorrect type. Please use either employee or member");
            System.out.print(" >");
            type = input().toLowerCase();
            System.out.println("----------------------------------------------------------------");
         }
      
      }
      repeat = true;
      
      return (new User(type, cpr, hoursWorked, name));
   }
}