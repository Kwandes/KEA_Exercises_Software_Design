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
   String ADMIN_PASSWORD = "abcDEF123";   // yes, I should pull it from config or DB but KISS
   
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
      
      if ( !adminLogon()) this.screenNumber = 1;
      else
      {
         System.out.print(" What is the name of the user? If you want to return, input \"return=\" \n");
         System.out.print(" >");
         
         String tempInput = input().toLowerCase();
         
         switch(tempInput)
         {
            case "return": this.screenNumber = 1;  break;
            case "quit":   this.screenNumber = 1;  break;
            default:       
               this.screenNumber = 1;
               addNewUser(tempInput);
               break;
         }

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
      System.out.println("you need admin permissions to perform this action.");
      System.out.print("password:>");
      if ( input().equals(ADMIN_PASSWORD))
      {
         setPerms(true);
         System.out.println("password is correct. Hello Admin");
         return true;
      }
      else 
      {
         System.out.println("Incorrect password. ACCESS DENIED");
         try {Thread.sleep(2000);}
         catch (InterruptedException e) {};
         clearScreen();
         return false;
      }
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
      
      String type = "basic";
      String cpr = "CPR69420";
      String paymentStatus = "false";
      
      boolean repeat = true;
      
      // Name
      //System.out.println("What is the name of the new user?");
      //System.out.print(" >");
      //name = input().toUpperCase();
      
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
      
      // Type
      System.out.println("What is the type of the user:
                           + "\n[1]an employee
                           + "\n[2]a member");
      System.out.print(" >");
      type = input();
      
      while(repeat)
      {
         if(type.equals("employee") || type.equals("e") || type.equals("1"))
         {
            System.out.println("What is their position, an admin or a Instructor?");
            System.out.print(" >");
            type = input().toLowerCase();
            while(repeat)
            {
               if( type.equals("admin") || type.equals("a") || type.equals("1"))
               {
               
               }
               else if ( type.equals("
            }
            repeat = false;
         }
         else if ( type.equals("member") || type.equals("m") || type.equals("2"))
         {
            type = "member";
            repeat = false;
         }
         else
         {
            System.out.println("Incorrect type. Please use either employee or member");
            System.out.print(" >");
            type = input().toLowerCase();
         }
      
      }
      repeat = true;
      
      if(type.equals("employee") || type.equals("e") || type.equals("1"))
      {
         
         
         while( !type.equals("admin") && !type.equals("instructor") && !type.equals("a") && !type.equals("i"))
         {
            System.out.println("Incorrect type. Please use either admin or instructor");
            System.out.print(" >"); 
            type = input().toLowerCase();
         }
         
      }
      
      if(type.equals("member") || type.equals("m"))
      {
         System.out.println("What is their membership, basic or Full?");
         System.out.print(" >");
         type = input().toLowerCase();
         
         while( !type.equals("basic") && !type.equals("full") && !type.equals("b") && !type.equals("f"))
         {
            System.out.println("Incorrect type. Please use either basic or full");
            System.out.print(" >");
            type = input().toLowerCase();
         }
         
         // Payed?
         System.out.println("Did they pay for their membership? (Yes/No)");
         System.out.print(" >");
         
         paymentStatus = input().toLowerCase();
         
         while( !type.equals("yes") && !type.equals("no") && !type.equals("y") && !type.equals("n"))
         {
            System.out.println("Incorrect answer. YES or NO??");
            System.out.print(" >");
            paymentStatus = input().toLowerCase();
         }
      }
      
      
      
      
      system.addNewUser(type, cpr, paymentStatus, name);   
   }
}