/* 13. Write a Java program to print the area and perimeter of a rectangle. 
Test Data: 
Width = 5.5 Height = 8.5 
Expected Output 
Area is 5.6 * 8.5 = 47.60 
Perimeter is 2 * (5.6 + 8.5) = 28.20 
 */
 
 import java.util.*;
 
 class QuestionN
 {
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the width:");
   double w = sc.nextDouble();
   System.out.println("Enter height");
   double h = sc.nextDouble();
   
   double area = w*h;
   double peri = 2 * (w + h);
   
   System.out.println("Area =" + area);
   System.out.println("Perimeter = " + peri);
   }
   }
   