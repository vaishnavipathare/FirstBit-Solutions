#include <stdio.h>

void main() {
    int arr[5] = {10, 20, 30, 40, 50};
    int i;

    printf("Reversed array: ");
    for(i = 4; i >= 0; i--) {
        printf("%d ", arr[i]);
    }
}
