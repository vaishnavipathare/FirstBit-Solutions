#include <stdio.h>
int main() {
    char ch = 'G';
    if(ch >= 'A' && ch <= 'Z') {
        printf("%c is Uppercase\n", ch);
    } else if(ch >= 'a' && ch <= 'z') {
        printf("%c is Lowercase\n", ch);
    } else {
        printf("%c is Not an Alphabet\n", ch);
    }
}
