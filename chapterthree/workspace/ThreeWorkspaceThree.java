public class ThreeWorkspaceThree{
	
	public static void main(String[] args){
		
		// SECTION 3.6: "STRINGS"
		
		// Each quoted string is an instance of the String class:
		String unpopularPhrase = "Turn off those games!";	// <-- The quoted string here being assigned IS an instance of the String class, come compilation time
		
		// Extracting substrings:
		// string.substring(a,b) <--- a is inclusive start, b is exclusive end
		// Use "+" to concatenate strings with other strings or any other data type
		String popularPhrase = unpopularPhrase.substring(0,9) + "the lights!";
		
		System.out.println("I will not " + unpopularPhrase + " but please " + popularPhrase + " on your way out the door!");
		System.out.println("\n\n");
		
		// String class: ".join()" and ".repeat()" methods
		String delimitedString = String.join("@@", "a", "b", "c", "d", "e");
		String repetaedString = "I'm Mr.Brightside! ".repeat(5);
		
		System.out.println("delimited string: " + delimitedString);
		System.out.println("repeated string: " + repetaedString);
		System.out.println("\n\n");
		
		String chaosAndFun = delimitedString.repeat(4);
		System.out.println(chaosAndFun);
		
		// Code Points and Code Units in Strings
		// .length() method returns number of code UNITS, not code points
		// true length of string is gotten by string.codePointCount(0, string.length())
		
		String greeting = "Hello There!";
		int codePointCount = greeting.codePointCount(0, greeting.length());
		System.out.println("The string \"" + greeting + "\" has " + codePointCount + " characters(code points)");
		System.out.println("\n\n");
		
		greeting = "Hello";
		//Get 4th code point
		int index = greeting.offsetByCodePoints(0,4);
		int cp = greeting.codePointAt(index);
		System.out.println(cp);
		System.out.println(index);
		System.out.println("\n\n");
		
		// STRING BUILDER CLASS TO BUILD STRINGS
		// Concatenating Strings can be inefficient because each time you concatenate, an entire new String object is craeted and stored in memory.
		// If building a string from smaller pieces for a continuous amount of time, creating these new string objects each and every time is time consuming
		// and wastes memory. StringBuilder avoids this problem
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Believe me Natalie, listen Natalie this is\n");
		stringBuilder.append("Your last chance to find a go-go dance to disco now\n");
		stringBuilder.append("Please believe me Natalie listen Natalie this is\n");
		stringBuilder.append("Your last chance to find a go-go dance to disco now\n");
		stringBuilder.append("Forget what they said in so-ho\n");
		stringBuilder.append("Leave the oh-nos out\n");
		stringBuilder.append("And believe me Natalie listen Natalie this is\n");
		stringBuilder.append("Your last chance\n");
		stringBuilder.append("There is an old cliche under your monet baby\n");
		stringBuilder.append("Remember the arch of roses right avobe your couch\n");
		stringBuilder.append("Forgetr what they say in so-ho leave the oh nos out\n");
		stringBuilder.append("Yes there is an old cliche under your monet baby\n");
		stringBuilder.append("You left the station\n");
		stringBuilder.append("Now to the floor with speculation\n");
		stringBuilder.append("What was it for in that old hallway\n");
		stringBuilder.append("Mom says why don't you stay - you've been away for a long time\n");
		stringBuilder.append("Believe me Natalie this is\n");
		stringBuilder.append("Your last chance to find a go-go\n");
		
		// Then create String object from String builder
		String completedString = stringBuilder.toString();
		System.out.println(completedString);
		
	}
	
}