// Fitness Exercise, Employee setup
// Jan Bogoryja-Zakrzewski, Dat19i

public class Employee{

   final int ADMIN_HOURLY_WAGE = 23000 / (37 * 4);
   final int INSTRUCTOR_HOURLY_WAGE = 199;
   
   String userType;
   String cpr;
   String name;
   int hourlyWage;
   int vacationDays;
   
   public Employee(String type, String id, String name)
   {
      if(type.equals("admin"))
      {
         setUserType("admin");
         setWage(ADMIN_HOURLY_WAGE);
         setVacation(5);
      }
      else
      {
         setUserType("instructor");
         setWage(INSTRUCTOR_HOURLY_WAGE);   
         setVacation(0);
      }
      
      setName(name);
      setCPR(id);  
   }
   
   public Employee()
   {
      setUserType("instructor");
      setWage(INSTRUCTOR_HOURLY_WAGE);
      setCPR("69420");
   }
   
   public String toString()
   {
      String buffer = "";
      int maxNameLength = 15;
      int nameLength = this.name.length();
      for (int i = 0; i < (maxNameLength-nameLength); i++)
      {  buffer += " "; };
      return this.name + buffer + " | " + this.cpr + " | Position: " + this.userType.toUpperCase();
   }
   
   //REGION - setters & getters
   //-------------------------------------------------------------
   public void setUserType(String type)
   {  this.userType = type;   }
   public String getUserType()
   {  return this.userType;   }
   
   public void setWage(int wage)
   {  this.hourlyWage = wage;   }
   public int getWage()
   {  return this.hourlyWage;   }
   
   public void setCPR(String id)
   {  this.cpr = id;    }
   public String getCPR()
   {  return this.cpr;  }
   
   public void setName(String name)
   {  this.name = name; }
   public String getName()
   {  return this.name; }
   
   public void setVacation(int days)
   {  this.vacationDays = days;  }
   public int getvacation()
   {  return this.vacationDays;  }
   
   //-------------------------------------------------------------
   
   
   
   
   
   




}
