package beginner;
import java.util.Scanner;           // import package

public class User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // created a Scanner object called scanner and
        // System.in is a parameter which represents the standard input stream

        System.out.print("What is your name?");
        String name = scanner.nextLine();  // use nextLine() to read a line of text (the name)

        System.out.println("Name: " + name);

        System.out.printf("Hello %s. how are you?", name);  // format specifier (printf)

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // use nextInt() to read an integer (the age)

        System.out.println("Age: " + age);

        scanner.close();  // don't forget to close the scanner
    }
}



        /*

        Loopholes in scanner:


        1. Trailing Newline: When using nextLine() after nextInt() or nextDouble(), you might
        encounter an issue where the nextLine() method reads the newline character left in the
        input buffer instead of capturing the actual input. This is because nextInt() or
        nextDouble() only read the numeric value, not the newline character. To overcome this, you
        can add an extra scanner.nextLine() after nextInt() or nextDouble() to consume the newline
        character.

         example:
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
         */



        /*
        2. Whitespace Issues: The nextInt() and nextLine() methods behave differently when it comes
        to handling whitespace characters. nextInt() ignores leading whitespace and only reads the
        next integer value, while nextLine() reads the entire line, including any leading or
        trailing whitespace. This can cause unexpected results if you're switching between using
        nextInt() and nextLine() in your code.

        Example:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.print("Enter a string: ");
        String text = scanner.nextLine(); // Consumes the remaining newline character, but can also capture whitespace
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);

        To avoid such issues, you can either use nextLine() consistently and parse the input
        appropriately or use additional nextLine() calls to consume any unwanted characters before
        using nextInt() or nextDouble().
         */




/*
To use the Scanner class, you first need to create an instance of the class by importing the java.util.Scanner
package and initializing it with an appropriate input source.

In the example above, we create a Scanner object called scanner and initialize it with the System
.in parameter, which represents the standard input stream (console). We then use various methods
provided by the Scanner class to read user input. In this case, we use nextLine() to read a line
of text (the name) and nextInt() to read an integer (the age).

After reading the input, we can perform operations or manipulate the data as needed.

Finally, it's important to close the scanner using the close() method to release any associated
system resources.

 */