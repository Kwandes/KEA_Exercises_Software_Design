// Chapter 10, Exercise 12
// Jan Bogoryja-Zakrzewski, Dat19i
// There are no interesting exercises in this chapter

import java.util.ArrayList;
import java.util.Scanner;

public class MarkLength4{
   
   private static final char FILLER_SYMBOL = '*';
   private static final int FILLER_AMOUNT = 4;
   
   public static void markLength4(ArrayList<String> arr)
   {  
      // The redundant bit
      Musik music = new Musik();
      
      // The important bit
      for(int i = 0; i < arr.size(); i++)
      {
         if (arr.get(i).length() == 4) arr.add(i, generateFillerLine());
         i++;
      }
   }
   
   // OverEngineering ftw
   public static String generateFillerLine()
   {
      String fillerLine = "";
      for ( int i = 0; i < FILLER_AMOUNT; i++)
      {
         fillerLine += FILLER_SYMBOL;
      }
      return fillerLine;
   }
   
   // The lazy/smart bit
   public static void printArr(ArrayList<String> arr)
   {
      System.out.print("Arr: [");
      for(int i = 0; i < arr.size(); i++)
      {
         if(i == arr.size()-1) System.out.print(arr.get(i));
         else System.out.print(arr.get(i) + ",");
      }      
      System.out.println("]");
   }

   public static void main(String[] args)
   {  
      // Init and populate
      ArrayList<String> arr = new ArrayList<String>();
      arr.add("Hello");
      arr.add("World");
      arr.add("Today");
      arr.add("I");
      arr.add("Suffer");
      arr.add("Due");
      arr.add("To");
      arr.add("Immense");
      arr.add("Pain");
      arr.add("Life");
      arr.add("Causes");
      arr.add("Me");
      arr.add("jk btw");
      
      printArr(arr);
      
      // The important bit
      markLength4(arr);
      
      printArr(arr);
      
      // The redundant bit
      System.out.println("Press ENTER to quit");
      Scanner console = new Scanner(System.in);
      console.nextLine();
   }
}