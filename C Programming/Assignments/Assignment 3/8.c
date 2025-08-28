#include <stdio.h>
int main() {
    int n = 145, temp, digit, fact, i, sum = 0;
    temp = n;
    while(n > 0) {
        digit = n % 10;
        fact = 1;
        for(i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        sum = sum + fact;
        n = n / 10;
    }
    if(sum == temp) {
        printf("Strong\n");
    } else {
        printf("Not Strong\n");
    }
}
