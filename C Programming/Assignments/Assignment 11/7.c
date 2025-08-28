#include <stdio.h>
#include <string.h>

int main() {
    char string[100];
    char result[100];
    int j = 0;
    
    printf("Enter a string: ");
    scanf("%s", string);
    
    for(int i = 0; string[i] != '\0'; i++) {
        if(i % 2 == 0) {
            result[j] = string[i];
            j++;
        }
    }
    result[j] = '\0';
    
    printf("String after removing odd index characters: %s\n", result);
    
    return 0;
}
