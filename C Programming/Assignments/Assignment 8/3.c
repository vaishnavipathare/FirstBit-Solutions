#include <stdio.h>

void findSum(int arr[], int n) {
    int i, sum = 0;
    for(i = 0; i < n; i++) {
        sum += arr[i];
    }
    printf("Sum = %d\n", sum);
}

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    findSum(arr, 5);
    return 0;
}
