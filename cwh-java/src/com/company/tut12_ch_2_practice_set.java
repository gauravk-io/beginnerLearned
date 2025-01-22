package com.company;
import java.util.Scanner;

public class tut12_ch_2_practice_set {
    public static void main(String[] args) {





         /*
        QUESTION 1
        what will be the result of the following expression
        float a = 7/4*9/2
         */

        float a = 7/4*9/2; // wrong
        System.out.println(a);
        float b = 7/4.0f * 9/2.0f; // right
        System.out.println(b);


        /*
        QUESTION 2
        Write a java program to encrypt a grade by adding 8 to it.
        Decrypt it to show the correct grade.
         */

        char grade = 'B';
        grade = (char)(grade + 9);
        System.out.println(grade);


        //Decrypting the grade
        grade = (char)(grade - 9);
        System.out.println(grade);


        /*
        QUESTION 3
        Use comparison operator to find out whether a given number is greater than the user
        entered number or not.
         */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x>9);


        /*
        QUESTION 4
        write the following expression in a java program:
        (V square - U square)/2as
         */
        int V = 45;
        int U = 34;
        int A = 8;
        int C = 8;
        int k = (V*V - U*U)/(2*A*C);
        System.out.println(k);


        /*
        QUESTION 5
        Find the value of the following expression:
        int x =7;
        int a = 7*49/7+35/7
        Value of a = ?
         */

        System.out.println(7*49/7+35);





    }
}
