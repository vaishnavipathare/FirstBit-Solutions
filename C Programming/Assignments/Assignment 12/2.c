#include <stdio.h>
#include <stdlib.h>

void main() {
    int n, i, num, found = 0;
    int *arr;

    printf("Enter size: ");
    scanf("%d", &n);

    arr = (int*)malloc(n * sizeof(int));

    printf("Enter %d elements: ", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter number to search: ");
    scanf("%d", &num);

    for(i = 0; i < n; i++) {
        if(arr[i] == num) {
            printf("Found at index %d\n", i);
            found = 1;
            break;
        }
    }
    if(!found) printf("Not found\n");

    free(arr);
}
