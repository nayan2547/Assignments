/* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
Test Data: 
Input first number: 125 
Input second number: 24 
Expected Output : 
125 + 24 = 149 
125 - 24 = 101 
125 x 24 = 3000 
125 / 24 = 5 
125 mod 24 = 5 */

import java.util.*;

class QuestionF
 {
   public static void main(String args [])
   {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the first number : ");
	 int a = sc.nextInt();
	 System.out.println("Enter the second number :");
	 int b = sc.nextInt();
	 
	 int sum = a + b;
	 int diff = a-b;
	 int mul = a*b;
	 double div = a/b;
	 double mod = a%b;
	 
	 System.out.println(+a+ "+" +b+ "=" +sum);
	 System.out.println(+a+ "-" +b+ "=" +diff);
	 System.out.println(+a+ "*" +b+ "=" +mul);
	 System.out.println(+a+ "/" +b+ "=" +div);
	 System.out.println(+a+ "mod" +b+ "=" +mod);
	 
	 }
	 }