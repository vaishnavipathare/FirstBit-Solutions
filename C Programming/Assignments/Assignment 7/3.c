#include <stdio.h>

void main() {
    int arr[5] = {1, 2, 3, 4, 5};
    int i, sum = 0;

    for(i = 0; i < 5; i++) {
        sum += arr[i];
    }

    printf("Sum = %d\n", sum);
}
