// Student Exercise, Student IF Exercise
// jan Bogoryja-Zakrzewski, dat19i
// I'm making this far harder for myself than it should be
// KISS!!

import java.util.Vector;

public class StudentIfexercise{

   public static class Student
   {
      private int ID;
      private double weight;
      private double height;
      private double GPA;
      private Vector grades = new Vector();
      
      public Student()
      {
         setID(69420);
         setWeight(60.0);
         setHeight(180.0);
         setBMI();      
      }
      public Student(int id)
      {
         setID(id);
         setWeight(60.0);
         setHeight(180.0);
         setBMI();      
      }
      public Student(int id, double weight2)
      {
         setID(id);
         setWeight(weight2);
         setHeight(180.0);
         setBMI();               
      }
      public Student(int id, double weight2, double height2)
      {
         setID(id);
         setWeight(weight2);
         setHeight(height2);
         setBMI();         
      }
      
      public String toString()
      {
         return ("StudentID: " + getID() + " | " + getWeight() + "kg / " + getHeight() + " cm | GPA: " + getGPA());
      }
      
      //Region Getters and setters
      public int getID()
      { return ID; }
      
      public void setID(int id)
      { this.ID = id; }
      
      public double getWeight()
      { return weight; }
      
      public void setWeight(double weightFromOutside)
      { this.weight = weightFromOutside; }
      
      public double getHeight()
      { return height; }
      
      public void setHeight(double heightFromOutside)
      { this.height = heightFromOutside; }
      
      public void addGrade(int grade)
      {
         this.grades.add(grade);
      }
      
      public void removeGrade(int grade)
      {
         // yikes, cba to add this rn
      }
      
      public Vector getGrades()
      {
         return grades;
      }
      
      public void setGPA()
      {
           double result = 0;
           for(int i = 0; i < grades.size() ; i++)
           {
               result += (int)grades.elementAt(i);
           }
           this.GPA = result / grades.size();
      }
      public double getGPA()
      { return this.GPA; }
      
      public void setBMI()
      {
      
      }
    }
   

   public static void main(String[] args)
   {
      Student s1 = new Student();
      Student s2 = new Student(42,65, 178);
      Student s3 = new Student(88271,230, 160);
      
      int[] gradeSet = {2,5,4,2,3};
      int[] gradeSet2 = {7,7,7,7,6,4,7};
      int[] gradeSet3 = {3,6,7,7,1};
      
      for (int i= 0; i < gradeSet.length ; i++)
      {
         s1.addGrade(gradeSet[i]);
      }
      s1.setGPA();
      
      for (int i= 0; i < gradeSet.length ; i++)
      {
         s2.addGrade(gradeSet2[i]);
      }
      
      s2.setGPA();
      for (int i= 0; i < gradeSet.length ; i++)
      {
         s3.addGrade(gradeSet3[i]);
      }
      s3.setGPA();
      
      int counter = 0;
      
      if ( s1.getGPA() >= 3.0) counter++;
      if ( s2.getGPA() >= 3.0) counter++;
      if ( s3.getGPA() >= 3.0) counter++;
      
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println("Amount of studs with a gpa >= 3: " + counter);
         
   }
}