// Chapter 6, Exercise 2
// Jan Bogoryja-Zakrzewski, Dat19i

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.Math;

public class OddNumbers {

   private static Scanner file;   // Java sucks, I don't know how references work in this case, idk if the scanner in oddNumbers is this.file or local file but whatever

   public static void oddNumbers(Scanner file)
   {
      int count = 0;
      int sum = 0;
      int oddCount = 0;
      int temp;
      
      while(file.hasNext())
      {
         temp = Integer.parseInt(file.next());
         
         count++;
         sum += temp;
         if(temp % 2 != 0) oddCount ++;
      }
      System.out.println(count + " numbers, sum = " + sum);
      System.out.println(oddCount + " odds ("+ (double)Math.round((double)oddCount/count*10000)/100 + "%)"); // Perfect double formating solution
   }   

   public static void main(String[] args)
   {
      boolean fileExists = true;
      
      try { file = new Scanner(new File("genericFileNameForTheSecondExercise.txt")); }
      catch (FileNotFoundException e) { System.out.println(">>> " + e); fileExists = false;}
      
      if(fileExists) oddNumbers(file);
   }
}