#include <stdio.h>

int main() {
    int n = 5;
    int i, j, space;
    for(i = n; i >= 1; i--) {
        for(space = 0; space < n - i; space++) {
            printf(" ");
        }
        for(j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}
