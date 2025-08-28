#include <stdio.h>

// 1. Without parameter, without return
void divisible1() {
    int n = 15;
    if(n % 3 == 0 && n % 5 == 0)
        printf("Divisible by both\n");
    else if(n % 3 == 0)
        printf("Divisible by 3 but not by 5\n");
    else if(n % 5 == 0)
        printf("Divisible by 5 but not by 3\n");
    else
        printf("Divisible by None\n");
}

// 2. With parameter, without return
void divisible2(int n) {
    if(n % 3 == 0 && n % 5 == 0)
        printf("Divisible by both\n");
    else if(n % 3 == 0)
        printf("Divisible by 3 but not by 5\n");
    else if(n % 5 == 0)
        printf("Divisible by 5 but not by 3\n");
    else
        printf("Divisible by None\n");
}

// 3. Without parameter, with return
int divisible3() {
    int n = 7;
    if(n % 3 == 0 && n % 5 == 0)
        return 1;
    else if(n % 3 == 0)
        return 2;
    else if(n % 5 == 0)
        return 3;
    else
        return 4;
}

// 4. With parameter, with return
int divisible4(int n) {
    if(n % 3 == 0 && n % 5 == 0)
        return 1;
    else if(n % 3 == 0)
        return 2;
    else if(n % 5 == 0)
        return 3;
    else
        return 4;
}

void main() {
    divisible1();
    divisible2(9);

    int r1 = divisible3();
    if(r1==1) printf("Divisible by both\n");
    else if(r1==2) printf("Divisible by 3 but not by 5\n");
    else if(r1==3) printf("Divisible by 5 but not by 3\n");
    else printf("Divisible by None\n");

    int r2 = divisible4(10);
    if(r2==1) printf("Divisible by both\n");
    else if(r2==2) printf("Divisible by 3 but not by 5\n");
    else if(r2==3) printf("Divisible by 5 but not by 3\n");
    else printf("Divisible by None\n");
}
