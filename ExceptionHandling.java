package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
    try
    {
    	 System.out.print("Enter a : ");
    	 int a=scan.nextInt();
         System.out.print("Enter b : ");
         int b=scan.nextInt();
         int c=a/b;
         System.out.println("The division of a and b is : " +c);
     }
    
    catch(InputMismatchException e) 
    {
    	 System.out.println("Please enter the correct input ");
    }
     
    catch(ArithmeticException e) 
     {
    	 System.out.println("Cannot divisible by Zero");
     }
     
         System.out.println("------PROGRAM ENDED------");
       
}
}

