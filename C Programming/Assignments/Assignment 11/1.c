#include <stdio.h>
#include <string.h>

int main() {
    char string[100];
    char ch;
    int found = 0;
    
    printf("Enter a string: ");
    scanf("%s", string);
    
    printf("Enter a character to search: ");
    scanf(" %c", &ch);
    
    for(int i = 0; string[i] != '\0'; i++) {
        if(string[i] == ch) {
            found = 1;
            break;
        }
    }
    
    if(found) {
        printf("Character '%c' found in the string\n", ch);
    } else {
        printf("Character '%c' not found in the string\n", ch);
    }
    
    return 0;
}
