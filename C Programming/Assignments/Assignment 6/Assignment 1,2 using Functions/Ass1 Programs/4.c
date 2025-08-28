#include <stdio.h>

// 1. Without parameter, without return
void vowelConsonant1() {
    char ch = 'e';
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
       ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        printf("Vowel\n");
    else
        printf("Consonant\n");
}

// 2. With parameter, without return
void vowelConsonant2(char ch) {
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
       ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        printf("Vowel\n");
    else
        printf("Consonant\n");
}

// 3. Without parameter, with return
int vowelConsonant3() {
    char ch = 'z';
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
       ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        return 1;  // vowel
    else
        return 0;  // consonant
}

// 4. With parameter, with return
int vowelConsonant4(char ch) {
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
       ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        return 1;
    else
        return 0;
}

void main() {
    vowelConsonant1();
    vowelConsonant2('k');

    if(vowelConsonant3() == 1)
        printf("Vowel\n");
    else
        printf("Consonant\n");

    if(vowelConsonant4('O') == 1)
        printf("Vowel\n");
    else
        printf("Consonant\n");
}
