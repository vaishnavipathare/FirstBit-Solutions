// Without parameter, without return
#include <stdio.h>
void sumfl1() {
    int n=12345,last=n%10,first;
    while(n>=10) n/=10;
    first=n;
    printf("%d\n",first+last);
}

// With parameter, without return
void sumfl2(int n) {
    int last=n%10,first;
    while(n>=10) n/=10;
    first=n;
    printf("%d\n",first+last);
}

// Without parameter, with return
int sumfl3() {
    int n=12345,last=n%10,first;
    while(n>=10) n/=10;
    first=n;
    return first+last;
}

// With parameter, with return
int sumfl4(int n) {
    int last=n%10,first;
    while(n>=10) n/=10;
    first=n;
    return first+last;
}

int main() {
    sumfl1();
    sumfl2(12345);
    printf("%d\n", sumfl3());
    printf("%d\n", sumfl4(12345));
    return 0;
}
