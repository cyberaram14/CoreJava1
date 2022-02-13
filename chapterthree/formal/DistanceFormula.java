import java.util.Scanner;

public class DistanceFormula
{
	
	public static void main(String args[])
	{
		Scanner consoleInput = new Scanner(System.in);
		
		double xOne;
		double yOne;
		double xTwo;
		double yTwo;
		
		// Get user input
		System.out.println("Welcome to the DistanceFormula program - please enter the information below");
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("FIRST POINT");
		System.out.print("\tEnter x value >> ");
		xOne = consoleInput.nextDouble();
		System.out.print("\tEnter y value >> ");
		yOne = consoleInput.nextDouble();
		
		System.out.println("\nSECOND POINT");
		System.out.print("\tEnter x value >> ");
		xTwo = consoleInput.nextDouble();
		System.out.print("\tEnter y value >> ");
		yTwo = consoleInput.nextDouble();
		
		// Calculate according to Distance Formula
		double xDifference = xTwo - xOne;
		double yDifference = yTwo - yOne;
		
		double xDifferenceSquared = Math.pow(xDifference, 2D);
		double yDifferenceSquared = Math.pow(yDifference, 2D);
		
		double result = Math.sqrt(xDifferenceSquared + yDifferenceSquared);
		
		// Output result to user
		System.out.print("\n\nThe distance between the two points ");
		System.out.printf("(%.7f, %.7f) and (%.7f, %.7f) ", xOne, yOne, xTwo, yTwo);
		System.out.printf("is %.7f\n", result);
		
		
	}
	
}