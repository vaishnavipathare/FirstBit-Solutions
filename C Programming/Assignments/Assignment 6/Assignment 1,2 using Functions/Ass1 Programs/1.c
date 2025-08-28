#include <stdio.h>

// 1. Without parameter, without return
void evenOdd1() {
    int n = 10;
    if(n % 2 == 0)
        printf("Even\n");
    else
        printf("Odd\n");
}

// 2. With parameter, without return
void evenOdd2(int n) {
    if(n % 2 == 0)
        printf("Even\n");
    else
        printf("Odd\n");
}

// 3. Without parameter, with return
int evenOdd3() {
    int n = 15;
    if(n % 2 == 0)
        return 1;  
    else
        return 0;  
}

// 4. With parameter, with return
int evenOdd4(int n) {
    if(n % 2 == 0)
        return 1;
    else
        return 0;
}

void main() {
    evenOdd1();
    evenOdd2(7);

    if(evenOdd3() == 1)
        printf("Even\n");
    else
        printf("Odd\n");

    if(evenOdd4(9) == 1)
        printf("Even\n");
    else
        printf("Odd\n");
}
