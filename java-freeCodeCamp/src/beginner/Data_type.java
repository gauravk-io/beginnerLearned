package beginner;

public class Data_type {
    public static void main(String[] args) {
//        integer types
        byte aSingleByte = 100;     // -128 to 127
        short aSmallNumber = 20000;     // -32,768 to 32,767
        int anInteger = 2147483647;     // -2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L;   // -9223372036854775808 ro 9223372036854775807

//        decimal types
        double aDouble = 1.79769313;     // 4.9E-324 to 1.7976931348623157E308
        float aFloat = 3.4028F;     // 1.4E-45 to 3.4028235E38

//        booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

//        character
        char percentSymbol = '%';

        System.out.println("This is percent symbol: " + percentSymbol);

        int number1 = 50;
        double number2 = number1;   // integer changed to double data type  (Implicit Typecasting)

        System.out.println(number2);


        double number3 = 5.08;
        int number4 = (int)number3;     // (Explicit Typecasting)

        System.out.println(number4);
    }
}


/*
Implicit Typecasting (Widening Conversion):

1. Implicit typecasting, also known as widening conversion, occurs when a smaller data type is
   automatically converted to a larger data type.
2. This conversion is performed by the Java compiler without the need for any explicit casting operator.
3. It is considered safe because no data loss occurs during the conversion.


Explicit Typecasting (Narrowing Conversion):

1. Explicit typecasting, also known as narrowing conversion, occurs when a larger data type is
   explicitly converted to a smaller data type.
2. This conversion may result in data loss or truncation of the value.
3. To perform explicit typecasting, the target data type needs to be specified using parentheses
   along with the casting operator.


Diff types of Data Types

Integer (int): Used to represent whole numbers without any decimal points.

Float (float): Used to represent numbers with decimal points.

Double (double): Similar to float but can represent larger decimal numbers with greater precision.

Character (char): Used to store a single character, such as a letter or a digit.

String (str): A sequence of characters. Strings are used to represent text.

Boolean (bool): Represents a binary value, typically true or false.

Array: A collection of elements of the same data type stored in contiguous memory locations.

List: Similar to an array, but it can dynamically resize, and elements can be of different data types in languages like Python.

Tuple: An ordered, immutable collection of elements. Elements can be of different data types.

Dictionary (dict) or Map: A collection of key-value pairs, where each key must be unique.

Set: An unordered collection of unique elements.

Pointer: A variable that stores the memory address of another variable.

Struct or Record: A user-defined data type that allows grouping different data types under a single name.

Enumeration (enum): A set of named integer constants.

Void: Represents the absence of a type. Often used for functions that don't return a value.

Function: Represents a callable routine or method.
 */
