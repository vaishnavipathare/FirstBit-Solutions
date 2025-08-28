#include <stdio.h>
int main() {
    int n = 7, i, count = 0;
    for(i = 1; i <= n; i++) {
        if(n % i == 0) {
            count++;
        }
    }
    if(count == 2) {
        printf("Prime\n");
    } else {
        printf("Not Prime\n");
    }
}
