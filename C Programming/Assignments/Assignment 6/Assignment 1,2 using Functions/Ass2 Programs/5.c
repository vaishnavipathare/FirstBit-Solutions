#include <stdio.h>

// 1. Without parameter, without return
void discount1() {
    char student = 'y';
    int price = 550;
    float final;
    if(student == 'y') {
        if(price > 500)
            final = price - (price * 0.20);
        else
            final = price - (price * 0.10);
    } else {
        if(price > 600)
            final = price - (price * 0.15);
        else
            final = price;
    }
    printf("Final Price = %.2f\n", final);
}

// 2. With parameter, without return
void discount2(char student, int price) {
    float final;
    if(student == 'y') {
        if(price > 500)
            final = price - (price * 0.20);
        else
            final = price - (price * 0.10);
    } else {
        if(price > 600)
            final = price - (price * 0.15);
        else
            final = price;
    }
    printf("Final Price = %.2f\n", final);
}

// 3. Without parameter, with return
float discount3() {
    char student = 'n';
    int price = 650;
    if(student == 'y') {
        if(price > 500)
            return price - (price * 0.20);
        else
            return price - (price * 0.10);
    } else {
        if(price > 600)
            return price - (price * 0.15);
        else
            return price;
    }
}

// 4. With parameter, with return
float discount4(char student, int price) {
    if(student == 'y') {
        if(price > 500)
            return price - (price * 0.20);
        else
            return price - (price * 0.10);
    } else {
        if(price > 600)
            return price - (price * 0.15);
        else
            return price;
    }
}

void main() {
    discount1();
    discount2('y', 400);

    float d1 = discount3();
    printf("Final Price = %.2f\n", d1);

    float d2 = discount4('n', 700);
    printf("Final Price = %.2f\n", d2);
}
