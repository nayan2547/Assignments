/* 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */

import java.util.*;
class QuestionL
{
  public static void main(String args [])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius:");
	double r = sc.nextDouble();
	final double pi = 22.0/7;
	
	double peri = 2*pi*r;
	double area = pi*r*r;
	
	System.out.println("perimeter =" +peri);
	System.out.println("Area =" +area);
	}
	}
	                                             