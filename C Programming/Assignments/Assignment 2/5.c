#include <stdio.h>
int main() {
    float price = 650, discount = 0, final;
    char student = 'y';   // y = yes, n = no

    if(student == 'y') {
        if(price > 500) {
            discount = price * 0.20;
        } else {
            discount = price * 0.10;
        }
    } else {
        if(price > 600) {
            discount = price * 0.15;
        } else {
            discount = 0;
        }
    }
    final = price - discount;
    printf("Price = %.2f\nDiscount = %.2f\nFinal Price = %.2f\n", price, discount, final);
}
