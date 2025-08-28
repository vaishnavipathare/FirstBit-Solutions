#include <stdio.h>
int main() {
    int num = 121, rev = 0, temp, digit;
    temp = num;
    digit = num % 10;
    rev = rev * 10 + digit;
    num = num / 10;

    digit = num % 10;
    rev = rev * 10 + digit;
    num = num / 10;

    digit = num % 10;
    rev = rev * 10 + digit;

    if(temp == rev) {
        printf("%d is Palindrome\n", temp);
    } else {
        printf("%d is Not Palindrome\n", temp);
    }
}
