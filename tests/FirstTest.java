// Chapter 6, First test
// Jan Bogoryja-Zakrzewski, Dat19i

import java.util.Scanner;
//import java.util.File;     // tried to guess the lib but I have failed

public class FirstTest{
   
   final static public int[] INT_ARRAY = {1,2,3,1,5,6,7,8,9,1};      // array for task 2
   
   // task 1
   public static void average()
   {
      Scanner console = new Scanner(System.in);
      int counter = 0;
      double tmp;
      
      for (int i = 1; i <= 5; i++)
      {
         System.out.print("Input the " + i + " decimal: ");
         tmp = console.nextDouble();
         if (tmp < 50.4 || tmp > 100.0) counter++;         
      }
      System.out.println("Amount of numbers below 50.4 or above 100: " + counter);
   }
   
   // task 2
   // this is going to be ugly and inefficient, sorry
   public static void searchForDuplicates()
   {
      for (int i = 0; i < INT_ARRAY.length; i++)
      {
         for (int j = i+1; j < INT_ARRAY.length; j++)
         {
            if (INT_ARRAY[i] == INT_ARRAY[j]) System.out.println("duplicate: " + INT_ARRAY[j]);
         }
      }      
   }
   
   // task 3
   // haven't read chapter 6 yet, sorry I've been sick   
   public static void saveInput()
   {
      //File f = new File("task3.txt");
      Scanner input = new Scanner(System.in);
      //f  = input;
   }
   
   // task 4
   // just gonna print out the reversed array, instrucions not clear/verbose enough
   public static void reverseArray()
   {
      int[] array = {1,2,3,4,5,6,7,8,9};
      int[] reversedArray = {0,0,0,0,0,0,0,0,0};   // I forgot how to init an array in java
      for (int i = 0; i < array.length; i++)
      {
         reversedArray[i] = array[array.length - i -1];
      }
      System.out.print("Reversed array contains {");
      for (int i = 0; i < array.length; i++)
      {
         System.out.print( reversedArray[i] + ",");
      }
      System.out.println("}");
   }
   
   // task 7
   public static void printStuff(int base, int multiplicator, int n)
   {
      System.out.print("The bass is " + base + ", times " + multiplicator + ", and all that calculated " + n + " times. \nResult: ");
      for(int i = 0; i < n; i ++)
      {
         System.out.print(base + ", ");
         base *= multiplicator;
      }
      System.out.println();
   }
   
   public static void main(String[] args)
   {
      System.out.println("Time for the GREAT EVALUATION TEST");
      System.out.println("\n\n##TASK NUMBER ONE:\n");
   
      average();  // task 1 - input 5 decimals in console
      
      System.out.println("\n\n##TASK NUMBER TWOO:\n");
      searchForDuplicates();  // task 2, uses a constant INT_ARRAY array
      
      System.out.println("\n\n##TASK NUMBER THREEE:\n");
      saveInput();   // task 3, saves to file task3.txt
      
      System.out.println("\n\n##TASK NUMBER FOURR:\n");
      reverseArray();   // task 4
      
      System.out.println("\n\n##TASK NUMBER FUNFF (and almost sixxx):\n");
      Program.TestTicket.initTickets();   // Task 5. Also, Task 6 sucks.
      
      System.out.println("\n\n##TASK NUMBER SEVVEN:\n");
      printStuff(1, 2, 9); // task 7. parameters: base, multiplicator, amount of mulitplications
   }
}