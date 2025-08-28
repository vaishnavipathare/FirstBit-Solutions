#include <stdio.h>
int main() {
    int s1 = 80, s2 = 75, s3 = 90, s4 = 85, s5 = 70;
    int total = s1 + s2 + s3 + s4 + s5;
    float percentage = total / 5.0;
    printf("Total Marks = %d\n", total);
    printf("Percentage = %.2f\n", percentage);
}
