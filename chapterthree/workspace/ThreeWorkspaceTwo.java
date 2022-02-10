
//static import example:
import static java.lang.Math.*; // Allows the use of Math class' static methods and static constants without having to type the prefix "Math."




public class ThreeWorkspaceTwo{

	private static final int JESSES_CONSTANT = 12
	private static final int IMPOSSIBLE_CONSTANT = 18;
	private static final int NATHANS_CONSTANT = 14;
    private static final int CARLOS_CONSTANT = 354;
    private static final int ARAMS_CONSTANT = 4;
    private static final int YAZIDS_CONSTANT = 2;

    public static void main(String[] args){

        // We can use class constants from other classes if declared as "public"
        System.out.println("Value CM_PER_INCH from class \"ThreeWorkspaceOne.java\": " + ThreeWorkspaceOne.CM_PER_INCH + "\n\n");


        double randomNumber = 284.40;
        System.out.println("Square root of " + randomNumber + "is = " + sqrt(randomNumber));
        System.out.println(randomNumber + " to the power of 2 is = " + pow(randomNumber, 2));

        float floatValue;
        floatValue = 14.0F; // 'F' is necessary since any floating point literal without it is 
                            // considered to be type double
		
		
		// What happens if you divice an integer value by 0:
		//int result = 2 / 0;	throws an exception ArithmeticException
        
    }


}
