#include <stdio.h>

void reverseArray(int arr[], int n) {
    int i;
    printf("Reversed: ");
    for(i = n-1; i >= 0; i--) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[5] = {10,20,30,40,50};
    reverseArray(arr, 5);
    return 0;
}
