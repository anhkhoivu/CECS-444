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
		boolean programDone = false;
		long number = 0;
		long total;
		Scanner input = new Scanner(System.in);
		
		while(!programDone)
		{
			boolean validInput = false;
			while(!validInput)
			{
				System.out.print("Enter a number to perform factorials with (Enter -1 to end): ");
				if(input.hasNextLong())
				{
					number = input.nextLong();
					if(number == -1)
					{
						input.close();
						System.exit(0);
					}
					else if (number < -1)
					{
						number = Math.abs(number);
					}
					
					validInput = true;
				}
				else
				{
					System.out.println("Invalid input. Please enter a valid number.");
					input.nextLine();
				}
			}
			
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
