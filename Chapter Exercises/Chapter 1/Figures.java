// Exercise 13
// creator: Jan Bogoryja-Zakrzewski
// I HAVE DONE THIS IN 9TH AND 10TH EXERCISE ALREADY

public class Figures{
  
   public static class Figure
   {
      // the maximum width fo the figure
      static int maxWidth = 3;
      
      // draws a single dot. used in other methods
      public static void dot()
      {
         System.out.print("*");
      }
      
      // draws the spacing inbetween dots. used in other methods
      public static void spaces(int amount)
      {
         for(int i  = 0 ; i < amount ; i++)
         {  System.out.print(" ");  }
      }
      
      // draws 2 dots with space inbetween, specified by "distance" parameter
      public static void drawDots(int distance)
      {
         spaces(maxWidth-distance);    // adds left spacing
         dot();
         spaces(distance);
         dot();
         System.out.println();
      }
      
      // draws a line of dots
      public static void drawLotsOfDots()
      {
         for(int i  = 0 ; i < 5 ; i++)
         { dot(); }
         System.out.println();
      }
   
      // main drawing function
      public static void draw()
      {
         for(int i  = 0 ; i < 4 ; i++)
         {  drawDots(i);  }
         
         drawLotsOfDots();
         
         for(int i  = 0 ; i < 4 ; i++)
         {  drawDots(3);  }
         
         drawLotsOfDots();
         
         for(int i  = 3 ; i > 0 ; i--)
         {  drawDots(i);  }
         
         drawDots(0);
         
         for(int i  = 0 ; i < 4 ; i++)
         {  drawDots(i);  }
         
         for(int i  = 0 ; i < 4 ; i++)
         {  drawLotsOfDots();  }
      }
   }
   

   public static void main(String[] args)
   {
      Figure.draw();   
   }
}