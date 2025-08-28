#include <stdio.h>
#include <string.h>

int main() {
    char string[100];
    char symbol;
    
    printf("Enter a string: ");
    scanf(" %[^\n]s", string);
    
    printf("Enter the special symbol to replace spaces: ");
    scanf(" %c", &symbol);
    
    for(int i = 0; string[i] != '\0'; i++) {
        if(string[i] == ' ') {
            string[i] = symbol;
        }
    }
    
    printf("String after replacing spaces: %s\n", string);
    
    return 0;
}
