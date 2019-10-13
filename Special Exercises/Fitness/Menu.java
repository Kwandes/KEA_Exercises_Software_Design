// Fitness Exercise, Menu setup
// Jan Bogoryja-Zakrzewski, Dat19i

import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

public class Menu{

   String title;
   boolean running;
   int screenNumber;
   boolean adminPerm;

   //Region - Menu navigation
   //-------------------------------------------------------------
   public Menu(String appName)
   {
      this.title = appName;
      this.running = true;
      this.screenNumber  = 1;
      this.adminPerm = false;
   }
   
   public void display()
   {
      while(running)
      {
         clearScreen();
         switch(screenNumber)
         {
            case 1:     mainMenu();       break;
            case 2:     showUsers();      break;
            case 3:     searchUsers();    break;
            case 4:     modifyUser();     break;
            case 5:     addUser();        break;
            case 6:     settingsMenu();   break;
            case 7:     quitMenu();       break;
            default:    quitMenu();       break;
         }
      }
   }
   
   public void mainMenu()
   {
      topBar("Main Menu");
      
      System.out.println(" What would you like to do: ");
      System.out.print(" 1. See all users \n 2. Modify a user \n 3. Add a new user \n 4. Settings \n 5. Quit \n");
      System.out.print(" >");
      
      switch(input().toLowerCase())
      {
         case "1":      this.screenNumber = 2;  break;
         case "2":      this.screenNumber = 4;  break;
         case "3":      this.screenNumber = 5;  break;
         case "4":      this.screenNumber = 6;  break;
         case "5":      this.screenNumber = 7;  break;
         case "quit":   this.screenNumber = 7;  break;
         default:       this.screenNumber = 1;  break;
      }
      
   }
   
   public void showUsers()
   {
      topBar("Users");
      
      displayAllUsers();
      
      System.out.println(" What would you like to do: ");
      System.out.print(" 1. Search for a specific user \n 2. Modify a user \n 3. Add a new user \n 4. Main Menu \n");
      System.out.print(" >");
      
      switch(input().toLowerCase())
      {
         case "1":      this.screenNumber = 3;  break;
         case "2":      this.screenNumber = 4;  break;
         case "3":      this.screenNumber = 5;  break;
         case "4":      this.screenNumber = 1;  break;
         default:       this.screenNumber = 2;  break;
      }
   }
   
   public void searchUsers()
   {
      topBar("Search");
      
      System.out.print(" Input User name or CPR number. If you want to return, input \"return\" \n");
      System.out.print(" >");
      
      switch(input().toLowerCase())
      {
         case "return": this.screenNumber = 1;  break;
         case "quit":   this.screenNumber = 1;  break;
         default:       this.screenNumber = 3;  break;
      }

   }

   
   public void modifyUser()
   {
      topBar("Modify user");
      
      System.out.print(" Input User name or CPR number. If you want to return, input \"return=\" \n");
      System.out.print(" >");
      
      switch(input().toLowerCase())
      {
         case "return": this.screenNumber = 1;  break;
         case "quit":   this.screenNumber = 1;  break;
         default:       this.screenNumber = 4;  break;
      }
   }
   
   public void addUser()
   {
      topBar("New User");
      
      System.out.print(" What is the name of the user? If you want to return, input \"return=\" \n");
      System.out.print(" >");
      
      String temp = input().toLowerCase();
      
      switch(temp)
      {
         case "return": this.screenNumber = 1;  break;
         case "quit":   this.screenNumber = 1;  break;
         default:       
            this.screenNumber = 1;
            addNewUser(temp);
            break;
      }
   }
   
      
   public void settingsMenu()
   {
      topBar("Options");
      
      System.out.print("Here are your options: \n");
      System.out.print(" - Suck a dick \n");
      System.out.print(" 1. Main Menu \n");
      System.out.print(" >");
      
      switch(input().toLowerCase())
      {
         case "1":            this.screenNumber = 1;  break;
         case "main menu":    this.screenNumber = 1;  break;
         case "quit":         this.screenNumber = 1;  break;
         default:             this.screenNumber = 6;  break;
      }
   }
   
   public void quitMenu()
   {
      this.running = false;
      this.screenNumber = 99;
   }
   
   public void topBar(String screenTitle)
   {
      System.out.println(this.title + " - " + screenTitle);
      System.out.println("------------------------------------------------");
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
   //-------------------------------------------------------------
   
   
   
   //Region - user logic
   //-------------------------------------------------------------
   public boolean checkPerms()
   {
      return adminPerm;
   }
   
   public void displayAllUsers()
   {
      Backend system = new Backend();
      system.displayAllContents();
      System.out.println("------------------------------------------------");
   }
   
   public void addNewUser(String name)
   {
      Backend system = new Backend();
      system.addNewUser("basic", "CPR12345", "true", name);   
   }
}