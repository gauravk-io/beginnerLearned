package beginner;

public class variable {
//    global variable
    static int ages = 45;   // static variable only used with static method.

    public static void main(String[] args) {
//        local variable
        int age;    // declare variable
        age = 25;   // initialize variable
        age = 30;   // value updated
        System.out.println("I'm " +ages+ " years old" );
        System.out.println("I'm " +age+ " years old" );
    }
}

/*

The rules for naming variables in Java are as follows:

1.  Variable names must start with a letter (a-z or A-Z), the dollar sign ($), or the underscore (_) character.
    Example: Valid: count, $total, _result
             Invalid: 1total, #count

2.  After the initial character, variable names can contain letters, numbers (0-9), the dollar sign ($), or the
    underscore (_) character.
    Example: Valid: totalCount, item1, total_amount
             Invalid: total-amount, @result, variable-name

3.  Variable names are case-sensitive. Uppercase and lowercase letters are considered distinct.
    Example: Valid: count, Count, COUNT
             Invalid: cOuNt

4.  Variable names should be descriptive and meaningful, using lowercase letters for the first word and then camel case
    for subsequent words.
    Example: Valid: studentName, totalCount, isValidFlag
             Invalid: student_name, TotalCount, isvalidflag

5.  Reserved keywords in Java cannot be used as variable names, as they have predefined meanings in the language.
    Example: Invalid: int, public, class

6.  Avoid using single-character variable names unless they have a specific meaning in the context of the code.
    Example: Valid: i, j (commonly used as loop counters)
             Invalid: x, y
*/