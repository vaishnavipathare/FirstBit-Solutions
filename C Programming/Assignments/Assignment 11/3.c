#include <stdio.h>
#include <string.h>

int main() {
    char string[100];
    int n;
    
    printf("Enter a string: ");
    scanf("%s", string);
    
    printf("Enter the index to remove: ");
    scanf("%d", &n);
    
    int len = strlen(string);
    
    if(n >= 0 && n < len) {
        for(int i = n; i < len - 1; i++) {
            string[i] = string[i + 1];
        }
        string[len - 1] = '\0';
        printf("String after removing character: %s\n", string);
    } else {
        printf("Invalid index\n");
    }
    
    return 0;
}
