#include <stdio.h>

void sortArray(int arr[], int n) {
    int i, j, temp;
    for(i = 0; i < n; i++) {
        for(j = i+1; j < n; j++) {
            if(arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    printf("Sorted: ");
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[5] = {30,10,50,20,40};
    sortArray(arr, 5);
    return 0;
}
