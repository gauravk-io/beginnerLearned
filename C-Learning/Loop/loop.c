# include<stdio.h>

int main(){


    // Loop control statement

                // FOR LOOP

            // Question  -- Print number from 0 to 10.

    for(int i=0; i<=10; i=i+1){  //(itialisation; condition; updation)
        printf("%d \n" ,i);

    }



                // WHILE LOOP

            // Question  -- Print number from 0 to n . if n is given by user.
    
    int i=1; // itialisation;
    while (i<=5)  // (condition)
    {
        printf("Hello Boys \n");
        i++;  // updation;
    }
    



                // DO WHILE LOOP
    
            // Question -- Print Natural number 

    int p=1;      //itialisation;
    do{
        printf("%d \n" , p);
        p++;           //updation;
    } while (p<=5);     // condition;
    





                // CONTINUE STATEMENT

            // Question - print n natural numbers except 3
    

    for (int i = 1; i <= 5; i++)
    {
        if(i == 3){
            continue;
        }
        printf("%d\n", i);
    }
    
    

    

    return 0;
}