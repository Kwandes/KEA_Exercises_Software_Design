// Chapter 3, Exercise 6
// Jan Bogoryja-Zakrzewski, Dat19i

import java.lang.Math;

public class Foo3Bar6{

   public static int smallerAbsVal(int a, int b)
   {
      if( Math.abs(a) <= Math.abs(b)) return Math.abs(a);
      else return Math.abs(b);   
   }
   
   public static void main(String[] args)
   {
      int a = -2;
      int b = 6;
      
      System.out.println("Smaller abs var: " + smallerAbsVal(a, b));
   }
}