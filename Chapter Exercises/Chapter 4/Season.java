// Chapter 4, Exercise 3
// Jan Bogoryja-Zakrzewski, Dat19i

public class Season{

   public static String season(int month, int day)
   {
      String seasonButVar = "N/A";
      
      if ( month >= 1  && month < 3) seasonButVar = " winter";
      else if ( month > 3 && month < 6) seasonButVar  = "spring";
      else if ( month > 6 && month < 9) seasonButVar = "summer";
      else if ( month > 9 && month < 12) seasonButVar = "fall";
      else
      {
         switch(month)
         {
            case 12:
            {
               if(day >= 16)
               seasonButVar = "winter";
               else seasonButVar = "fall";
               break;
            }
            case 3:
            {
               if(day >= 16)
               seasonButVar = "spring";
               else seasonButVar = "winter";
               break;
            }
            case 6:
            {
               if(day >= 16)
               seasonButVar = "summer";
               else seasonButVar = "spring";
               break;
            }
            case 9:
            {
               if(day >= 16)
               seasonButVar = "fall";
               else seasonButVar = "summer";
               break;
            }
         }
      }
      
      return seasonButVar;   
   }
   
   public static void main(String[] args)
   {
      System.out.println(season(12,15));
      System.out.println(season(12,16) + "\n");
      System.out.println(season(3,15));
      System.out.println(season(3,16) + "\n");
      System.out.println(season(6,15));
      System.out.println(season(6,16) + "\n");
      System.out.println(season(9,15));
      System.out.println(season(9,16) + "\n");
   }
}

