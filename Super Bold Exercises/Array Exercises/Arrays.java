// Array Exercise
// Jan Bogoryja-Zakrzewski, Dat19i
// Done on 08/12/2019 (DD/MM/YYYY) because it was too easy to bother with earlier

public class Arrays{
   
   public static int sum(int[] arr)
   {
      int sum = 0;
      for(int i = 0; i < arr.length; i++)
      {
         sum += arr[i];
      }
      return sum;
   }
   
   // I assume you mean this, aka return first instance of a number
   public static int find(int[] arr, int num)
   {
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i] == num) return i;
      }
      return -1;  // If number is not found, return -1
   }
   
   public static int[] populateArray(int[] arr)
   {
      int base = 1;
      int multiplier = 2;
      for(int i = 0; i < arr.length; i++)
      {
         arr[i] = base;
         base *= multiplier;
      }
      return arr;
   }
   
   public static int[] reverseArray(int[] arr)
   {
      int[] localArr = new int[arr.length];
      for(int i = arr.length-1; i >= 0; i--)
      {
         localArr[arr.length-i-1] = arr[i];
      }
      return localArr;
   }
   
   public static int count(int[] arr, int query)
   {
      int counter = 0;
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i] == query) counter++;
      }
      return counter;
   }
   
   public static void main(String[] args)
   {
      int[] genericIntArray = {33, 44, 55, 66, 77, 88, 99, 1, 2};
      
      
      System.out.println("\nFirst Exercise\n-----------------------");
      System.out.println("Sum of " + printArray(genericIntArray) + " = " + sum(genericIntArray));
      
      System.out.println("\nSecond Exercise\n-----------------------");
      int numberToFind = 88;
      int index = find(genericIntArray, numberToFind);
      if(index == -1) System.out.println("Number does not exist in the given array");
      else System.out.println("Number found at position " + index);
      
      System.out.println("\nThird Exercise\n-----------------------");
      int[] numbers = new int[7];
      System.out.println("Arr numbers has been populated with: " + printArray(populateArray(numbers)));
      
      System.out.println("\nFourth Exercise\n-----------------------");
      int[] digits = numbers;
      System.out.println("New array Digits: " + printArray(digits));
      
      System.out.println("\nFifth Exercise\n-----------------------");
      int[] reversedDigits = reverseArray(digits);
      System.out.println("Reversed array Digits: " + printArray(reversedDigits));
      
      System.out.println("\nSixth Exercise\n-----------------------");
      int[] yetAnotherArray = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1};
      System.out.println("Number of \'5\' in this brand new, fresh, untouched array: " + count(yetAnotherArray, 5));
      
      System.out.println("\nNinth Exercise\n-----------------------");
      System.out.println("No");
   }
   
   public static String printArray(int[] arr)
   {
      String result = "";
      result += "[";
      for(int i = 0; i < arr.length; i++)
      {
         if(i == arr.length-1) result += arr[i];
         else result += (arr[i] + ",");
      }
      result += "]";
      return result;
   }
}