#include <stdio.h>
int main() {
    int n = 1000, i, j, sum;
    for(i = 1; i <= n; i++) {
        sum = 0;
        for(j = 1; j < i; j++) {
            if(i % j == 0) {
                sum = sum + j;
            }
        }
        if(sum == i) {
            printf("%d ", i);
        }
    }
}
