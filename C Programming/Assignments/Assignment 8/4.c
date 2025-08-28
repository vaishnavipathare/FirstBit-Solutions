#include <stdio.h>

void printOddEven(int arr[], int n) {
    int i;
    printf("Even: ");
    for(i = 0; i < n; i++) {
        if(arr[i] % 2 == 0) printf("%d ", arr[i]);
    }
    printf("\nOdd: ");
    for(i = 0; i < n; i++) {
        if(arr[i] % 2 != 0) printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[6] = {12, 7, 5, 20, 33, 18};
    printOddEven(arr, 6);
    return 0;
}
