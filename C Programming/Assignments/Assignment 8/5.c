#include <stdio.h>

void printAlternate(int arr[], int n) {
    int i;
    printf("Alternate elements: ");
    for(i = 0; i < n; i += 2) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[6] = {10, 20, 30, 40, 50, 60};
    printAlternate(arr, 6);
    return 0;
}
