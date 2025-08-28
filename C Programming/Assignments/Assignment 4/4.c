#include <stdio.h>
int main() {
    int n = 500, i, j, num, digit, fact, sum;
    for(i = 1; i <= n; i++) {
        num = i;
        sum = 0;
        while(num > 0) {
            digit = num % 10;
            fact = 1;
            for(j = 1; j <= digit; j++) {
                fact = fact * j;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if(sum == i) {
            printf("%d ", i);
        }
    }
}
