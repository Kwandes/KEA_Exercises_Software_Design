// Chapter 4, Exercise 9
// Jan Bogoryja-Zakrzewski, Dat19i
// Yes, ctrl-c ctrl-v

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class OddSumMax{

   public static void oddSumMax()
   {
      Scanner console = new Scanner(System.in);
      int nOfNumbers = 0;
      int consoleOutput;
      int max = -1;  //Exercise allows me to assume there will be at least one >-1 int
      int sum = 0;
      
      
      System.out.print("How manu numbers do you want to enter? ");
      try
      {     
      nOfNumbers = console.nextInt();
      }
      catch(InputMismatchException e)
      {
         System.out.println ("invalid value, must be an int. N set to 4");
         console.next();   // getting rid of a non-int token
         nOfNumbers = 4;
      }
            
      for(int i = 1; i <= nOfNumbers; i ++)
      {
         System.out.print("Number " + i + ": ");
         consoleOutput = console.nextInt();
         if (consoleOutput % 2 != 0 )
         {
            if (consoleOutput > max) max = consoleOutput;            
            sum += consoleOutput;
         }
      }
      
      System.out.println("Sum of odd nums: " + sum + " | Biggest odd number: " + max);
      
   }

   public static void main(String[] args)
   {
      oddSumMax();
   }
}