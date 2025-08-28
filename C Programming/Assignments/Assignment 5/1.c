#include <stdio.h>

int main() {
    int n = 4;
    int i, j;
    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}
