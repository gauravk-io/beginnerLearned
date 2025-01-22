# include<stdio.h>

int main(){


    // Write a program to check if a number is divisible by 2 or not.

    int x;
    printf("Enter a number : ");
    scanf("%d", &x);
    printf("%d\n",x%2 == 0);



    // Write a program to check a number is EVEN or ODD.

    int y;
    printf("Enter a number : ");
    scanf("%d", &y);
    printf("%d\n",y%2 == 0); // if return 0 then number is odd and when return 1 the number is even.

    return 0;
}