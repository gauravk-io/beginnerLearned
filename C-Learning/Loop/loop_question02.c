#include<stdio.h>
int main(){




    /*
    Practice question 16 - Print the table of a number input by the user.
    */
    
    int num;
    printf("Enter number : ");
    scanf("%d", &num);

    for (int i = 1; i <= 10; i++)
    {
        printf("%d\n" , num*i);
    }
    
    return 0;

}
