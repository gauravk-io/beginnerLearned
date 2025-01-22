package com.company;

public class tut14_string_support_in_JAVA {
    public static void main(String[] args) {
        String name = "Harry";

//        1. name.length() - return the length of the string name.

        int value = name.length();
        System.out.println(value);

//        2. name.toLowerCase() - return a new string which has all the lowercase character from the string name.

        String lstring = name.toLowerCase();
        System.out.println(lstring);

//        3. name.toUpperCase() - return a new string which has all the uppercase character from the string name.

        String ustring = name.toUpperCase();
        System.out.println(ustring);

//        4. name.trim() - return a new string after removing all the leading and trailing spaces from the original string.

        String nonTrimmedString = "       Gaurav       ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

//        5. name.Substring(index start) - returns a substring from start to the end.

        System.out.println(name.substring(3));

//        6. name.Substring(index start , index end) - returns a substring from start to the end index. Start index is included and the end is excluded.

        System.out.println(name.substring(1,3));

//        7. name.replace('r' , 'p' [r and p both are char]) - returns a new string after replacing 'r' with 'p'.

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r" , "sagar"));

//        8. name.startsWith("--") - returns true if name starts with string "--".

        System.out.println(name.startsWith("H"));
        System.out.println(name.startsWith("T"));

//        9. name.endsWith("--") - returns true if name ends with  string "--".

        System.out.println(name.endsWith("y"));
        System.out.println(name.endsWith("d"));

//        10. name.charAt(some index) - return character at a given index position.

        System.out.println(name.charAt(3));

//        11. name.indexOf() -return the index of the given string.
//                  Example - name.indexOf("ar") returns 1 which is the first occurrence of ar in string "Harry".  -1 otherwise.

        System.out.println(name.indexOf("ry"));
        System.out.println(name.indexOf("sa"));

//        12. name.indexOf("s",3) - returns the index of the given string starting from index 3(int). -1 is returned in this case!

        System.out.println(name.indexOf("y", 3));
        System.out.println(name.indexOf("p", 3));

//        13. name.lastIndexOf("r") - returns the index of given string. 3 in this case

        System.out.println(name.lastIndexOf("r"));

//        14. name.lastIndexOf("r",2) - returns the last index of the given string before index 2.

        System.out.println(name.lastIndexOf("r" , 4));

//        15. name.equals("Harry") - returns true if the given string is equal to "Harry" . False otherwise [Case Sensitive].

        System.out.println(name.equals("Harry"));
        System.out.println(name.equals("harry"));

//        16. name.equalsIgnoreCase("Harry") - returns true if the given string is equals to "Harry"  false otherwise [Case insensitive].

        System.out.println(name.equalsIgnoreCase("Harry"));
        System.out.println(name.equalsIgnoreCase("harry"));

    }
}
