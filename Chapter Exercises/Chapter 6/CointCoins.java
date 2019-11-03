// Chapter 6, Exercise 4
// Jan Bogoryja-Zakrzewski, Dat19i

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.Math;

public class CointCoins {  // typo in the book

   private static Scanner file;

   public static void cointCoins(Scanner file)  // method name has a typo in the book too so /shrug. Although maybe it is not a typo as it is a real word...but still weird
   {
      int sum = 0;
      int count = 0;
      int value;
      
      while(file.hasNext())
      {
         value = Integer.parseInt(file.next());
         
         switch(file.next().toLowerCase())
         {
            case "pennies":   sum += value;     break;
            case "nickels":   sum += value*5;   break;
            case "dimes":     sum += value*10;  break;
            case "quarters":  sum += value*25;  break;
            default: System.out.println("invalid coin, get out with your fake money"); break;
         }
      }
      System.out.println("Total $$$: " + sum/100 + "." + sum%100/10 + sum%10);
   }

   public static void main(String[] args)
   {
      boolean fileExists = true;
      
      try { file = new Scanner(new File("uniqueNameJustForExercise4.txt")); }
      catch (FileNotFoundException e) { System.out.println(">>> " + e); fileExists = false;}
      
      if(fileExists) 
      {
         cointCoins(file);
      }
   }
}