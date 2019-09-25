// Chapter 3, Exercise 16
// Jan Bogoryja-Zakrzewski
// Last exericise in this stupid easy chapter

import java.lang.Math;

public class Foo3Bar16{

   public static double triangleArea(int a, int b, int c)
   {
      //never heard of this formula
      double result;
      result = Math.sqrt( ( (a+b+c) * (-a + b + c) * ( a - b + c) * (a + b - c) ) / 16 );
      return result;
   }
   
   public static int trianglePerimiter(int a, int b, int c)
   { return a+b+c; }
   
   public static void main(String[] args)
   {
      int a = 8;
      int b = 8;
      int c = 8;
      System.out.println("Triangle area: " + triangleArea(a, b, c));
      System.out.println("Triangle perimeter: " + trianglePerimiter(a, b, c));
   }
}
