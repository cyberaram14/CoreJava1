import java.util.Scanner;	// Since "Scanner" is not part of java.lang so it needs to be imported
import java.io.Console;		// Since "Console" is not part of java.lang so it needs to be imported
//import java.util.Arrays;	// Since "Arrays " is not part of java.lang so it needs to be imported
import java.util.Date;		// Since "Date   " is not part of java.lang so it needs to be imported

public class ThreeWorkspaceFour{
	
	public static void main(String[] args){
		
		// SECTION 3.7: INPUT AND OUTPUT
		
		
		// FIRST PART OF CURRENT SECTION
		Scanner consoleInput = new Scanner(System.in);	// Attatches Scanner output to System.in "standardd input stream"
		
		
		String favoriteSentence;
		String firstName;
		String lastName;
		int age;
		
		// Collect user information
		System.out.print("Enter your favorite sentence\n>> ");
		favoriteSentence = consoleInput.nextLine();
		System.out.println("\n\n");
		
		System.out.println("Great! Now tell us some more about you. We're dying to meet you");
		System.out.print("What is your first name?\n>> ");
		firstName = consoleInput.next();
		System.out.print("Alright, " + firstName + "! What about your last name?\n>> ");
		lastName = consoleInput.next();
		System.out.println("\n");
		
		System.out.print("Please tell us your age!\n>> ");
		age = consoleInput.nextInt();
		System.out.println("\n");
		
		// Some processing of user data
		String fullName = firstName + " " + lastName;
		
		StringBuilder buildUserInfo = new StringBuilder();
		buildUserInfo.append("Your full name is ");
		buildUserInfo.append(fullName + "! Nice to meet you " + firstName + ".");	
		buildUserInfo.append("Here is what we know about you:\n");
		buildUserInfo.append("Your age is " + age + " years old.");
		buildUserInfo.append("Your favorite sentence, which is now our favorite, is:\n");
		buildUserInfo.append("\t\"" + favoriteSentence + "\"\n\n");
		
		String userInfo = buildUserInfo.toString();
		
		// Print user information to screen
		System.out.println("To summarize:\n");
		System.out.println(userInfo);
		System.out.println("\n");
		
		System.out.println("Heck yeah, awesome!");
		
		
		// Using Console object to get password:
		String hardCodedUsername = "DestroyerOfReality";
		String hardCodedPassword = "Password123";
		
		System.out.println("Now log in to your account\n\n");
		
		Console console = System.console();
		String enteredUsername = console.readLine("User name: ");
		char[] enteredPassword = console.readPassword("Password: ");
		System.out.println("\n\n");
		
		// Verify entered credentials
		
		//System.out.println(String.valueOf(enteredPassword));
		
		
		// Verify username
		boolean usernameVerified = hardCodedUsername.equals(enteredUsername);
		
		// Verify password
		boolean passwordVerified = hardCodedPassword.equals(String.valueOf(enteredPassword));	// <-- do NOT do this pls :D in actual real life code
		
		// Determine credentials with ternary operator
		String result = (usernameVerified && passwordVerified) ? "Welcome, to your home" : "You're a liar and a fake. Get out.";
		
		
		// Print results of credential verification
		System.out.println(result);
		System.out.println("\n\n");
		
		
		// SECOND PART OF CURRENT SECTION
		
		// Formatting output can be achieved using C language's "printf()" method
		
		double valueToPrint = 1000000d / 3;
		
		System.out.println(valueToPrint);
		
		// Now print formatted outputs
		System.out.printf("|%f|\n", valueToPrint);
		System.out.printf("|%.2f|\n", valueToPrint);
		
		System.out.println("\n\n");
		
		System.out.printf("|%20.2f|\n", valueToPrint);
		System.out.printf("|%20.3f|\n", valueToPrint);
		System.out.printf("|%20.4f|\n", valueToPrint);
		System.out.printf("|%20.5f|\n", valueToPrint);
		System.out.printf("|%20.6f|\n", valueToPrint);
		System.out.printf("|%20.7f|\n", valueToPrint);
		System.out.printf("|%20.8f|\n", valueToPrint);
		System.out.printf("|%20.9f|\n", valueToPrint);
		
		System.out.println("\n\n");
		
		// Print same thing, but now left justifying
		System.out.printf("|%-20.2f|\n", valueToPrint);
		System.out.printf("|%-20.3f|\n", valueToPrint);
		System.out.printf("|%-20.4f|\n", valueToPrint);
		System.out.printf("|%-20.5f|\n", valueToPrint);
		System.out.printf("|%-20.6f|\n", valueToPrint);
		System.out.printf("|%-20.7f|\n", valueToPrint);
		System.out.printf("|%-20.8f|\n", valueToPrint);
		System.out.printf("|%-20.9f|\n", valueToPrint);
		
		System.out.println("\n\n");
		
		// Print same thing but with commas to separate groups
		System.out.printf("|%,-20.2f|\n", valueToPrint);
		System.out.printf("|%,-20.3f|\n", valueToPrint);
		System.out.printf("|%,-20.4f|\n", valueToPrint);
		System.out.printf("|%,-20.5f|\n", valueToPrint);
		System.out.printf("|%,-20.6f|\n", valueToPrint);
		System.out.printf("|%,-20.7f|\n", valueToPrint);
		System.out.printf("|%,-20.8f|\n", valueToPrint);
		System.out.printf("|%,-20.9f|\n", valueToPrint);
		
		System.out.println("\n\n");
		
		//Using the flag '$' in format specifiers
		//Argument indices start with 1, not 0, to not confuse with '0' flag
		
		int valueOne = 1;
		int valueTwo = 2;
		int valueThree = 3;
		int valueFour = 4;
		int valueFive = 5;
		
		System.out.printf("%1$d %1$d %1$d %1$d %5$d", valueOne, valueTwo, valueThree, valueFour, valueFive);
		System.out.println("\n\n");
		
		//The "<" flag formats the same value/argument that the previous specificatoin formatted
		final int DAYS_PER_WEEK = 7;
		System.out.printf("A %d-day week will always have %<d days no matter what. However, there's %d days in a year\n", DAYS_PER_WEEK, 365);
		//Alternatively using $ flag:
		System.out.printf("A %1$d-day week will always have %1$d days no matter what. However, there's %2$d days in a year\n", DAYS_PER_WEEK,  365);
		
		// PART THREE OF CURRENT SECTION
		
		// You can actually format a string without having to print it in a print statement
		
		
		String firstName_a = "Alan";
		String lastName_a = "Turing";
		String accomplishment = "Helped advance computer science during World War 2!";
		
		String stringToFormat = "The individual %s %s accomplished the following: %s";
		
		String message = String.format(stringToFormat, firstName_a, lastName_a, accomplishment);
		System.out.println(message);
		
		// Alternative option:
		String duplicateMessage = String.format("The individual %s %s accomplished the following: %s", firstName_a, lastName_a, accomplishment);
		System.out.println(duplicateMessage);
		System.out.println("\n\n");
		
		
		// java.util.Date formatting with System.out.printf()
		Date currentDate = new Date();
		System.out.printf("%tc\n", currentDate);	//'c' conversion character prints out complete date and time
		System.out.printf("%tT\n", currentDate);	//'t' prints out 24 hour time
		System.out.printf("%tr\n", currentDate);	//'r' prints out 12 hour time
		System.out.printf("%tB\n", currentDate);	//'B' prints out full month name
		System.out.printf("%tb\n", currentDate);	//'b' prints out abbreviated month name
		System.out.printf("%tZ\n", currentDate);	//'Z' prints out Time zone
		System.out.printf("%tp\n", currentDate);	//'p' prints morning or afternoon marker
		System.out.printf("%Tp\n", currentDate);	//'p' prints morning or afternoon marker AND capital 'T' forces capitalized output
		
		System.out.println();
		
		//PART FOUR OF CURRENT SECTION
		// Print out the current day in a formal way
		
		// ADVANCED JAVA CODE PORTION:
		// Okay yes, I know more java than what I'm supposed to know according to you. 
		// # Exposed
		// This means I will utilize java code that I'm not yet supposed to know because to not use it
		// irks me and irritates my usually peaceful self
		// Here we go:
		
			String timeDesignation;
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
			// This is the end of my advanced code
		
		System.out.printf("Today is %tA, %tB the %td%s, %tY", currentDate, currentDate, currentDate, timeDesignation, currentDate);
		
		// Notice in above statement, "currentDate" has to be supplised a total of 5 times. Ridiculous, rigttt? We can use argument indices to adress this
		// Instead of providing "currentDate" 5 times, we can specify in the format specifications the index of the argument we want to format in that very format specitifcation
		// The following achieves this goal:
		
		System.out.println("\n\n");
		System.out.printf("Today is %1$tA, %1$tB the %1$td%2$s, %1$tY\n", currentDate, timeDesignation);
		
		//Alternative with '<'flag
		System.out.printf("Today is %tA, %<tB the %<td%2$s, %1$tY\n", currentDate, timeDesignation);
		
	}
	
}