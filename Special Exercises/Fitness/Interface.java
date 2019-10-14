// Fitness Exercise, User Interface setup
// Jan Bogoryja-Zakrzewski, Dat19i

import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

public class Interface{

   String title;
   boolean running;
   int screenNumber;
   boolean adminPerm;
   String ADMIN_PASSWORD = "abcDEF123";   // yes, I should pull it from config or DB but KISS
   
   //Region - Menu navigation
   //-------------------------------------------------------------
   public Interface(String appName)
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
      System.out.print(" [1] See all users \n [2] Modify a user \n [3] Add a new user \n [4] Settings \n [5] Quit \n");
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
      System.out.print(" [1] Search for a specific user \n [2] Modify a user \n [3] Add a new user \n [4] Main Menu \n");
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
      
      System.out.print(" Input User name or CPR number. If you want to return, input \"return\" \n");
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
         System.out.print(" What is the name of the user ? If you want to return, type \"return\" \n");
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
      System.out.print(" [1] Main Menu \n");
      System.out.print(" >");
      
      switch(input().toLowerCase())
      {
         case "1":            this.screenNumber = 1;  break;
         case "main":    this.screenNumber = 1;  break;
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
      if(checkPerms()) return true;
      
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
      System.out.println("What is the type of the user:"
                           + "\n[1]an employee"
                           + "\n[2]a member");
      System.out.print(" >");
      type = input().toLowerCase();
      System.out.println("------------------------------------------------");
      
      while(repeat)
      {
         if(type.equals("employee") || type.equals("e") || type.equals("1"))
         {
            System.out.println("What is their position:"
                                 + "\n[1]an admin"
                                 + "\n[2]a Instructor");
            System.out.print(" >");
            
            type = input().toLowerCase();
            
            System.out.println("------------------------------------------------");
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
               }
               else
               {
                  System.out.println("Incorrect type. Please use either admin or instructor!");
                  System.out.print(" >");
                  type = input().toLowerCase();
                  System.out.println("------------------------------------------------");
               }
            }
         }
         
         
         else if ( type.equals("member") || type.equals("m") || type.equals("2"))
         {
            System.out.println("What is their membership type:"
                                 + "\n[1]basic"
                                 + "\n[2]full");
            System.out.print(" >");
            System.out.println("------------------------------------------------");
            
            type = input().toLowerCase();
            while(repeat)
            {
               System.out.println("DEBUGGING <userType - member>");
               
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
                  System.out.println("------------------------------------------------");
               }
            }
            
            // Payed?
            System.out.println("Did they pay for their membership:"
                                 + "\n[1]Yes"
                                 + "\n[2]No");
            System.out.print(" >");
            System.out.println("------------------------------------------------");
            
            paymentStatus = input().toLowerCase();
            
            repeat = true;
            
            while(repeat)
            {
               if( paymentStatus.equals("yes") || paymentStatus.equals("y") || paymentStatus.equals("1"))
               {
                  paymentStatus = "true";
                  repeat = false;
               }
               else if ( paymentStatus.equals("no") || paymentStatus.equals("n") || paymentStatus.equals("2"))
               {
                  paymentStatus = "false";
                  repeat = false;
               }
               else
               {
                  System.out.println("Incorrect type. Please use either yes or no!");
                  System.out.print(" >");
                  paymentStatus = input().toLowerCase();
                  System.out.println("------------------------------------------------");
               }
            }
         }
         else
         {
            System.out.println("Incorrect type. Please use either employee or member");
            System.out.print(" >");
            type = input().toLowerCase();
            System.out.println("------------------------------------------------");
         }
      
      }
      repeat = true;
      
      if(type.equals("admin") || type.equals("instructor")) system.addNewUser(type, cpr, name);   
      else system.addNewUser(type, cpr, paymentStatus, name);
   }
}