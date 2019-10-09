// Chapter 3, Exercise 13
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo3Bar13{

   public static double salary(int base, int sale)
   {
      return   base + (0.05 * sale);
   }

   public static void main(String[] args)
   {
      System.out.print(salary(1000, 5000));   
   }
}