// Chapter 3, Exercise 1
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo3Bar1{

   public static void printEvenNumbers(int n)
   {
      if (n < 2) System.out.println("N smaller than 2, nothing prints outs");
      for(int i = 2; i <=n ; i+= 2)
      {
         System.out.print("{" + i + "} ");
      }
   
   }

   public static void main(String[] args)
   {
      printEvenNumbers(8);
   }
}