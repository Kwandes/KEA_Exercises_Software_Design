// Exercise 15
// creator: Jan Bogoryja-Zakrzewski
// Done this before...ish

public class RhombusStart{

   public static class RhombusPieces
   {
      // Rhombus Pieces
      public static void tripple()
      {  System.out.println("    $$$   ");  }
      public static void bottomWall()
      {  System.out.println("   $   $  ");  }
      public static void middleWall()
      {  System.out.println("  $     $ ");  }
      public static void start()
      {  System.out.println("|  START  |");  }
      public static void breaker()
      {  System.out.println(" +-------+");  }
      
      // Rhombus Shapes
      public static void buildFull()
      {
         tripple();
         bottomWall();
         middleWall();
         start();
         middleWall();
         bottomWall();
         tripple();
      }
      public static void buildJustTheDolla()
      {
         tripple();
         bottomWall();
         middleWall();
         middleWall();
         bottomWall();
         tripple();
      }
      public static void buildExerciseTen()
      {
         buildJustTheDolla();
         middleWall();
         bottomWall();
         tripple();
         breaker();
         buildFull();
         breaker();      
      }
   }

   public static void main(String[] args)
   {
      RhombusPieces.buildExerciseTen();
   }
}