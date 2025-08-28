#include <stdio.h>

void searchNumber(int arr[], int n, int num) {
    int i, found = 0;
    for(i = 0; i < n; i++) {
        if(arr[i] == num) {
            printf("Number %d found at position %d\n", num, i);
            found = 1;
            break;
        }
    }
    if(found == 0)
        printf("Number %d not found\n", num);
}

int main() {
    int arr[5] = {10, 20, 30, 40, 50};
    searchNumber(arr, 5, 30);
    return 0;
}
