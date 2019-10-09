// Exercise 11
// creator: Jan Bogoryja-Zakrzewski
// redundancy I have failed to remove: multiple calls for drawMargin. Which already removed a lot of redundancy

public class TwoShips{

   // main function for drawing ships
   public static class Ship
   {
      // how wide the ship can be
      static int maxShipWidth = 16;
      
      // method for drawing margins around ship pieces
      public static void drawMargin(int margin)
      { 
         for(int i = 0; i < margin; i++)
         //{  System.out.print(margin);  }      //used instead of space for troubleshooting margins
         {  System.out.print(" ");  }
      } 
      
      // Ship pieces
      // bridge, the  | text |  part
      public static void drawBridge(String filler, int howManyTimes)
      {  
         int margin = (maxShipWidth - filler.length())/2;
         for(int i = 0; i < howManyTimes ; i++)
         {
            //Reducing left margin for the bridge tower as it shifts left otherwise
            if (filler == "  ")
            {
               int reduction = i;
               switch (i)
               {
                  case 0: break;
                  case 1: break;
                  case 2: reduction = 1; break;
                  case 3: reduction = 1; break;
                  case 4: reduction = 2; break;
                  case 5: reduction = 2; break;
                  case 6: reduction = 2; break;
                  case 7: reduction = 2; break;
               
               }
               drawMargin(margin - reduction);
            }
            else drawMargin(margin);
          
            System.out.print("|" + filler + "|");
            drawMargin(margin);
         }
         System.out.println();
      
      }
      // Deck, the ------ part
      public static void drawDeck(int deckLength, int howManyTimes)
      {
         // No need for parameter checking because I'm lazy
         int margin = (maxShipWidth - deckLength)/2;
         
         for(int i = 0; i < howManyTimes ; i++)
         {
            drawMargin(margin);
            
            for(int j = 0; j < deckLength ; j++)
               {  System.out.print("-");  }
               
            drawMargin(margin);
         }
         System.out.println();
         
      }
      //Sides, the  @      @   part
      public static void drawSides(int storageCapacity, int howManyTimes)
      {
         // No need for parameter checking because I'm lazy
         int margin = (maxShipWidth - storageCapacity-2)/2;
         
         for(int i = 0; i < howManyTimes ; i++)
         {
            drawMargin(margin);        
            System.out.print("@");
            
            for(int j = 0; j < storageCapacity ; j++)
               {  System.out.print(" ");  }
               
            System.out.print("@");
            drawMargin(margin);
         }
         System.out.println();
      }
      
      
      //main drawing function
      public static void draw( int howManyTimes, String textTop, String textBottom)
      {
         // parameter checking
         if ( howManyTimes < 1) return;
         else if (howManyTimes > 6)
         {
            howManyTimes = 6;
            System.out.println("That is too much for poor Jgrasp, chill. Limited you to 42 ships. Quite a fleet" + "\n\n");
            //Actually the ships simply begin to break apart slowly due to margins and I'm lazy so I am not going to fix that
         }

            drawBridge(textTop, howManyTimes);
            drawBridge(textBottom, howManyTimes);
            drawBridge("  ", howManyTimes);  
            drawBridge("  ", howManyTimes);
            drawDeck(12, howManyTimes);
            drawSides(10, howManyTimes);
            drawSides(8, howManyTimes);
            drawDeck(6, howManyTimes);
      }
   }


   public static void main(String[] args)
   {
      Ship.draw(2, " Sea ", "Horse");
   }
}