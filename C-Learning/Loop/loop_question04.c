#include<stdio.h>

int main(){

    
                //  QUESTION NO - 21 -> print the factorial of a number n.
                // we will check only for small numbers because int variable is not capable for storing large data

    
    int n1;
    printf("Enter number : ");
    scanf("%d" , &n1);

    int fact = 1;
    for (int i = 1; i <= n1; i++)
    {
        fact = fact*i;
    }
    
    printf("Final factorial is %d" , fact);

    return 0;


}