// Exercise 12
// creator: Jan Bogoryja-Zakrzewski
// God this is a boring one but I don't feel like making it parametirized and stuff so let's just use 2 methods

public class Rhyme{

   public static void sayShower(int n)
   {
      for(int i = 0; i < n; i++) System.out.print("A sunshiny shower" + "\n" + "Won't last an hour." + "\n\n" );
   }
   
   public static void sayRain()
   {
      System.out.print("Rain before seven;" + "\n" + "Clear by eleven." + "\n\n" );
   }

   
   public static void main(String[] args)
   {
      sayShower(2);
      sayRain();
      sayShower(2);
      sayRain();
      sayShower(2);
   
   }
}