// Chapter 6, Exercise 3
// Jan Bogoryja-Zakrzewski, Dat19i

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.Math;

public class PositiveSum {

   private static Scanner file;

   public static boolean positiveSum(Scanner file)
   {
      int sum = 0;
      boolean isSumPositive = false;
      int count = 0;
      
      while(file.hasNext())
      {
         sum += Integer.parseInt(file.next());
         count++;
         if(sum > 0)
         {
            isSumPositive = true;
            break;
         }
      }
      if(isSumPositive)
      {
         System.out.println("Sum of " + sum + " after " + count + " steps");
      }
      else System.out.println("no positive sum");
      return isSumPositive;
   }

   public static void main(String[] args)
   {
      boolean fileExists = true;
      
      try { file = new Scanner(new File("genericFileNameForTheThirdOutOfFiveExercises.txt")); }
      catch (FileNotFoundException e) { System.out.println(">>> " + e); fileExists = false;}
      
      if(fileExists) 
      {
         positiveSum(file);   // I don't do anythign with the return so...
      }
   }
}