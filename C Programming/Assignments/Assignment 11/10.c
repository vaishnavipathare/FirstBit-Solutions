#include <stdio.h>
#include <string.h>

int main() {
    char string[100];
    int is_palindrome = 1;
    
    printf("Enter a string: ");
    scanf("%s", string);
    
    int len = strlen(string);
    
    for(int i = 0; i < len / 2; i++) {
        if(string[i] != string[len - 1 - i]) {
            is_palindrome = 0;
            break;
        }
    }
    
    if(is_palindrome) {
        printf("The string is a palindrome\n");
    } else {
        printf("The string is not a palindrome\n");
    }
    
    return 0;
}
