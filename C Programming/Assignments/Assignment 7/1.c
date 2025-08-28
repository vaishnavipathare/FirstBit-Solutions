#include <stdio.h>

void main() {
    int arr[5] = {10, 25, 3, 42, 18};
    int i, min, max;

    min = arr[0];
    max = arr[0];

    for(i = 1; i < 5; i++) {
        if(arr[i] < min)
            min = arr[i];
        if(arr[i] > max)
            max = arr[i];
    }

    printf("Minimum = %d\n", min);
    printf("Maximum = %d\n", max);
}
