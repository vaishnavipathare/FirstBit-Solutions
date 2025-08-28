#include <stdio.h>

// 1. Without parameter, without return
void palindrome1() {
    int n = 121, rev = 0, temp, digit;
    temp = n;
    while(n > 0) {
        digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
    }
    if(temp == rev)
        printf("Palindrome\n");
    else
        printf("Not Palindrome\n");
}

// 2. With parameter, without return
void palindrome2(int n) {
    int rev = 0, temp, digit;
    temp = n;
    while(n > 0) {
        digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
    }
    if(temp == rev)
        printf("Palindrome\n");
    else
        printf("Not Palindrome\n");
}

// 3. Without parameter, with return
int palindrome3() {
    int n = 131, rev = 0, temp, digit;
    temp = n;
    while(n > 0) {
        digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
    }
    if(temp == rev)
        return 1;
    else
        return 0;
}

// 4. With parameter, with return
int palindrome4(int n) {
    int rev = 0, temp, digit;
    temp = n;
    while(n > 0) {
        digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
    }
    if(temp == rev)
        return 1;
    else
        return 0;
}

void main() {
    palindrome1();
    palindrome2(123);

    if(palindrome3() == 1)
        printf("Palindrome\n");
    else
        printf("Not Palindrome\n");

    if(palindrome4(141) == 1)
        printf("Palindrome\n");
    else
        printf("Not Palindrome\n");
}
