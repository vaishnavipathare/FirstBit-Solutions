#include <stdio.h>
#include <string.h>

int main() {
    char string[100];
    
    printf("Enter a string: ");
    scanf("%s", string);
    
    int len = strlen(string);
    
    if(len > 1) {
        char temp = string[0];
        string[0] = string[len - 1];
        string[len - 1] = temp;
        printf("String after exchanging first and last character: %s\n", string);
    } else {
        printf("String is too short to exchange characters\n");
    }
    
    return 0;
}
