package com.company;
import java.util.Scanner;

public class tut06_Exercise_01 {
    public static void main(String[] args) {


        /*

        JAVA EXERCISE 1 (SELF SOLVED AND CORRECT)


        Write a program to calculate percentage of a given students in CBSE board exam . His marks from 5
          subjects must be taken as input from the keyboard.
          (marks are out of 100)
          */


        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Maths");
        float subject1 = sc.nextFloat();

        System.out.println("Enter Number of Physics");
        float subject2 = sc.nextFloat();

        System.out.println("Enter Number of Chemistry");
        float subject3 = sc.nextFloat();

        System.out.println("Enter Number of Hindi");
        float subject4 = sc.nextFloat();

        System.out.println("Enter Number of English");
        float subject5 = sc.nextFloat();

        float cgpa = (subject1 + subject2 + subject3 + subject4 + subject5)/5;

        System.out.print("Percentage obtained by the student is: " + cgpa + " percent");

    }

}
