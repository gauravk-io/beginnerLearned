#include<stdio.h>

void NAMASTE();
void BONJOUR();

int main(){

    
       // Question - Write a function that prints NAMASTE if user is Indian & BONJOUR if user in French.


    printf("Enter F for French And I gor Indian : ");
    char ch;
    scanf("%c" , &ch);

    if (ch == 'I'){
        NAMASTE();
    } else if(ch =='F') {
        BONJOUR();
    } else{
        printf("Enter right keyword\n");
    }
     
}


void NAMASTE() {
    printf("NAMASTE / PRANAM \n");
}
void BONJOUR(){
    printf("BONJOUR\n");

}
