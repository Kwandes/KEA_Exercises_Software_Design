// Car Exercise
// Jan Bogoryja-Zakrzewski, Dat19i
// Done on 08/12/2019 (DD/MM/YYYY) because it was too easy to bother with earlier
// Honestly, I can't be bothered to create the User input for the car and fancy comparison methods. I can do them ez, this is an old exercise. Here, have music instead

import java.util.Scanner;

// Here you can test your car
public class Track{

   public static void main(String[] args)
   {     
      // Actual cars
      Car blandBoringCar = new Car();
      Car cyberTruck = new Car("Cyber Truck", "Tesla", "2020", "Electric", 5, "Windows: Armored, kinda");
      Car toyoda = new Car("YodaMobile", "Toyoda", "896BBY", "Luke Skywalker", 2, "Mass: 13 kg\nHeight: 0.66m");
      
      // Here be the car array
      Car[] carArr = {blandBoringCar, cyberTruck, toyoda};
      
      // here is car info
      for(int i = 0; i < carArr.length; i++)
      {
         System.out.println(carArr[i] + "\n");
      }
      
      // Because I can
      cyberTruck.playRadio();
      try
      {
         Thread.sleep(2000);
      }
      catch(Exception e){}
      cyberTruck.stopRadio();
      
      toyoda.playRadio();
      try
      {
         Thread.sleep(2000);
      }
      catch(Exception e){}
      toyoda.stopRadio();
      
      System.out.println("Press ENTER to quit");
      Scanner console = new Scanner(System.in);
      console.nextLine();
   }
}