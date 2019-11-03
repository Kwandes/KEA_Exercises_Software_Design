// Chapter 6, Exercise 5
// Jan Bogoryja-Zakrzewski, Dat19i

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.Math;

public class QuadSpaces {

   private static Scanner file;

   public static void quadSpaces(Scanner file)
   {
      int count = 0;
      while(file.hasNext())
      {
         System.out.print(file.next() + "    ");
         
         // Extra bit for nicer formatting
         count++;
         if (count == 4)
         {
            System.out.println();
            count = 0;
         }
      }
   }

   public static void main(String[] args)
   {
      boolean fileExists = true;
      
      try { file = new Scanner(new File("_.txt")); }
      catch (FileNotFoundException e) { System.out.println(">>> " + e); fileExists = false;}
      
      if(fileExists) 
      {
         quadSpaces(file);
      }
   }
}