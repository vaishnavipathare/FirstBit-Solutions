#include <stdio.h>

// Without parameter, without return
void primeRange1() {
    int n = 50, num, i, flag;
    for(num = 2; num <= n; num++) {
        flag = 1;
        for(i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                flag = 0;
                break;
            }
        }
        if(flag == 1)
            printf("%d ", num);
    }
    printf("\n");
}

// With parameter, without return
void primeRange2(int n) {
    int num, i, flag;
    for(num = 2; num <= n; num++) {
        flag = 1;
        for(i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                flag = 0;
                break;
            }
        }
        if(flag == 1)
            printf("%d ", num);
    }
    printf("\n");
}

void main() {
    primeRange1();
    primeRange2(100);
}
