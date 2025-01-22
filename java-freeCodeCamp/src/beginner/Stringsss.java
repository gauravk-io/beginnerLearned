package beginner;

public class Stringsss {
    public static void main(String[] args) {
        String name = "MY NAME IS GAURAV";      // literal string (recommended)

        String naam = new String("My Name Is Gaurav");      // object string

        System.out.println(naam);


        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectstring1 = new String("xyz");
        String objectstring2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectstring1 == objectstring2);


        String namee = "Sagar";
        int age = 18;
        String company = "Self employed";
        String country = "India";

        String formattedString = String.format("My name is %s. I'm from %s. I'm %d years old. I " +
                "work for %s" , namee, country, age, company);  // format specifier

        System.out.println(formattedString);

        String xyz = "abc";
        System.out.println(xyz.length());             // method of string .length

    }
}

/*
format specifier for integer is %d
format specifier for string is %s
format specifier for float is %f
format specifier for double is %f
format specifier for char is %c
format specifier for boolean is %b

 */

/*
        String methods in java

1. charAt(int index): Returns the character at the specified index.

2. length(): Returns the length of the string.

3. substring(int beginIndex): Returns a new string that is a substring of the original string,
   starting from the specified index.

4. contains("word"): return true or false if the word is present in string or not.

5. substring(int beginIndex, int endIndex): Returns a new string that is a substring of the original
   string, starting from the specified begin index and ending at the specified end index (exclusive).

6. concat(String str): Concatenates the specified string to the end of the original string.

7. isEmpty(): Checks whether the string is empty (contains no characters) or not.

8. equals(Object obj): Compares the string with the specified object for equality.

9. equalsIgnoreCase(String str): Compares the string to the specified string, ignoring case
   considerations.

10. indexOf(int ch): Returns the index of the first occurrence of the specified character in the
    string.

11. indexOf(String str): Returns the index of the first occurrence of the specified substring in the
    string.

12. lastIndexOf(int ch): Returns the index of the last occurrence of the specified character in the
    string.

13. lastIndexOf(String str): Returns the index of the last occurrence of the specified substring in
    the string.

14. startsWith(String prefix): Checks whether the string starts with the specified prefix.

15. endsWith(String suffix): Checks whether the string ends with the specified suffix.

16. toLowerCase(): Converts the string to lowercase.

17. toUpperCase(): Converts the string to uppercase.

18. trim(): Removes leading and trailing whitespaces from the string.

19. replace(char oldChar, char newChar): Replaces all occurrences of the specified character with a
    new character.

20. replace(CharSequence target, CharSequence replacement): Replaces all occurrences of the specified
    target sequence with a new sequence.

21. split(String regex): Splits the string into an array of substrings based on the specified regular
    expression.

22. startsWith(String prefix, int offset): Checks whether the string starts with the specified prefix,
    starting from the specified offset.

23. endsWith(String suffix, int offset): Checks whether the string ends with the specified suffix,
    considering the specified offset.

    and many more......

 */

