#include <stdio.h>

// check even or odd
void evenOdd(int n) {
    if(n % 2 == 0) printf("Even\n");
    else printf("Odd\n");
}

// check prime
void isPrime(int n) {
    int i, flag = 1;
    if(n < 2) flag = 0;
    else {
        for(i = 2; i <= n/2; i++) {
            if(n % i == 0) { flag = 0; break; }
        }
    }
    if(flag) printf("Prime\n");
    else printf("Not Prime\n");
}

// palindrome
void palindrome(int n) {
    int rev = 0, temp = n;
    while(temp > 0) {
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }
    if(rev == n) printf("Palindrome\n");
    else printf("Not Palindrome\n");
}

// positive, negative, zero
void signCheck(int n) {
    if(n > 0) printf("Positive\n");
    else if(n < 0) printf("Negative\n");
    else printf("Zero\n");
}

// reverse number
void reverse(int n) {
    int rev = 0;
    while(n > 0) {
        rev = rev * 10 + n % 10;
        n /= 10;
    }
    printf("Reverse = %d\n", rev);
}

// sum of digits
void sumDigits(int n) {
    int sum = 0;
    while(n > 0) {
        sum += n % 10;
        n /= 10;
    }
    printf("Sum of digits = %d\n", sum);
}

// Without parameter, without return
void menu1() {
    int choice, n = 121;
    choice = 3; // hardcoded choice (example: palindrome check)
    switch(choice) {
        case 1: evenOdd(n); break;
        case 2: isPrime(n); break;
        case 3: palindrome(n); break;
        case 4: signCheck(n); break;
        case 5: reverse(n); break;
        case 6: sumDigits(n); break;
        default: printf("Invalid choice\n");
    }
}

// With parameter, without return
void menu2(int choice, int n) {
    switch(choice) {
        case 1: evenOdd(n); break;
        case 2: isPrime(n); break;
        case 3: palindrome(n); break;
        case 4: signCheck(n); break;
        case 5: reverse(n); break;
        case 6: sumDigits(n); break;
        default: printf("Invalid choice\n");
    }
}

void main() {
    menu1();
    menu2(5, 9876);
}
