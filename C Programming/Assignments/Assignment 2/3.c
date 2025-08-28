#include <stdio.h>
int main() {
    int x = 12, y = 25, z = 18;

    if(x > y) {
        if(x > z) {
            printf("Greatest = %d\n", x);
        } else {
            printf("Greatest = %d\n", z);
        }
    } else {
        if(y > z) {
            printf("Greatest = %d\n", y);
        } else {
            printf("Greatest = %d\n", z);
        }
    }
}
