package com.company;
import java.util.Scanner;

public class tut18_else_if_and_switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>54) {
            System.out.println("you are experienced");
        } else if (age>45) {
            System.out.println("you are semi experienced ");
        } else if (age>35) {
            System.out.println("you are semi/2 experienced");
        } else if (age>25) {
            System.out.println("you are not experienced ");
        } else {
            System.out.println("you are dudh pine walla baacha");
        }




//----------------------------------------------------------------------------------------------------------------------
       /*
       String name[] = {"Mohan", "Rohan", "Soham"};
        int Roll[] = {25, 36, 71};
        if (name[0] == "Mohan" && Roll[1] == 25) {
            System.out.println("Details of Mohan.");
        } else if (name[2] == "Rohan" && Roll[1] == 36) {
            System.out.println("Details of Rohan.");
        } else if (name[2] == "Soham" && Roll[2] == 71) {
            System.out.println("Details of Soham.");
        } else {
            System.out.println("Invalid details.");
        }
        */


//----------------------------------------------------------------------------------------------------------------------


        int saal;
        System.out.println("Enter your age");
        Scanner sc1 = new Scanner(System.in);
        saal = sc1.nextInt();
        switch (saal) {
            case 18 -> System.out.println("You are going to become an adult");
            case 23 -> System.out.println("You are going to marriage");
            case 45 ->
                    System.out.println("kya kr raha hai yaar , ye sb bas doglapan hai ruk mai avi tera dogalapan utarta hu");
            case 60 -> System.out.println("You are going to get retirement");
            default -> System.out.println("Mar ja saaleeee.....");
        }
    }
}


