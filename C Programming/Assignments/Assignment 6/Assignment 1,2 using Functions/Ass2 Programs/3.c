#include <stdio.h>

// 1. Without parameter, without return
void greatest1() {
    int a = 10, b = 25, c = 15;
    if(a > b) {
        if(a > c)
            printf("Greatest = %d\n", a);
        else
            printf("Greatest = %d\n", c);
    } else {
        if(b > c)
            printf("Greatest = %d\n", b);
        else
            printf("Greatest = %d\n", c);
    }
}

// 2. With parameter, without return
void greatest2(int a, int b, int c) {
    if(a > b) {
        if(a > c)
            printf("Greatest = %d\n", a);
        else
            printf("Greatest = %d\n", c);
    } else {
        if(b > c)
            printf("Greatest = %d\n", b);
        else
            printf("Greatest = %d\n", c);
    }
}

// 3. Without parameter, with return
int greatest3() {
    int a = 12, b = 9, c = 15;
    if(a > b) {
        if(a > c)
            return a;
        else
            return c;
    } else {
        if(b > c)
            return b;
        else
            return c;
    }
}

// 4. With parameter, with return
int greatest4(int a, int b, int c) {
    if(a > b) {
        if(a > c)
            return a;
        else
            return c;
    } else {
        if(b > c)
            return b;
        else
            return c;
    }
}

void main() {
    greatest1();
    greatest2(40, 70, 55);

    int g1 = greatest3();
    printf("Greatest = %d\n", g1);

    int g2 = greatest4(20, 90, 65);
    printf("Greatest = %d\n", g2);
}
