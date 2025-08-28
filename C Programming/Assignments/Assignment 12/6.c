#include <stdio.h>
#include <stdlib.h>

void main() {
    int n, i, j, isPrime, *arr;
    scanf("%d", &n);
    arr = (int*)malloc(n * sizeof(int));

    for(i = 0; i < n; i++) scanf("%d", &arr[i]);

    printf("Primes: ");
    for(i = 0; i < n; i++) {
        if(arr[i] < 2) continue;
        isPrime = 1;
        for(j = 2; j <= arr[i]/2; j++) {
            if(arr[i] % j == 0) { isPrime = 0; break; }
        }
        if(isPrime) printf("%d ", arr[i]);
    }
    free(arr);
}
