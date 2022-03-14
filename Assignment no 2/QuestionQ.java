/* 16. Write a Java program to print a face. 
Expected Output
 */
 
 import java.util.*;
 
 class QuestionQ
  {
   public static void main(String args [])
   {
   System.out.print("  +"); 		 		
		for(int i=0;i<5;i++) 		
		{ 			
			System.out.print("\""); 	
		} 	
 		
		System.out.println("+"); 		
		System.out.println("[ | o o | ]");
		System.out.println("  |  ^  |");
		System.out.println("  | '_' |");
		System.out.print("  +");
		
		for(int j=0;j<5;j++)
		{
			System.out.print("-");
		}
		
		System.out.println("+");
	}
}
