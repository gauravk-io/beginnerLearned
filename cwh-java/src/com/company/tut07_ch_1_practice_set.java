package com.company;
import java.util.Scanner;

public class tut07_ch_1_practice_set {
    public static void main(String[] args) {

        /*
        QUESTION 1
        write a program to sum three numbers in JAVA
         */

        int num1 = 6;
        int num2 = 4;
        int num3 = 5;
        int sum = num1 + num2 + num3;
        System.out.print("The Sum of these numbers is: ");
        System.out.println(sum);





        /*
        QUESTION 2
        write a program to calculate CGPA using marks of three subjects(out of 100)
         */

        float subject1 = 68;
        float subject2 = 98;
        float subject3 = 64;
        float cgpa = (subject1 + subject2 +subject3)/30;
        System.out.println(cgpa);




        /*
        QUESTION 3
        write a java program which asks the user to enter his/her name and greats them with
        "Hello <name>, have a good day" text
         */

        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day.");





        /*
        QUESTION 4
        write a java program to convert kilometer to miles
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter then number of kilometres: ");
        double km = scn.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometres is equal to " + miles + " miles.");





        /*
        QUESTION 5
        write a java program to detect whether a number entered by the user is integer or not.
         */

        System.out.println("Enter your number");
        Scanner scc = new Scanner(System.in);
        System.out.println(scc.hasNextInt());

    }
}
