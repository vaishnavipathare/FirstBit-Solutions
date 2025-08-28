#include <stdio.h>
int main() {
    int choice, num = 121, i, rev, sum, digit, count;

    printf("1. Even or Odd\n");
    printf("2. Prime or Not\n");
    printf("3. Palindrome or Not\n");
    printf("4. Positive, Negative or Zero\n");
    printf("5. Reverse a Number\n");
    printf("6. Sum of Digits\n");

    choice = 3;  // hardcoded choice, change to test

    if(choice == 1) {
        if(num % 2 == 0) {
            printf("Even\n");
        } else {
            printf("Odd\n");
        }
    }
    else if(choice == 2) {
        count = 0;
        for(i = 1; i <= num; i++) {
            if(num % i == 0) count++;
        }
        if(count == 2) {
            printf("Prime\n");
        } else {
            printf("Not Prime\n");
        }
    }
    else if(choice == 3) {
        rev = 0;
        int temp = num;
        while(num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(temp == rev) {
            printf("Palindrome\n");
        } else {
            printf("Not Palindrome\n");
        }
    }
    else if(choice == 4) {
        if(num > 0) {
            printf("Positive\n");
        } else if(num < 0) {
            printf("Negative\n");
        } else {
            printf("Zero\n");
        }
    }
    else if(choice == 5) {
        rev = 0;
        int temp = num;
        while(num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        printf("Reverse = %d\n", rev);
    }
    else if(choice == 6) {
        sum = 0;
        int temp = num;
        while(num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        printf("Sum of Digits = %d\n", sum);
    }
    else {
        printf("Invalid Choice\n");
    }
}
