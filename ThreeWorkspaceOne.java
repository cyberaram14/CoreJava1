public class ThreeWorkspaceOne{

    // ENUMERATED TYPES //
    // Defined by programmer - enumerated types have a fininte number of named values they can be assigned plus special value "null"
    enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };

    // The following is an exmaple of a class constant
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args){

        int numberInt;      // 32 bits
        short numberShort;  // 16 bits
        long numberLong;    // 64 bits
        byte numberByte;    // 8 bits

        numberByte = (byte) 2000;   //Since Precision loss might occur, Java langage mandates a (byte) cast for conversion - error thrown otherwise

        System.out.println(numberByte);


        numberLong = 1000L;
        numberShort = 8_000;            // Java compiler simply ignores the '_' in the source code
                                        // '_' meant only for human eyes and ease of understanding number magnitude (or scale? don't know)

        numberInt = 0B1001;             // Prefix 0B denotes the remaining digits as binary digits -> numberInt = 0 is the equivalent expression
        numberByte = 0x10;              // Prefix 0x denotes the remaining digits as hexadecimal digits -> numberByte = 7 is the equivalent expression

        System.out.println(numberShort);// Prints 8000
        System.out.println(numberInt);  // Prints 9
        System.out.println(numberByte); // Prints 16

        //Floating point types
        double valueOne;
        double valueTwo;
        double resultOne;
        double resultTwo;
        double resultThree;
        double resultFour;

        System.out.println("\n\n\tSHOWCASE SPECIAL DOUBLE VALUES THAT DENOTE OVERFLOW OR AN ERROR");
        System.out.println("========================================================================================");
        // Showcase Positive Infinity double special value
        valueOne = 1.0;
        valueTwo = 0;
        resultOne = valueOne / valueTwo;
        System.out.println("1.0 / 0-> Positive Infinity = " + resultOne);

        // Showcase Negative Infinity double special value
        valueOne = -1.0;
        valueTwo = 0;   //stays the same
        resultTwo = valueOne / valueTwo;
        System.out.println("-1.0 / 0 -> Negative Infinity = " + resultTwo);

        // Showcase Not a Number aka "NaN" double special value
        valueOne = 0;
        valueTwo = 0;
        resultThree = valueOne / valueTwo;
        System.out.println("0 / 0 -> Not a Number = " + resultThree);

        // Showcase Not a Number aka "NaN" double special value
        valueOne = -1.0;
        resultFour = Math.sqrt(valueOne);   //square root of negative number
        System.out.println("Square root of -1.0 -> Not a Number = " + resultThree);

        System.out.println("========================================================================================");

        // Escape Sequences
        // The \ u escape sequence can be used OUTSIDE character litearls and strings in the actual code. Example:
        //  \ u005B = '['
        //  \ u005D = ']'

        int\u005B\u005D listOfValues = new int\u005B10\u005D;   //creates array of size 10;
        listOfValues\u005B0\u005D = 1;

        System.out.println("" + listOfValues[0] + '\n');

        // Character class has methods to check if characters are valid characters to use in variable names
        System.out.println(Character.isJavaIdentifierStart('a'));   // True
        System.out.println(Character.isJavaIdentifierStart('&'));   // False
        System.out.println(Character.isJavaIdentifierPart('a'));    // True
        System.out.println(Character.isJavaIdentifierPart('*'));    // False

        int one, two, three;    // 2+ Variables declared on a single line is possible - not recommended for sake of program readability
        one = 1;
        two = 2;
        three = 3;


        /*

        // You cannot use a variable that has not been initialized
        int userValue;
        //Forgets to get user value
        System.out.println("User entered value: " + userValue); // Throws ERROR

        */

        // Use of keyword var that infers type of variable from first initial value
        var numberOfCars = 500;     //int value is infered and numberOfCars is of type "int"
        var carPrice = 54_000.99;   //double value is infered and carPrice is of type "double"
        System.out.println("\n" + numberOfCars + " cars in inventory - each with a price of " + carPrice + "\n\n");

        // CONSTANTS //

        // Use keyword "final" to denote a constant
        // Example:
        final int UNITS_PER_DOZEN = 12;
        int numberOfDozens = 4;

        System.out.println(numberOfDozens + " dozens of cookies contain a total of " + numberOfDozens * UNITS_PER_DOZEN + " cookies\n\n");



        // Use class constant CM_PER_INCH (defined at top of class) in the following code:
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH + "\n\n");


       
        // ENUMERATED TYPES //
        // Defined by programmer - enumerated types have a fininte number of named values they can be assigned plus special value "null"
        // The enum type is defined before the class at the top

        Size shoeSizeOne = Size.SMALL;
        Size shoeSizeTwo = Size.MEDIUM;
        Size shoeSizeThree = Size.LARGE;
        Size shoeSizeFour = Size.EXTRA_LARGE;
        Size shoeSizeFive = null;
        System.out.println("Shoe size is small:\n\n\t" + shoeSizeOne + "\n\n\n");
        System.out.println("Shoe size is medium:\n\n\t" + shoeSizeTwo + "\n\n\n");
        System.out.println("Shoe size is large:\n\n\t" + shoeSizeThree + "\n\n\n");
        System.out.println("Shoe size is extra large:\n\n\t" + shoeSizeFour + "\n\n\n");
        System.out.println("Shoe size is not set:\n\n\t" + shoeSizeFive + "\n\n\n");

        
        // Call "strictfp" tagged method "floatingPointAdder()"
        floatingPointAdder(1.0, 99.0);


        // TYPE CONVERSIONS //  
        int intValue = 123456789;
        float floatValue;

        // Legal Conversion: int to float converison
        floatValue = intValue;
        System.out.println("INT TO FLOAT CONVERSION:\nint: " + intValue + "\nfloat: " + floatValue + "\n\n\n");

        /*  CODE THROWS ERROR: "incompatible types: possible lossy conversion from float to int"
            TO FIX: (fix shown in next code section below) an explicit cast must be used
        // Non-legal covnersion: float to int conversion
        intValue = floatValue;
        System.out.println("FLOAT TO INT CONVERSION:\nint: " + intValue + "\nfloat: " + floatValue + "\n\n\n");
        */

        // Non-legal conversion made legal through explicit cast
        intValue = (int)floatValue;
        System.out.println("FLOAT TO INT CONVERSION:\nint: " + intValue + "\nfloat: " + floatValue + "\n\n\n");

        // Example of number truncated in type conversion
        // Truncation happens since the int value attempting to be assigned exceeds the range of values a byte can hold
        byte value_a;
        int value_b;

        value_b = 300;
        // Cast necessary due to information loss possibility
        value_a = (byte)value_b;
        System.out.println("TYPE CASTING CAN RESULT IN TRUNCATION:\nInteger value [" + value_b + "] turns into byte value [" + value_a + "] since integer's value exceeds range of values"
                            + "that can be held in a byte");

    }

    // Strictfp tag ensures all instructions  will use strict floating point computations which yield
    // reproducible results accross different platforms
    // Ensures same result from one machine to another
    public static strictfp void floatingPointAdder(double valueA, double valueB){

        var result = valueA + valueB;
        System.out.println("\n\n" + result + "\n\n");

        

    }

}