/* 4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13 */

import java.util.*;
 
 class QuestionD
 
{
  public static void main(String args [])
  
 {
   int a = -5 + 8*6;
   int b = (55+9) %9;
   int c = 20+ -(3*5)/8;
   int d = 5+15 / 3 * 2 - 8 % 3;
   
   System.out.println("-5 + 8*6 =" +a);
   System.out.println("(55+9) %9 =" +b);
   System.out.println("20+ -(3*5)/8 =" +c);
   System.out.println("5+15 / 3 * 2 - 8 % 3 =" + d);
   
  }
  }