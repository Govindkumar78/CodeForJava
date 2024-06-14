package june13Overloading2ndQuest;
//Question:------
//Create a Calculator class with a method calculateSum() that takes different parameters to calculate the sum of different types of data.
//Calculate the sum of two integers.
//Calculate the sum of three doubles.
//Calculate the sum of an array of integers.
//Expected Output:
//Calculator.calculateSum(2, 3) should return 5
//Calculator.calculateSum(1.2, 2.3, 3.4) should return 6.9
//Calculator.calculateSum(new int[] {1, 2, 3, 4, 5}) should return 15
public class Calculator {
 public static int calculateSum(int num1, int num2) {
	 return num1+num1;
 }
 public static double calculateSum(double num1,double num2,double num3) {
	 return num1+num2+num3;
 }
 public static int calculateSum(int[] nums) {
	 int sum=0;
	 for (int num : nums) {
         sum += num;
     }
     return sum;
 }

 public static void main(String[] args) {
     System.out.println("Sum of 2 and 3: " + Calculator.calculateSum(2, 3));
     System.out.println("Sum of 1.2, 2.3, and 3.4: " + Calculator.calculateSum(1.2, 2.3, 3.4));
     System.out.println("Sum of array {1, 2, 3, 4, 5}: " + Calculator.calculateSum(new int[] {1, 2, 3, 4, 5}));
 }
 }

