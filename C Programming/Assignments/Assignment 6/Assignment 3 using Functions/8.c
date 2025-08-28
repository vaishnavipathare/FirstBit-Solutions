int factorial(int x){ int i,f=1; for(i=1;i<=x;i++) f*=i; return f; }
#include <stdio.h>

// Without parameter, without return
void strong1() {
    int n=145,temp=n,sum=0,d;
    while(n>0){ d=n%10; sum+=factorial(d); n/=10; }
    if(sum==temp) printf("Strong\n"); else printf("Not Strong\n");
}

// With parameter, without return
void strong2(int n) {
    int temp=n,sum=0,d;
    while(n>0){ d=n%10; sum+=factorial(d); n/=10; }
    if(sum==temp) printf("Strong\n"); else printf("Not Strong\n");
}

// Without parameter, with return
int strong3() {
    int n=145,temp=n,sum=0,d;
    while(n>0){ d=n%10; sum+=factorial(d); n/=10; }
    return sum==temp;
}

// With parameter, with return
int strong4(int n) {
    int temp=n,sum=0,d;
    while(n>0){ d=n%10; sum+=factorial(d); n/=10; }
    return sum==temp;
}

int main() {
    strong1();
    strong2(145);
    printf("%d\n", strong3());
    printf("%d\n", strong4(145));
    return 0;
}
