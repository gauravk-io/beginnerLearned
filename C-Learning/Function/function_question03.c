#include<stdio.h>

// QUESTION - Print Table of number entered by the user using function.

void printTable();

int main(){
    int n;
    printf("Enter number : ");
    scanf("%d" , &n);

    printTable(n);   //argument / actual parameter

    return 0;
}

void printTable(int n){    //parameter / formal parameter
    for(int i=1 ; i<=10 ; i++){
        printf("%d\n" , i*n);
    }

}