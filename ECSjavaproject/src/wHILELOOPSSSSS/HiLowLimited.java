package wHILELOOPSSSSS;

import java.util.Random;
import java.util.Scanner;

public class HiLowLimited 
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int x = 1 + r. nextInt(100), y, tires;
		int tries = 0;
		
		
		System.out.println("I'm thinking of a number between 1-100. try to guess it. " );
		
		
		System.out.print("guess #" + (tries +=1 ));
		y = keyboard.nextInt();
		
		while ( tries < 7 )
		{
			
			if( x > y)
			{
				System.out.println("sorry, you are too low.");
				System.out.print("guess #" + (tries +=1 ));
				y = keyboard.nextInt();
			}
			if( x < y )
			{
				System.out.println("sorry, you are too high.");
				System.out.print("guess #" + (tries +=1 ));
				y = keyboard.nextInt();
			}
			if ( x == y )
			{
				System.out.println("You guessed it! what are the odds?!?");
			}			
			else if ( tries == 7 )
				System.out.println("\nYOU HAVE RUN OUT OF TRIES. YOU LOSE.");
		}
		
	}		
				
		
}	
		
		
		
		

	

