# include<stdio.h>

int main(){


    // Program to calculate the area of the square

    float side;
    printf("enter side length : ");
    scanf("%f" , &side);

    printf("area is : %f\n" , side * side);



    // program to calculate area of the rectangle

    
    float side1;
    printf("enter length : ");
    scanf("%f" , &side1);

    float side2;
    printf("enter width : ");
    scanf("%f" , &side2);

    printf("area is : %f\n" , side1 * side2);

    


     // Program to calculate the area of circle

     float radius;
     printf("Enter the radius : ");
     scanf("%f" , &radius);

     printf("Area is : %f\n" , 3.14*radius*radius);



    
    return 0;
}