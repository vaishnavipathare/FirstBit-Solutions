#include <stdio.h>

// 1. Without parameter, without return
void vote1() {
    int age = 20;
    if(age >= 18)
        printf("Eligible to Vote\n");
    else
        printf("Not Eligible to Vote\n");
}

// 2. With parameter, without return
void vote2(int age) {
    if(age >= 18)
        printf("Eligible to Vote\n");
    else
        printf("Not Eligible to Vote\n");
}

// 3. Without parameter, with return
int vote3() {
    int age = 15;
    if(age >= 18)
        return 1; 
    
    else
        return 0;  
    
}

// 4. With parameter, with return
int vote4(int age) {
    if(age >= 18)
        return 1;
    else
        return 0;
}

void main() {
    vote1();          
    vote2(12);        

    if(vote3() == 1)
        printf("Eligible to Vote\n");
    else
        printf("Not Eligible to Vote\n");

    if(vote4(25) == 1)
        printf("Eligible to Vote\n");
    else
        printf("Not Eligible to Vote\n");
}
