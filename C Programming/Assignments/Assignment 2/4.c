#include <stdio.h>
int main() {
    int marks = 72;

    if(marks > 75) {
        printf("Distinction\n");
    } else if(marks > 65) {
        printf("First Class\n");
    } else if(marks > 55) {
        printf("Second Class\n");
    } else if(marks >= 40) {
        printf("Pass Class\n");
    } else {
        printf("Fail\n");
    }
}
