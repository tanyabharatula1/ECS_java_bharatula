package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class HiLow 
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int x = 1 + r. nextInt(100), y;
		
		System.out.println("I'm thinking of a number between 1-100. try to guess it. " );
		y = keyboard.nextInt();
		
		if( x > y)
		{
			System.out.println("sorry, you are too low. I was thinking of " + x);
		}
		if( x < y )
		{
			System.out.println("sorry, you are too high. I was thinking of " + x);
		}
		if( x == y )
		{
			System.out.println("You guessed it! what are the odds?!?");
		}
	}

}
