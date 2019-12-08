// Chapter 10, Exercise 15
// Jan Bogoryja-Zakrzewski, Dat19i
// There are no interesting exercises in this chapter

import java.util.ArrayList;
import java.util.Scanner;

public class FilterRange{

   private final static int MIN = 10;
   private final static int MAX = 20;
   
   public static void filterRange(ArrayList<Integer> arr, int min, int max)
   {  
      // The redundant bit
      Musik music = new Musik();
      
      // The important bit
      for(int i = 0; i < arr.size(); i++)
      {
         if( (arr.get(i) >= min) && (arr.get(i) <= max) )
         {
            arr.remove(i--);
         }
      }
   }
   
   // The lazy/smart bit
   public static void printArr(ArrayList<Integer> arr)
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
      ArrayList<Integer> arr = new ArrayList<Integer>();
      arr.add(1);
      arr.add(9);
      arr.add(10);
      arr.add(11);
      arr.add(15);
      arr.add(19);
      arr.add(20);
      arr.add(21);
      arr.add(69);
      
      printArr(arr);
      
      // The important bit
      filterRange(arr, MIN, MAX);
      
      printArr(arr);
      
      // The redundant bit
      System.out.println("Press ENTER to quit");
      Scanner console = new Scanner(System.in);
      console.nextLine();
   }
}