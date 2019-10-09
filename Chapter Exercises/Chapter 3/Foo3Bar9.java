// Chapter 3, Exercise 9
// Jan Bogoryja-Zakrzewski, Dat19i
// Exercise 8 is too hard for my lazy brain

import java.lang.Math;

public class Foo3Bar9{

   public static int sumOfDigits(int integer)
   {
      return Math.abs((integer / 100) + (integer / 10) % 10 + (integer % 10)); 
   }

   public static void main(String[] args)
   {
      System.out.print(sumOfDigits(-931));
   }
}