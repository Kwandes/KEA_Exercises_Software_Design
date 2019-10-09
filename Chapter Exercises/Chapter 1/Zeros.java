// Exercise 14
// creator: Jan Bogoryja-Zakrzewski

public class Zeros{
   
   public static class Zero
   {
      // the left margin of the upright Zer
      static int margin = 3;
      
      public static void margin()
      {
         for(int i = 0; i < 3 ; i++)
         {  System.out.print(" ");  }
      }
      // draws a single _ used in other methods
      public static void floor(String material)
      {
         margin();
         System.out.print(" ");
         
         for(int i = 0; i < 3 ; i++)
         {  System.out.print(material);  }
         
         System.out.println();
      }
      public static void floorLong(String material)
      {
         System.out.print(" ");     //Only a single space is required for margin
         
         for(int i = 0; i < 6 ; i++)
         {  System.out.print(material);  }
         System.out.println();
      }
      //draws the walls with variable width
      public static void wall(int filling)
      {
         // Margin depends on which version of zero it is.
         if( filling <4) margin();
         
         System.out.print("|");
         
         for(int i  = 0 ; i < filling ; i++)
         {  System.out.print(" ");  };
         
         System.out.println("|");
      }
      
      public static void drawZeroUpright()
      {
         floor("_");
         
         for(int i = 0; i < 3 ; i++)
         { wall(3);  }
         
         floor("-");
      }
      
      public static void drawZeroSide()
      {
         floorLong("_");
         
         for(int i = 0; i < 1 ; i++)
         { wall(6);  }
         
         floorLong("-");
      }
      
      public static void draw()
      {
         for(int i = 0; i < 3 ; i++)
         {
            drawZeroUpright();
            drawZeroSide();
         }
      }
   
   }


   public static void main(String[] args)
   {
      Zero.draw();
   }
}