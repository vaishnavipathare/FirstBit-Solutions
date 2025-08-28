#include <stdio.h>

void main() {
    int arr[6] = {3, 4, 5, 8, 11, 15};
    int i, j, isPrime;

    printf("Prime numbers: ");
    for(i = 0; i < 6; i++) {
        if(arr[i] < 2)
            continue;
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
}
