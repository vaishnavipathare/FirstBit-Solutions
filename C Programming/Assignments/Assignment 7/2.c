#include <stdio.h>

void main() {
    int arr[5] = {10, 20, 30, 40, 50};
    int num = 30, i, found = 0;

    for(i = 0; i < 5; i++) {
        if(arr[i] == num) {
            printf("Number %d found at position %d\n", num, i);
            found = 1;
            break;
        }
    }

    if(found == 0)
        printf("Number %d not found\n", num);
}
