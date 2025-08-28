#include <stdio.h>

void printPrimes(int arr[], int n) {
    int i, j, isPrime;
    printf("Primes: ");
    for(i = 0; i < n; i++) {
        if(arr[i] < 2) continue;
        isPrime = 1;
        for(j = 2; j <= arr[i]/2; j++) {
            if(arr[i] % j == 0) {
                isPrime = 0;
                break;
            }
        }
        if(isPrime == 1)
            printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[6] = {3, 4, 5, 8, 11, 15};
    printPrimes(arr, 6);
    return 0;
}
