#include <stdio.h>

// 1. Without parameter, without return
void ageGroup1() {
    int age = 15;
    if(age < 12)
        printf("Child\n");
    else if(age >= 12 && age <= 19)
        printf("Teenager\n");
    else if(age >= 20 && age <= 59)
        printf("Adult\n");
    else
        printf("Senior\n");
}

// 2. With parameter, without return
void ageGroup2(int age) {
    if(age < 12)
        printf("Child\n");
    else if(age >= 12 && age <= 19)
        printf("Teenager\n");
    else if(age >= 20 && age <= 59)
        printf("Adult\n");
    else
        printf("Senior\n");
}

// 3. Without parameter, with return
int ageGroup3() {
    int age = 65;
    if(age < 12)
        return 1;
    else if(age >= 12 && age <= 19)
        return 2;
    else if(age >= 20 && age <= 59)
        return 3;
    else
        return 4;
}

// 4. With parameter, with return
int ageGroup4(int age) {
    if(age < 12)
        return 1;
    else if(age >= 12 && age <= 19)
        return 2;
    else if(age >= 20 && age <= 59)
        return 3;
    else
        return 4;
}

void main() {
    ageGroup1();
    ageGroup2(8);

    int r1 = ageGroup3();
    if(r1==1) printf("Child\n");
    else if(r1==2) printf("Teenager\n");
    else if(r1==3) printf("Adult\n");
    else printf("Senior\n");

    int r2 = ageGroup4(25);
    if(r2==1) printf("Child\n");
    else if(r2==2) printf("Teenager\n");
    else if(r2==3) printf("Adult\n");
    else printf("Senior\n");
}
