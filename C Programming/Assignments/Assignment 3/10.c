#include <stdio.h>
int main() {
    int n = 12345, last, first;
    last = n % 10;
    while(n >= 10) {
        n = n / 10;
    }
    first = n;
    printf("Sum of First and Last Digit = %d\n", first + last);
}
