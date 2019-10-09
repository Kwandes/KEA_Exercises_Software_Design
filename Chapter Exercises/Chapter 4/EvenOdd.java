// Chapter 4, Exercise 9
// Jan Bogoryja-Zakrzewski, Dat19i

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOdd{

   public static void evenOdd()
   {
      Scanner console = new Scanner(System.in);
      int nOfNumbers = 0;
      int evenCounter = 0;
      int oddCounter = 0;
      
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
         if (console.nextInt() % 2 == 0 ) evenCounter++;
         else oddCounter++;
      }
      
      System.out.println("Count of Even numbers = " + evenCounter);
      System.out.println("Count of Odd numbers = " + oddCounter);
      
   }

   public static void main(String[] args)
   {
      evenOdd();
   }
}