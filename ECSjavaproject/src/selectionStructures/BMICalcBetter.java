package selectionStructures;
import java.util.Scanner;
public class BMICalcBetter 
{
	public static void main(String[] args)
	{
Scanner keyboard = new Scanner(System.in);
		
		int age, weight, inches, feet;
		double BMI;
		
		System.out.println("how many feet tall are you? " );
		feet = keyboard.nextInt();
		
		System.out.println("how many inches?"  );
		inches = keyboard.nextInt();
		
		System.out.println("How many pounds do you weigh?"  );
		weight = keyboard.nextInt();
		
		BMI = (weight*.4536)/(((feet+inches/12)*.3048 * (feet+ inches/12)*.3048) );
		
		System.out.println("Your BMI is:" + BMI);
		
		if ( BMI < 18.5 )
		{
			System.out.println("You are underweight");
		}
		else if ( 18.5 < BMI&&BMI <24.9 )
		{
			System.out.println("You are normal weight");
		}
		else if ( 25.0 < BMI&&BMI <29.9 )
		{
			System.out.println("You are overweight");
		}
		else if ( BMI > 30.0 )
		{
			System.out.println("You are obese.");
		}
		
	
		
		
		
		
	}
		
		
}
