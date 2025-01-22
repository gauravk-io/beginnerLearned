# include<stdio.h>

int main(){

    // Print True or False for the following statments.


    // a. if it's sunday & it's snowing then print ture
    
    int isSunday = 1;
    int isSnowing = 1;

    printf("%d \n", isSunday && isSnowing);



    // b. if it's monday or it's raining then print true

    int isMonday = 0;
    int isRaining = 1;

    printf("%d \n", isMonday || isRaining);


    // c. if a number is greater than 9 & less than 100 then print true
    // check that number is two digit or not

    int x;
    printf("ENter the number ; ");
    scanf("%d" , &x);
    printf("%d \n" , x>9 && x<100);

    return 0;
    
    
}