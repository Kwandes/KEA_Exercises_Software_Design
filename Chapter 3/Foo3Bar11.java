// Chapteer 3, Exercise 11
// Jan Bogoryja-Zakrzewski, Dat19i

import java.lang.Math;

public class Foo3Bar11{

   public static double distance(int x1, int y1, int z1, int x2, int y2, int z2)
   {
      return Math.sqrt( (x1 - y1) * (x1 - y1) + (y1 - y2)*(y1 - y2) + (z1 - z2)*(z1 - z2));
   }

   public static void main(String[] args)
   {
      System.out.print(distance(3, 5, 7, 1, 3, 7));
   }
}