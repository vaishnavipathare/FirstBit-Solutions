#include <stdio.h>
#include <string.h>

int main() {
    char string[100];
    
    printf("Enter a string: ");
    scanf("%s", string);
    
    for(int i = 0; string[i] != '\0'; i++) {
        if(string[i] == 'a') {
            string[i] = '$';
        }
    }
    
    printf("Modified string: %s\n", string);
    
    return 0;
}
