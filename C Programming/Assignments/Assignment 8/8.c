#include <stdio.h>

void mergeArrays(int arr[], int n, int brr[], int m, int crr[]) {
    int i;
    for(i = 0; i < n; i++) {
        crr[i] = arr[i];
    }
    for(i = 0; i < m; i++) {
        crr[n+i] = brr[i];
    }

    printf("Merged array: ");
    for(i = 0; i < n+m; i++) {
        printf("%d ", crr[i]);
    }
    printf("\n");
}

int main() {
    int arr[3] = {1,2,3};
    int brr[3] = {4,5,6};
    int crr[6];
    mergeArrays(arr, 3, brr, 3, crr);
    return 0;
}
