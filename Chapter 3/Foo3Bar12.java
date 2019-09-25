// Chapter 3, Exercise 12
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo3Bar12{

   public static double scientific(int number)
   {
      return (number*number)*10;
      
   }

   public static void main(String[] args)
   {
      System.out.println(scientific(5));
      System.out.print(scientific(-8));
   }
}