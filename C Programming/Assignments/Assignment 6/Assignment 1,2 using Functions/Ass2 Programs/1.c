#include <stdio.h>

// 1. Without parameter, without return
void calc1() {
    int a = 10, b = 5;
    char op = '+';
    switch(op) {
        case '+': printf("Sum = %d\n", a+b); break;
        case '-': printf("Difference = %d\n", a-b); break;
        case '*': printf("Product = %d\n", a*b); break;
        case '/': printf("Quotient = %d\n", a/b); break;
        case '%': printf("Remainder = %d\n", a%b); break;
        default: printf("Invalid Operator\n");
    }
}

// 2. With parameter, without return
void calc2(int a, int b, char op) {
    switch(op) {
        case '+': printf("Sum = %d\n", a+b); break;
        case '-': printf("Difference = %d\n", a-b); break;
        case '*': printf("Product = %d\n", a*b); break;
        case '/': printf("Quotient = %d\n", a/b); break;
        case '%': printf("Remainder = %d\n", a%b); break;
        default: printf("Invalid Operator\n");
    }
}

// 3. Without parameter, with return
int calc3() {
    int a = 8, b = 3;
    char op = '*';
    switch(op) {
        case '+': return a+b;
        case '-': return a-b;
        case '*': return a*b;
        case '/': return a/b;
        case '%': return a%b;
        default: return -1;
    }
}

// 4. With parameter, with return
int calc4(int a, int b, char op) {
    switch(op) {
        case '+': return a+b;
        case '-': return a-b;
        case '*': return a*b;
        case '/': return a/b;
        case '%': return a%b;
        default: return -1;
    }
}

void main() {
    calc1();                
    calc2(20, 4, '-');       

    int res1 = calc3();      
    printf("Result = %d\n", res1);

    int res2 = calc4(15, 6, '%');
    printf("Result = %d\n", res2);
}
