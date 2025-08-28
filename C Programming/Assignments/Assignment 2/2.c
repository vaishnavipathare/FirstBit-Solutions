#include <stdio.h>
int main() {
    int a = 5, b = 5, c = 5;

    if(a == b && b == c) {
        printf("Equilateral Triangle\n");
    } else if(a == b || b == c || a == c) {
        printf("Isosceles Triangle\n");
    } else {
        printf("Scalene Triangle\n");
    }
}
