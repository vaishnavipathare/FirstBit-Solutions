#include <stdio.h>

void main() {
    int arr[3] = {1, 2, 3};
    int brr[3] = {4, 5, 6};
    int crr[6];
    int i, j;

    for(i = 0; i < 3; i++) {
        crr[i] = arr[i];
    }
    for(j = 0; j < 3; j++) {
        crr[i+j] = brr[j];
    }

    printf("Merged array: ");
    for(i = 0; i < 6; i++) {
        printf("%d ", crr[i]);
    }
}
