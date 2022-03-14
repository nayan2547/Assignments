//15. Write a Java program to swap two variables.

import java.util.*;

class QuestionP
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
	int n1 = sc.nextInt();
	System.out.println("Enter the second number:");
	int n2 = sc.nextInt();
	
	int temp = n1;
	n1 =n2;
	n2 = temp;
	System.out.println("After swapping the given numbers we get: "+n1+" && " +n2);
	}
	}
	
	
	
	
	
	
	