#include <stdio.h>
int main() {
    int n = 153, sum = 0, temp, digit;
    temp = n;
    while(n > 0) {
        digit = n % 10;
        sum = sum + (digit * digit * digit);
        n = n / 10;
    }
    if(temp == sum) {
        printf("Armstrong\n");
    } else {
        printf("Not Armstrong\n");
    }
}
