#include <stdio.h>

void main() {
    int arr[5] = {1, 2, 3, 4, 5};
    int brr[5] = {10, 20, 30, 40, 50};
    int crr[5];
    int i;

    for(i = 0; i < 5; i++) {
        crr[i] = arr[i] + brr[i];
    }

    printf("Result array: ");
    for(i = 0; i < 5; i++) {
        printf("%d ", crr[i]);
    }
}
