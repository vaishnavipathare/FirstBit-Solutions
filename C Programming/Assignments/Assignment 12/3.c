#include <stdio.h>
#include <stdlib.h>

void main() {
    int n, i, sum = 0;
    int *arr;

    scanf("%d", &n);
    arr = (int*)malloc(n * sizeof(int));

    for(i = 0; i < n; i++) scanf("%d", &arr[i]);

    for(i = 0; i < n; i++) sum += arr[i];

    printf("Sum = %d\n", sum);
    free(arr);
}
