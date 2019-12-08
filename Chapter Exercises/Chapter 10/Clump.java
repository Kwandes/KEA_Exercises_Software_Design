// Chapter 10, Exercise 16
// Jan Bogoryja-Zakrzewski, Dat19i
// There are no interesting exercises in this chapter

import java.util.ArrayList;
import java.util.Scanner;

public class Clump{
   
   public static void clump(ArrayList<String> arr)
   {  
      // The redundant bit
      Musik music = new Musik();
      
      // The important bit
      for(int i = 0; i < arr.size()-1; i++)
      {
         arr.set(i, ("(\"" + arr.get(i) + " " + arr.get(i+1) + "\")"));
         arr.remove(i+1);
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
      arr.add("Never");
      arr.add("Gonna");
      arr.add("Give");
      arr.add("You");
      arr.add("Up");
      arr.add("Town");
      arr.add("Funk");
      
      printArr(arr);
      
      // The important bit
      clump(arr);
      
      printArr(arr);
      
      // The redundant bit
      System.out.println("Press ENTER to quit");
      Scanner console = new Scanner(System.in);
      console.nextLine();
   }
}