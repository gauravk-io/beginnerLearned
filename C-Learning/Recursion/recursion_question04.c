#include<stdio.h>

            /*  Question - Write a function to calculate percentage of a student from marks in Science,
                           Math and sanskrit.
            */

int calcPercentage(int science , int math , int sanskrit);

int main(){
    int sc = 99;
    int math = 95;
    int sanskrit = 90;

    printf("percentage is : %d" , calcPercentage(sc,math,sanskrit));
    return 0;
}

int calcPercentage(int science , int math , int sanskrit){
    return ((science + math + sanskrit)/3);
}