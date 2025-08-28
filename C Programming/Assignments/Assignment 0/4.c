#include <stdio.h>
int main() {
    int x = 5, y = 10, temp;
    temp = x;
    x = y;
    y = temp;
    printf("After swapping: x = %d, y = %d\n", x, y);
}
