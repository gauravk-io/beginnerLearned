# include<stdio.h>

int main(){


    /* Write a program to check if a student passes or failed
       marks >30 is pass
       marks <= 30 is fail
    */


   int marks;
   printf("Enter the marks (0-100) : ");
   scanf("%d" , &marks);

   if(marks >=0 && marks <=30){
    printf("Fail \n");
   } else if(marks >30 && marks <=100){
    printf("Pass \n");
   } else{
    printf("Sabasss 👏👏👏👏, aapke charan kaha hai gyani baba?");
   }

   return 0;
}