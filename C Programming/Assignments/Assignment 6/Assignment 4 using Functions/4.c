#include <stdio.h>

// helper factorial
int fact(int x) {
    int f = 1, i;
    for(i = 1; i <= x; i++) f *= i;
    return f;
}

// Without parameter, without return
void strongRange1() {
    int n = 1000, num, temp, digit, sum;
    for(num = 1; num <= n; num++) {
        temp = num;
        sum = 0;
        while(temp > 0) {
            digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }
        if(sum == num)
            printf("%d ", num);
    }
    printf("\n");
}

// With parameter, without return
void strongRange2(int n) {
    int num, temp, digit, sum;
    for(num = 1; num <= n; num++) {
        temp = num;
        sum = 0;
        while(temp > 0) {
            digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }
        if(sum == num)
            printf("%d ", num);
    }
    printf("\n");
}

void main() {
    strongRange1();
    strongRange2(2000);
}
