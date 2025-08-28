#include <stdio.h>
#include <string.h>

int main() {
    char string[100];
    int count = 0;
    
    printf("Enter a string: ");
    scanf(" %[^\n]s", string);
    
    for(int i = 0; string[i] != '\0'; i++) {
        if(string[i] == ' ' && string[i+1] != ' ' && string[i+1] != '\0') {
            count++;
        }
    }
    
    if(strlen(string) > 0) {
        count++;
    }
    
    printf("Number of words: %d\n", count);
    
    return 0;
}
