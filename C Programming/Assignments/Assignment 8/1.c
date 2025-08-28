#include <stdio.h>

void findMinMax(int arr[], int n) {
    int i, min, max;
    min = max = arr[0];
    for(i = 1; i < n; i++) {
        if(arr[i] < min) min = arr[i];
        if(arr[i] > max) max = arr[i];
    }
    printf("Min = %d, Max = %d\n", min, max);
}

int main() {
    int arr[5] = {10, 25, 3, 42, 18};
    findMinMax(arr, 5);
    return 0;
}
