#include<stdio.h>

        // QUESTION - Write a function to convert celcius to fahrenheit.

float convertTemp(float celsius);

int main(){
    float far = convertTemp(0);
    printf("far : %.2f" , far);  
    return 0;
}

float convertTemp(float celsius){
    float far = celsius*(9/5)+32;
    return far;
}