#include <stdio.h>

int main() {
    int n = 5;
    int i, j;
    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            if(i == 0 || i == n-1 || j == 0 || j == n-1 || i == j || j == n-1-i)
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }
    return 0;
}
