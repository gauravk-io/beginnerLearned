#include<stdio.h>
#include<math.h>

        //QUESTION -  Use Library function to calculate the square of a number given by the user.


int main(){
    int n = 4;
    printf("Enter the number : ");
    scanf("%d" , &n);

    printf("%.0f" , pow(n,2));

    
    return 0;
}