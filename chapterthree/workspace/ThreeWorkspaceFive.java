
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ThreeWorkspaceFive{
	
	public static void main(String[] args) throws IOException{
		
		// FILE INPUT AND OUTPUT
		
		// OBJECTIVES:
		//     - Test the accessing to "relative" files
		//     - Perform basic input operations FROM files TO program
		//     - Perform basic output operations FROM program TO files
		
		// TEST ACCESSING OF RELATIVE FILES
		// 1. Access file in current JVM directory - "ThreeTestFileOne.txt"
		{
			Scanner input_testFileOne = new Scanner(Path.of("ThreeTestFileOne.txt"), StandardCharsets.UTF_8);
			String lineOne = input_testFileOne.nextLine();
			String lineTwo = input_testFileOne.nextLine();
			String lineThree = input_testFileOne.nextLine();
			
			System.out.println(lineOne);
			System.out.println(lineTwo);
			System.out.println(lineThree);
			System.out.println();
		}
		
		// 2. Access file in child directory
		{
			Scanner input_testFileTwo = new Scanner(Path.of("ThreeTestFileTwo//ThreeTestFileTwo.txt"), StandardCharsets.UTF_8);
			String lineOne = input_testFileTwo.nextLine();
			String lineTwo = input_testFileTwo.nextLine();
			String lineThree = input_testFileTwo.nextLine();
			
			System.out.println(lineOne);
			System.out.println(lineTwo);
			System.out.println(lineThree);
			System.out.println();
		}
		
		// 3. Access file by having to Java 11 programming bookgo through parent directory
		{
			Scanner input_testFileThree = new Scanner(Path.of("..//ThreeTestFileThree//ThreeTestFileThree.txt"), StandardCharsets.UTF_8);
			String lineOne = input_testFileThree.nextLine();
			String lineTwo = input_testFileThree.nextLine();
			String lineThree = input_testFileThree.nextLine();
			
			System.out.println(lineOne);
			System.out.println(lineTwo);
			System.out.println(lineThree);
			System.out.println();
		}
		
	
	
		// PERFORM BASIC INPUT OPEARTIONS FROM FILES TO PROGRAM
		// This was already accomplished in the previous code
		// Of course, nextInt(), nextDouble(), next.... could be used in the same way. No need for further exploration
	
		// PERFORM BASIC OUTPUT OPERATIONS FROM PROGRAM TO FILES
		{
			PrintWriter output_testFileFour = new PrintWriter("ThreeTestFileFour.txt", StandardCharsets.UTF_8);	// File "ThreeTestFileFour.txt" will be created since it does not exist already
			output_testFileFour.println("According to United States Intelligence: Russia has decided to invade Ukraine next week");
			output_testFileFour.println("This will be devastating to Russia - a country whose decision to invade would bring untold economic sanctions that would harm the Russian economy");
			output_testFileFour.println("This will also be devastating to the peace that Europe has experienced for decades now");
		
			String timeDesignation = null;
			Date currentDate = new Date();
			int currentDay = currentDate.getDay();
		
			switch(currentDay){
				case 1:
					timeDesignation = "st";
					break;
				case 2:
					timeDesignation = "nd";
					break;
				case 3:
					timeDesignation = "rd";
					break;
				default:
					timeDesignation = "th";
					break;
			}
		
			String dateOfNotice = String.format("This information is brought to you on %1$tB the %<te%2$s, %1$tY", currentDate, timeDesignation);
		
			output_testFileFour.println(dateOfNotice);
			output_testFileFour.close();
		}
		
		// EXTRA: Attempt to create two Sanner objects attatched to the same file
		Scanner scannerOne = new Scanner(Path.of("ThreeTestFileFive.txt"), StandardCharsets.UTF_8);
		Scanner scannerTwo = new Scanner(Path.of("ThreeTestFileFive.txt"), StandardCharsets.UTF_8);
		
		System.out.println(scannerOne.nextLine());
		System.out.println(scannerTwo.nextLine());
		
		System.out.println("End of code!");
		
	}	
	
	
}