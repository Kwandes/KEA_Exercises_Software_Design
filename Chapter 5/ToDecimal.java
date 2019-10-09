// Chapter5, Exercise 3
// Jan Bogoryja-Zakrzewski, Dat19i

public class ToDecimal{

   public static int toDecimal(String binary)
   {
      int decimal = 0;
      int multiplier = 1;
      for(int i = binary.length()-1; i >= 0; i--)
      {
         decimal += Character.getNumericValue(binary.charAt(i)) * multiplier;
         multiplier *= 2;
      }
      return decimal;
   }   

   public static void main(String[] args)
   {
      String binary = "101111";
      System.out.println(binary + " = " + toDecimal(binary));
   }
}