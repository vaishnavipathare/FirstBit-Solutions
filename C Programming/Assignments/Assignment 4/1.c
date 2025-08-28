#include <stdio.h>
int main() {
    int n = 500, i, num, digit, sum, temp;
    for(i = 1; i <= n; i++) {
        num = i;
        sum = 0;
        temp = num;
        while(num > 0) {
            digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        if(sum == temp) {
            printf("%d ", temp);
        }
    }
}
