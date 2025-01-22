#include<stdio.h>

int main(){

    

    /*
        Practice question 17 - Keep taking numbers as input from user untill
        user enters an odd number.
    */
    
    
    int e;
    do
    {
        printf("Enter number : ");
        scanf("%d" , &e);
        printf("%d\n" , e);

        if(e%2!=0){
            break;
        }
    } while (1);
    printf("Thank you \n");


    return 0;
    
}