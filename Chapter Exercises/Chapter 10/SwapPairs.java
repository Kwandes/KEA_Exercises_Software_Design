// Chapter 10, Exercise 11
// Jan Bogoryja-Zakrzewski, Dat19i
// There are no interesting exercises in this chapter

import java.util.ArrayList;
import java.util.Scanner;

public class SwapPairs{

   private static String buffer;
   
   public static void swapPairs(ArrayList<String> arr)
   {  
      // The redundant bit
      Musik music = new Musik();
      
      // The important bit
      for(int i = 0; i < arr.size()-1; i++)
      {
         buffer = arr.get(i);
         arr.set(i, arr.get(i+1));
         arr.set(i+1, buffer);
         i++;
      }
   }
   
   // The lazy/smart bit
   public static void printArr(ArrayList<String> arr)
   {
      System.out.print("Arr: [");
      for(int i = 0; i < arr.size(); i++)
      {
         if(i == arr.size()-1) System.out.print(arr.get(i));
         else System.out.print(arr.get(i) + " "); // using ' '  instead of ',' because the ',' is used within the sentence
      }      
      System.out.println("]");
   }

   public static void main(String[] args)
   {  
      // Init and populate
      ArrayList<String> arr = new ArrayList<String>();
      arr.add("Try");
      arr.add("No!");
      arr.add("Do");
      arr.add("not!");
      arr.add("do");
      arr.add("or");
      arr.add("there");
      arr.add("not,");
      arr.add("no");
      arr.add("is");
      arr.add("try.");
      
      printArr(arr);
      
      // The important bit
      swapPairs(arr);
      
      printArr(arr);
      
      // The redundant bit
      System.out.println("Press ENTER to quit");
      Scanner console = new Scanner(System.in);
      console.nextLine();
   }
}