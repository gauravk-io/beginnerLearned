# include<stdio.h>

int main(){
     int age;
     printf("Enter the age : ");
     scanf("%d" , &age);

     age>=18 ? printf("Adult \n") : printf("Not Adult \n");

     return 0;
}