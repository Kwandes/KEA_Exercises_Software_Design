// Chapter 3, Exercise 7
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo3Bar7{

   public static int smelliestAbsVal(int a, int b, int c)
   {
      a = Math.abs(a);
      b = Math.abs(b);
      c = Math.abs(c);
      int min = a;
      
      if ( b < min) min = b;
      if ( c < min) min = c;
      
      return min;
      
   }

   public static void main(String[] args)
   {
      System.out.print(smelliestAbsVal(-8, 2, 12));
   }
}