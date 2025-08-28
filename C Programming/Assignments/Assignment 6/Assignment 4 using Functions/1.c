#include <stdio.h>
#include <math.h>

// Without parameter, without return
void armstrong1() {
    int n = 500, num, sum, temp, digit, count;
    for(num = 1; num <= n; num++) {
        temp = num;
        count = 0;
        while(temp > 0) {
            count++;
            temp /= 10;
        }
        temp = num;
        sum = 0;
        while(temp > 0) {
            digit = temp % 10;
            sum += pow(digit, count);
            temp /= 10;
        }
        if(sum == num)
            printf("%d ", num);
    }
    printf("\n");
}

// With parameter, without return
void armstrong2(int n) {
    int num, sum, temp, digit, count;
    for(num = 1; num <= n; num++) {
        temp = num;
        count = 0;
        while(temp > 0) {
            count++;
            temp /= 10;
        }
        temp = num;
        sum = 0;
        while(temp > 0) {
            digit = temp % 10;
            sum += pow(digit, count);
            temp /= 10;
        }
        if(sum == num)
            printf("%d ", num);
    }
    printf("\n");
}

void main() {
    armstrong1();
    armstrong2(1000);
}
