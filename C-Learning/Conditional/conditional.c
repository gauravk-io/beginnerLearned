# include<stdio.h>

int main(){


    // If Else statement


    int age;
    printf("Enter Age : ");
    scanf("%d", &age);

    if(age>=18){
        printf("Adult \n");
        printf("You can vote \n");
        printf("You ca drive \n");
    }
    else{
        printf("Wait to turn 18");
    }



    // else-if statement

    

    int age1;
    printf("Enter Age : ");
    scanf("%d", &age1);

    if(age1>=18){
        printf("Adult \n");
        printf("You can vote \n");
        printf("You ca drive \n");
    }

    else if(age1>13 && age1<18){
        printf("You are a teenage \n");
    }
    else{
        printf("Wait to turn 18");
    }



    return 0;
}