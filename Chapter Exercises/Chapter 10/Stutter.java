// Chapter 10, Exercise 11
// Jan Bogoryja-Zakrzewski, Dat19i
// There are no interesting exercises in this chapter

import java.util.ArrayList;
import java.util.Scanner;

public class Stutter{
   
   private static final int STUTTER_AMOUNT = 4;
   
   public static void stutter(ArrayList<String> arr)
   {  
      // The redundant bit
      Musik music = new Musik();
      
      // The important bit
      for(int i = 0; i < arr.size(); i++)
      {
         for(int j = 0; j < STUTTER_AMOUNT-1; j++)
         {
            arr.add(i, arr.get(i));
         }
         i += STUTTER_AMOUNT-1;
      }
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
      arr.add("Are");
      arr.add("You");
      arr.add("Se");
      arr.add("Seriously");
      arr.add("Makk");
      arr.add("Makking");
      arr.add("Fun");
      arr.add("Of");
      arr.add("My");
      arr.add("Disability???!");
      
      printArr(arr);
      
      // The important bit
      stutter(arr);
      
      printArr(arr);
      
      // The redundant bit
      System.out.println("Press ENTER to quit");
      Scanner console = new Scanner(System.in);
      console.nextLine();
   }
}