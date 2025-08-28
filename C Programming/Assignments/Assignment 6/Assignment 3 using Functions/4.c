// Without parameter, without return
#include <stdio.h>
void prime1() {
    int n=7,i,flag=1;
    for(i=2;i<=n/2;i++) if(n%i==0) flag=0;
    if(flag) printf("Prime\n"); else printf("Not Prime\n");
}

// With parameter, without return
void prime2(int n) {
    int i,flag=1;
    for(i=2;i<=n/2;i++) if(n%i==0) flag=0;
    if(flag) printf("Prime\n"); else printf("Not Prime\n");
}

// Without parameter, with return
int prime3() {
    int n=7,i,flag=1;
    for(i=2;i<=n/2;i++) if(n%i==0) flag=0;
    return flag;
}

// With parameter, with return
int prime4(int n) {
    int i,flag=1;
    for(i=2;i<=n/2;i++) if(n%i==0) flag=0;
    return flag;
}

int main() {
    prime1();
    prime2(7);
    printf("%d\n", prime3());
    printf("%d\n", prime4(7));
    return 0;
}
