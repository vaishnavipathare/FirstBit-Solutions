#include <stdio.h>

// Without parameter, without return
void perfectRange1() {
    int n = 1000, num, i, sum;
    for(num = 1; num <= n; num++) {
        sum = 0;
        for(i = 1; i < num; i++) {
            if(num % i == 0)
                sum += i;
        }
        if(sum == num)
            printf("%d ", num);
    }
    printf("\n");
}

// With parameter, without return
void perfectRange2(int n) {
    int num, i, sum;
    for(num = 1; num <= n; num++) {
        sum = 0;
        for(i = 1; i < num; i++) {
            if(num % i == 0)
                sum += i;
        }
        if(sum == num)
            printf("%d ", num);
    }
    printf("\n");
}

void main() {
    perfectRange1();
    perfectRange2(5000);
}
