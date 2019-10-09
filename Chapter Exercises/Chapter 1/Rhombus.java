// Exercise 9
// creator: Jan Bogoryja-Zakrzewski

public class Rhombus{

   public static class RhombusPieces
   {
      // Rhombus Pieces
      public static void tripple()
      {  System.out.println("   $$$   ");  }
      public static void bottomWall()
      {  System.out.println("  $   $  ");  }
      public static void middleWall()
      {  System.out.println(" $     $ ");  }
      public static void middleLine()
      {  System.out.println("\"-'-\"-'-\"");  }
      
      // Rhombus Shapes
      public static void buildFull()
      {
         tripple();
         bottomWall();
         middleWall();
         middleLine();
         middleWall();
         bottomWall();
         tripple();
      }  
   }

   public static void main(String[] args)
   {
      RhombusPieces.buildFull();
   }
}