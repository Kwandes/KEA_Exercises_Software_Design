// Chapter 4 Exercise 16
// Jan Bogoryja-Zakrzewski, Dat19i

import java.util.Scanner;
import java.util.InputMismatchException;

public class Palindrome{

   public static void printPalindrome(String string)
   {
      boolean isPalindrome = true;
      
      for (int i = 0 ; i < string.length()/2 ; i++)
      {
         if(string.charAt(i) != string.charAt(string.length()-i-1))
         {
            isPalindrome = false;
            break;
         }
      }
      System.out.print(" Is '" + string + "' a palindrome? Verdict: " + isPalindrome);
   }
   
   
   
   
   
   
   
   public static void main(String[] args)
   {
      Scanner console  = new Scanner(System.in);
      
      System.out.print("Write a string to check for bein a palidrome: ");
      printPalindrome(console.nextLine());
      
   }
}