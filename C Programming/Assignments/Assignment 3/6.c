#include <stdio.h>
int main() {
    int n = 28, sum = 0, i;
    for(i = 1; i < n; i++) {
        if(n % i == 0) {
            sum = sum + i;
        }
    }
    if(sum == n) {
        printf("Perfect\n");
    } else {
        printf("Not Perfect\n");
    }
}
