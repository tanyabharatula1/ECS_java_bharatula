package keyboardInputs;

import java.util.Scanner;

public class DumbCalculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double first, second, third;
		
		System.out.println("what is the first number? " );
		first = keyboard.nextDouble();
		
		System.out.println("What is the second number? " );
		second = keyboard.nextDouble();
		
		System.out.println("what is the third number " );
		third = keyboard.nextDouble();
		
		System.out.println("The average of the three numbers is " + ((first+second+third)/3));

		
	
		keyboard.close();
	}

}
