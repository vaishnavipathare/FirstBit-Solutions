// Without parameter, without return
#include <stdio.h>
void fact1() {
    int n=5,i,f=1;
    for(i=1;i<=n;i++) f*=i;
    printf("%d\n",f);
}

// With parameter, without return
void fact2(int n) {
    int i,f=1;
    for(i=1;i<=n;i++) f*=i;
    printf("%d\n",f);
}

// Without parameter, with return
int fact3() {
    int n=5,i,f=1;
    for(i=1;i<=n;i++) f*=i;
    return f;
}

// With parameter, with return
int fact4(int n) {
    int i,f=1;
    for(i=1;i<=n;i++) f*=i;
    return f;
}

int main() {
    fact1();
    fact2(5);
    printf("%d\n", fact3());
    printf("%d\n", fact4(5));
    return 0;
}
