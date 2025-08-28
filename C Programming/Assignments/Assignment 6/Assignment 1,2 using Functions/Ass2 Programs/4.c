#include <stdio.h>

// 1. Without parameter, without return
void result1() {
    int marks = 72;
    if(marks > 75)
        printf("Distinction\n");
    else if(marks > 65)
        printf("First Class\n");
    else if(marks > 55)
        printf("Second Class\n");
    else if(marks >= 40)
        printf("Pass Class\n");
    else
        printf("Fail\n");
}

// 2. With parameter, without return
void result2(int marks) {
    if(marks > 75)
        printf("Distinction\n");
    else if(marks > 65)
        printf("First Class\n");
    else if(marks > 55)
        printf("Second Class\n");
    else if(marks >= 40)
        printf("Pass Class\n");
    else
        printf("Fail\n");
}

// 3. Without parameter, with return
int result3() {
    int marks = 35;
    if(marks > 75)
        return 1;
    else if(marks > 65)
        return 2;
    else if(marks > 55)
        return 3;
    else if(marks >= 40)
        return 4;
    else
        return 5;
}

// 4. With parameter, with return
int result4(int marks) {
    if(marks > 75)
        return 1;
    else if(marks > 65)
        return 2;
    else if(marks > 55)
        return 3;
    else if(marks >= 40)
        return 4;
    else
        return 5;
}

void main() {
    result1();
    result2(88);

    int r1 = result3();
    if(r1==1) printf("Distinction\n");
    else if(r1==2) printf("First Class\n");
    else if(r1==3) printf("Second Class\n");
    else if(r1==4) printf("Pass Class\n");
    else printf("Fail\n");

    int r2 = result4(59);
    if(r2==1) printf("Distinction\n");
    else if(r2==2) printf("First Class\n");
    else if(r2==3) printf("Second Class\n");
    else if(r2==4) printf("Pass Class\n");
    else printf("Fail\n");
}
