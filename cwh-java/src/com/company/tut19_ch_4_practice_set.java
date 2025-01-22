package com.company;
import java.util.Scanner;

public class tut19_ch_4_practice_set {
    public static void main(String[] args) {
        /*

        What will be the output of this program:
        int a = 10;
        if (a = 11)
            system.out.println("i am 11");
        else
            system.out.println("i am not 11");

         */


               //  Give Error because we cannot use assignment operator inside if.


        /*

        Write a program to find out whether a student is pass or fail ;
        if it requires total 40% and at least 33% in each subject to pass.
        Assume 3 subject and take marks as input from the user

         */

        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physic");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Maths");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is:" + avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("Congratulations , You have been passed");
        }
        else{
            System.out.println("Sorry try again and iis baar khud se padh ke aana , dost ke bharose mt rahna wo khud tere bharose aaya hai");

        }

        /*

        calculate the income tax paid by an employee to the government
        as per the slabs mentioned below:

                income slab             Tax
                2.5L - 5.0L             5%
                5.0L - 10.0L            20%
                above 10.0L             30%
        note that there is no tax below 2.5L . Take input amount as an
        input from the user.

         */


        /*

        Write a java program to find out the day of the week given
        the number [1 for monday, 2 for tuesday, ....... and so on!]

         */



        /*

        write a java program to find whether a year entered by the user
        is a leap year or not.

         */



        /*

        write a program to find out the type of website from the url

                    .com - commercial website
                    .org - organization website
                    .in - indian website

         */
    }
}
