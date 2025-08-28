#include <stdio.h>

// 1. Without parameter, without return
void leapYear1() {
    int year = 2024;
    if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        printf("Leap Year\n");
    else
        printf("Not Leap Year\n");
}

// 2. With parameter, without return
void leapYear2(int year) {
    if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        printf("Leap Year\n");
    else
        printf("Not Leap Year\n");
}

// 3. Without parameter, with return
int leapYear3() {
    int year = 2023;
    if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        return 1; 
    else
        return 0; 

// 4. With parameter, with return
int leapYear4(int year) {
    if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        return 1;
    else
        return 0;
}

void main() {
    leapYear1();             
    leapYear2(1900);          

    if(leapYear3() == 1)
        printf("Leap Year\n");
    else
        printf("Not Leap Year\n");

    if(leapYear4(2000) == 1)
        printf("Leap Year\n");
    else
        printf("Not Leap Year\n");
}
