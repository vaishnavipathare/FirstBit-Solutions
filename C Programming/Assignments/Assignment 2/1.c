#include <stdio.h>
int main() {
    int a = 20, b = 5;
    char op = '*';
    
    if(op == '+') {
        printf("Result = %d\n", a + b);
    } else if(op == '-') {
        printf("Result = %d\n", a - b);
    } else if(op == '*') {
        printf("Result = %d\n", a * b);
    } else if(op == '/') {
        printf("Result = %d\n", a / b);
    } else if(op == '%') {
        printf("Result = %d\n", a % b);
    } else {
        printf("Invalid Operator\n");
    }
}
