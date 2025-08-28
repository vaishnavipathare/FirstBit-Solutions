// Without parameter, without return
#include <stdio.h>
void perf1() {
    int n=28,i,sum=0;
    for(i=1;i<n;i++) if(n%i==0) sum+=i;
    if(sum==n) printf("Perfect\n"); else printf("Not Perfect\n");
}

// With parameter, without return
void perf2(int n) {
    int i,sum=0;
    for(i=1;i<n;i++) if(n%i==0) sum+=i;
    if(sum==n) printf("Perfect\n"); else printf("Not Perfect\n");
}

// Without parameter, with return
int perf3() {
    int n=28,i,sum=0;
    for(i=1;i<n;i++) if(n%i==0) sum+=i;
    return sum==n;
}

// With parameter, with return
int perf4(int n) {
    int i,sum=0;
    for(i=1;i<n;i++) if(n%i==0) sum+=i;
    return sum==n;
}

int main() {
    perf1();
    perf2(28);
    printf("%d\n", perf3());
    printf("%d\n", perf4(28));
    return 0;
}
