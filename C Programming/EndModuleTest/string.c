#include <stdio.h>
#include <string.h>

int isDigit(char ch) {
    return ch >= '0' && ch <= '9';
}
int isSpace(char ch) {
    return ch == ' ' || ch == '\n' || ch == '\t';
}
void countThings(char text[], int *word, int *digit, int *space, int *comment) {
    int i = 0;
    int count = 0;  
    while (text[i] != '\0') {
        if (isDigit(text[i])) {
            (*digit)++;
        }
        if (isSpace(text[i])) {
            (*space)++;
            count = 0;
        } else {
            if (count == 0) {
                (*word)++;
                count = 1; 
            }
        }
        if (text[i] == '/' && text[i+1] == '/') {
            (*comment)++;
            while (text[i] != '\n' && text[i] != '\0') {
                i++;
            }
        }
        if (text[i] == '/' && text[i+1] == '*') {
            (*comment)++;
            i += 2;
            while (!(text[i] == '*' && text[i+1] == '/') && text[i] != '\0') {
                i++;
            }
            if (text[i] != '\0') {
                i++;
            }
        }i++;
    }
}
void readInput(char text[]) {
    char word[200];
    text[0] = '\0';

    printf("Type words and type - to stop:\n");

    while(1) {
        scanf("%s", word);
        if (strcmp(word, "-") == 0) {
            break;
        }
        strcat(text, word);
        strcat(text, " ");
    }
}

int main() {
    char text[1000];
    int words = 0, digits = 0, spaces = 0, comments = 0;
    readInput(text);
    countThings(text, &words, &digits, &spaces, &comments);
    printf("\nResults:\n");
    printf("Words   : %d\n", words);
    printf("Comments: %d\n", comments);
    printf("Spaces  : %d\n", spaces);
    printf("Digits  : %d\n", digits);
    return 0;
}
