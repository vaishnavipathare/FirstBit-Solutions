#include <stdio.h>
#include <stdlib.h>

void main() {
    int n, i, min, max;
    int *arr;

    printf("Enter size: ");
    scanf("%d", &n);

    arr = (int*)malloc(n * sizeof(int));

    printf("Enter %d elements: ", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    min = max = arr[0];
    for(i = 1; i < n; i++) {
        if(arr[i] < min) min = arr[i];
        if(arr[i] > max) max = arr[i];
    }

    printf("Min = %d, Max = %d\n", min, max);
    free(arr);
}
