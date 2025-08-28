#include <stdio.h>

// 1. Without parameter, without return
void caseCheck1() {
    char ch = 'G';
    if(ch >= 'A' && ch <= 'Z')
        printf("Uppercase\n");
    else if(ch >= 'a' && ch <= 'z')
        printf("Lowercase\n");
    else
        printf("Not an Alphabet\n");
}

// 2. With parameter, without return
void caseCheck2(char ch) {
    if(ch >= 'A' && ch <= 'Z')
        printf("Uppercase\n");
    else if(ch >= 'a' && ch <= 'z')
        printf("Lowercase\n");
    else
        printf("Not an Alphabet\n");
}

// 3. Without parameter, with return
int caseCheck3() {
    char ch = 'm';
    if(ch >= 'A' && ch <= 'Z')
        return 1;   
    
    else if(ch >= 'a' && ch <= 'z')
        return 0;   
    else
        return -1;  
}

// 4. With parameter, with return
int caseCheck4(char ch) {
    if(ch >= 'A' && ch <= 'Z')
        return 1;
    else if(ch >= 'a' && ch <= 'z')
        return 0;
    else
        return -1;
}

void main() {
    caseCheck1();           
    caseCheck2('p');       

    int res1 = caseCheck3();
    if(res1 == 1)
        printf("Uppercase\n");
    else if(res1 == 0)
        printf("Lowercase\n");
    else
        printf("Not an Alphabet\n");

    int res2 = caseCheck4('Z');
    if(res2 == 1)
        printf("Uppercase\n");
    else if(res2 == 0)
        printf("Lowercase\n");
    else
        printf("Not an Alphabet\n");
}
