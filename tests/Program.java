// Chapter 6, First test
// Jan Bogoryja-Zakrzewski, Dat19i

public class Program{
   
   // ticket class for First Test
   // I forgot what we were supposed to do with teachers so am not doing task 6 I guess.
   public static class Ticket{
      double price;
      String movieTitle;
      boolean isValid;
      //double size;
      
      public boolean isExpensive()
      {
         if (this.price > 100) return true;
         else return false;
      }
      
      Ticket(int price, String title, String validity)
      {
         this.price  = price;
         this.movieTitle = title;
         if(validity != "valid") this.isValid = false;
         else this.isValid = true;   
      }
   }
   
   // The place where I init the tickets
   public static class TestTicket{
   
      public static void initTickets()
      {
         Ticket ticketUno = new Ticket(42, "Lion King", "valid");
         checkTicket(ticketUno.isExpensive());
         Ticket ticketDuo = new Ticket(100, "PunkCyber 1077", "valid");
         checkTicket(ticketDuo.isExpensive());
         Ticket ticketTripioo = new Ticket(101, "Communist Manifesto", "invalid"); 
         checkTicket(ticketTripioo.isExpensive());  
      }
      
      // sorry but I forgot how to think when naming vars
      public static void checkTicket(boolean result)
      {
         if (result) System.out.println("yeah that ticket is expensive");
         else System.out.println("not too shabby, pretty cheap tbh");
      }
   }
}