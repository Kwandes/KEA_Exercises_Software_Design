// Chapter 2, Exercise 7
// Jan Bogoryja-Zakrzewski, Dat19i
// The goal was to draw this shape with the smallest amount of loops possible WITHOUT using if etc

import java.lang.Math;

public class NestedLoops{
   
   final static int PYRAMID_WIDTH = 3;    // the h of the triangle

   public static void main(String[] args)
   {
      
      int pyramidHeight = PYRAMID_WIDTH - 1; //The longest edge of a triangle
      
      // Main loops defines amount of lines, in this case being 5
      for(int i = pyramidHeight; i >= pyramidHeight * -1; i--)
      {
         // using abs value of i we can have a margin that looks this way
         for(int j = 0; j < Math.abs(i); j ++)
         {
            System.out.print("  ");
         }
         
         for(int j = 0; j < ( PYRAMID_WIDTH - Math.abs(i)) ; j ++)
         {
            System.out.print("5 ");
         }
        System.out.println();
      }
   }
}