// Car Exercise
// Jan Bogoryja-Zakrzewski, Dat19i
// Done on 08/12/2019 (DD/MM/YYYY) because it was too easy to bother with earlier

public class Car{

   private String carName;
   private String model;
   private String modelYear;
   private String engine;
   private int doors;
   private String findAtLeastTwoMore;
   private Musik radio;

   public Car()
   {
      this.carName = "N/A";
      this.model = "Horse";
      this.modelYear = "2012";
      this.engine = "1 horse";
      this.doors = 1; // Requirements say 3/5 doors but a horse has only one door
      this.findAtLeastTwoMore = "Found: There is 2 more Waldos in top right, behind the tree and inside the American(obese) woman's purse";
      this.radio = new Musik("Default");
   }
   
   public Car(String carName, String model, String modelYear, String engine, int doors, String extra)
   {
      this.carName = carName;
      this.model = model;
      this.modelYear = modelYear;
      this.engine = engine;
      this.doors = doors;
      this.findAtLeastTwoMore = extra;
      this.radio = new Musik(model);
   }
   
   public String toString()
   {
      return "Car Name: " + this.carName + "\nModel: " + this.model +
            "\nProduced in: " + this.modelYear + "\nEngine: " + this.engine +
            "\nDoors: " + this.doors + "\n" + this.findAtLeastTwoMore;
   }
   
   public void playRadio()
   {
      radio.play();
   }
   
   public void stopRadio()
   {
      radio.stop();
   }
   ////////// Getters and Setters //////////
   // smh, boring
   
   public void setName(String name)
   {
      this.carName = name;
   }
   public void setModel(String model)
   {
      this.model = model;
   }
   public void setModelYear(String year)
   {
      this.modelYear = year;
   }
   public void setEngine(String engine)
   {
      this.engine = engine;
   }
   public void setDoors(int doors)
   {
      this.doors = doors;
   }
   public void setExtraInformation(String extraInfo)
   {
      this.findAtLeastTwoMore = extraInfo;
   }
   
   public String getName()
   {
      return this.carName;
   }
   public String getModel()
   {
      return this.model;
   }
   public String getModelYear()
   {
      return this.modelYear;
   }
   public String getEngine()
   {
      return this.engine;
   }
   public int getDoors()
   {
      return this.doors;
   }
   public String getExtraInformation()
   {
      return this.findAtLeastTwoMore;
   }

}