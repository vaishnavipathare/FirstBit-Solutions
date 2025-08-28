#include <stdio.h>
int main() {
    int n = 121, rev = 0, digit, temp;
    temp = n;
    while(n > 0) {
        digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
    }
    if(temp == rev) {
        printf("Palindrome\n");
    } else {
        printf("Not Palindrome\n");
    }
}
