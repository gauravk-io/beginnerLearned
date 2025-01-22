#include<stdio.h>

int main(){
    

    /*
    Practice question 15 - Print the sum of first n natural numbers
    also print them in reverse.
    */




    int n;
    printf("Enter number : ");
    scanf("%d", &n);
//  code for sum
    int sum=0;
    for (int j = 1; j<=n; j++){
        sum = sum+j;
    }
    printf("Sum is %d\n" , sum);

// code for reverse print
    for (int j=n; j>=1; j--)
    {
        printf("%d\n" ,j);
    }
    
    return 0;

}