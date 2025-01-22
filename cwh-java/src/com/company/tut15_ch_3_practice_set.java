package com.company;


public class tut15_ch_3_practice_set {
    public static void main(String[] args) {

        /*
        write a java program to convert a string to Lowercase.
         */

        String name = "GaUrAv KuMaR";
        name = name.toLowerCase();
        System.out.println(name);


        /*
        write a java program to replace spaces with underscores.
         */

        String text = "TO myself from home";
        text = text.replace(" " , "_");
        System.out.println(text);


        /*
        write a java program to fill in a letter template which looks like below:
        letter =  "Dear <|name|> , Thanks a lot"
        replace <|name|> with a string(some name)
         */

        String letter = "Dear <|name|> , Thanks a lot";
        letter = letter.replace("<|name|>" , "Gaurav");
        System.out.println(letter);


        /*
        write a java program to detect double and triple spaces in a string.
         */

        String myString = "This isa string  containing   double and triple    spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));


        /*
        write a program to format the following letter using escape sequence characters.
         letter = "Dear Harry , This java Course is nice . Thanks"
         */

        String myLetter = "Dear Gaurav,\n\t Your Java Course is nice.\n\t Thanks";
        System.out.println(myLetter);

    }
}
