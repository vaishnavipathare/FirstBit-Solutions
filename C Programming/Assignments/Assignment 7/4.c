#include <stdio.h>

void main() {
    int arr[6] = {12, 7, 5, 20, 33, 18};
    int i;

    printf("Even numbers: ");
    for(i = 0; i < 6; i++) {
        if(arr[i] % 2 == 0)
            printf("%d ", arr[i]);
    }

    printf("\nOdd numbers: ");
    for(i = 0; i < 6; i++) {
        if(arr[i] % 2 != 0)
            printf("%d ", arr[i]);
    }
}
