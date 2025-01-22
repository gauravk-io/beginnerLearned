package com.company;

public class tut17_operators {
    public static void main(String[] args) {
        System.out.println("for logical AND");
        boolean a = true;
        boolean b = false;
        if (a && b ){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("for logical OR");
        boolean a1 = true;
        boolean b1 = false;
        if (a1 || b1 ){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("for logical NOT");
        boolean a2 = true;
        boolean b2 = false;
        System.out.println("Not (a2) is ");
        System.out.println(!a2);
        System.out.println("Not (b2) is ");
        System.out.println(!b2);
        
        
    }
}
