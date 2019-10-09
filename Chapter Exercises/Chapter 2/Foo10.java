// Chapter 2, Exercise 10
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo10{
   
   final static int COLUMN_WIDTH = 9;
   
   public static void sequence(String border, String filler)
   {
      System.out.print(border);
      for(int i = 0; i < COLUMN_WIDTH; i++)
      {
         System.out.print(filler);
      }
   }
   
   // overloaded version for the column with numbers
   public static void sequence(String border)
   {
      System.out.print(border);
      for(int i = 1; i <= COLUMN_WIDTH; i++)
      {
         System.out.print(i);
      }
   }
   
   public static void draw(int amountOfColumns)
   {
      for(int i = 0; i < amountOfColumns; i++)
      {
         sequence("|");
      }
      System.out.print("|\n");
      
      for(int i = 0; i < amountOfColumns; i++)
      {
         sequence(" ", "-");
      }
      System.out.print(" \n");
      
      for(int i = 0; i < amountOfColumns; i++)
      {
         sequence("|", " ");
      }
      System.out.print("|\n");
        
      //System.out.print("|");
      //System.out.print(" ");
   }
   
   public static void main(String[] args)
   {
      draw(4);
      //draw(2);

   }
}