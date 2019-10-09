// Chapter 4, Exercise 4
// Jan Bogoryja-Zakrzewski, Dat19i

public class ColorsInRainbow{

   public static String colorsInRainbow(int colorAsInt)
   {
      String colour = ""; //the rainbow is not from the USA
      switch(colorAsInt)
      {
         case 1: colour = "Violet"; break;
         case 2: colour = "Indigo"; break;
         case 3: colour = "Blue"; break;
         case 4: colour = "Green"; break;
         case 5: colour = "Vellow"; break;
         case 6: colour = "Orange"; break;
         case 7: colour = "Red"; break;
      }
      return colour;
   }

   public static void main(String[] args)
   {
      for (int i = 1; i <= 7; i++)
      {
         System.out.println(colorsInRainbow(i));
      } 
   }
}