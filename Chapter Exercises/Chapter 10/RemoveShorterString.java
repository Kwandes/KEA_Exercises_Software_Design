// Chapter 10, Exercise 14
// Jan Bogoryja-Zakrzewski, Dat19i
// There are no interesting exercises in this chapter

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveShorterString{

   private static String buffer;
   
   public static void removeShorterString(ArrayList<String> arr)
   {  
      // The redundant bit
      Musik music = new Musik();
      
      // The important bit
      for(int i = 0; i < arr.size()-1; i++)
      {
         if( arr.get(i).length() <= arr.get(i+1).length() ) arr.remove(i);
         else arr.remove(i+1);
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
      arr.add("Tara");
      arr.add("Hashire");
      arr.add("ref");
      arr.add("sori");
      arr.add("io");
      arr.add("yo");
      arr.add("kaze");
      arr.add("yur");
      arr.add("te");
      arr.add("no");
      arr.add("jou");
      arr.add("you");
      arr.add("za");
      arr.add("ni");
      arr.add("Ferisk");
      arr.add("tsukimihara");
      arr.add("Jo");
      arr.add("wo");
      arr.add("faisal");
      arr.add("PADORU");
      arr.add("faisal");
      arr.add("PADORU");
      
      printArr(arr);
      
      // The important bit
      removeShorterString(arr);
      
      printArr(arr);
      
      // The redundant bit
      System.out.println("Press ENTER to quit");
      Scanner console = new Scanner(System.in);
      console.nextLine();
   }
}