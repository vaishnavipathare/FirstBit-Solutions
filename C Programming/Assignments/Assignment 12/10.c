#include <stdio.h>
#include <stdlib.h>

void main() {
    int n, i, j, temp, *arr;
    scanf("%d", &n);
    arr = (int*)malloc(n * sizeof(int));

    for(i = 0; i < n; i++) scanf("%d", &arr[i]);

    for(i = 0; i < n; i++) {
        for(j = i+1; j < n; j++) {
            if(arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for(i = 0; i < n; i++) printf("%d ", arr[i]);

    free(arr);
}
