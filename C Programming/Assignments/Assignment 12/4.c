#include <stdio.h>
#include <stdlib.h>

void main() {
    int n, i, *arr;
    scanf("%d", &n);
    arr = (int*)malloc(n * sizeof(int));

    for(i = 0; i < n; i++) scanf("%d", &arr[i]);

    printf("Even: ");
    for(i = 0; i < n; i++) if(arr[i] % 2 == 0) printf("%d ", arr[i]);

    printf("\nOdd: ");
    for(i = 0; i < n; i++) if(arr[i] % 2 != 0) printf("%d ", arr[i]);

    free(arr);
}
