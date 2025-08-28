#include <stdio.h>
int main() {
    int n = 5, fact = 1, i;
    for(i = 1; i <= n; i++) {
        fact = fact * i;
    }
    printf("Factorial = %d\n", fact);
}
