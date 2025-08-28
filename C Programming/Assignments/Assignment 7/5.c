#include <stdio.h>

void main() {
    int arr[6] = {10, 20, 30, 40, 50, 60};
    int i;

    printf("Alternate elements: ");
    for(i = 0; i < 6; i += 2) {
        printf("%d ", arr[i]);
    }
}
