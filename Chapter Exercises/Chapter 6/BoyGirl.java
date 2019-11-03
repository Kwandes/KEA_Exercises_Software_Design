// Chapter 6, Exercise 1
// Jan Bogoryja-Zakrzewski, Dat19i

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.Math;

public class BoyGirl {
   
   private static Scanner file;

   public static void boyGirl(Scanner file)
   {
      int boysCount = 0;
      int boysSum = 0;
      int girlsCount = 0;
      int girlsSum = 0;
      
      while(file.hasNext())
      {
         if( file.next().endsWith("a") )     // All polish names end with 'a' so imma use that because yes
         {
            girlsCount++;
            girlsSum += Integer.parseInt(file.next());  
         }
         else
         {
            boysCount++;
            boysSum += Integer.parseInt(file.next());
         }
      }
      System.out.println( boysCount + " boys, " + girlsCount + " girls\n" + "Difference between boys' and girls' sum: " + Math.abs(boysSum - girlsSum));
   }
   
   public static void main(String[] args)
   {
      boolean fileExists = true;
      
      try { file = new Scanner(new File("genericFileName.txt")); }
      catch (FileNotFoundException e) { System.out.println(">>> " + e); fileExists = false;}
      
      if(fileExists) boyGirl(file);
   }
}