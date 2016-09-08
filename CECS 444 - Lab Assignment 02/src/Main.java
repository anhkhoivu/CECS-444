// Anhkhoi Vu
// CECS 444 - Lab Assignment 02 - Factorial
//
// The program performs factorials.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws InputMismatchException
	{
		// Initializations
		boolean programDone = false;
		long number = 0;
		long total;
		Scanner input = new Scanner(System.in);
		
		// Welcome Display
		System.out.print("************************************************************************************\n");
		System.out.print("*                                                                                  *\n");
		System.out.print("*                   WELCOME TO THE FACTORIAL PROGRAM                        	   *\n");
		System.out.print("*      	     This program will perform the factorial operation	       		   * \n");
		System.out.print("*                                                                                  *\n");
		System.out.print("************************************************************************************\n");
		System.out.println();
		
		// Program loop for the factorial program.
		while(!programDone)
		{
			boolean validInput = false;
			
			// Loop will run until user inputs "-1".
			while(!validInput)
			{
				System.out.print("Enter a number to perform factorials with (Enter -1 to end): ");
				
				//Checks to make sure user inputs a valid number.
				if(input.hasNextLong())
				{
					number = input.nextLong();
					
					//exits program if user inputs "-1".
					if(number == -1)
					{
						input.close();
						System.exit(0);
					}
					
					// If input is negative, perform absolute value operation on it.
					else if (number < -1)
					{
						number = Math.abs(number);
					}
					
					// exits the loop.
					validInput = true;
				}
				
				// if user input is valid
				else
				{
					System.out.println("Invalid input. Please enter a valid number.");
					input.nextLine();
				}
			}
			
			// performs factorial operation
			total = factorial(number);
			System.out.println("Result of " + number + "! is " + total + ".");
			System.out.println();
	   	}
	  }
 
 /**
  * This method performs the factorial operation.
  * 
  * @param number parameter that contains an integer
  * @return the result of the factorial operation.
 */
	public static long factorial(long number)
	{
		if(number <= 1)
		{
			return 1;
		}
		else
		{
			return number * factorial(number - 1);
		}
	}
}
