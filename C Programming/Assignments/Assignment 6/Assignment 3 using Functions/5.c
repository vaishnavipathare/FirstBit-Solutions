// Without parameter, without return
#include <stdio.h>
void arm1() {
    int n=153,temp=n,sum=0,d;
    while(n>0){ d=n%10; sum+=d*d*d; n/=10; }
    if(sum==temp) printf("Armstrong\n"); else printf("Not Armstrong\n");
}

// With parameter, without return
void arm2(int n) {
    int temp=n,sum=0,d;
    while(n>0){ d=n%10; sum+=d*d*d; n/=10; }
    if(sum==temp) printf("Armstrong\n"); else printf("Not Armstrong\n");
}

// Without parameter, with return
int arm3() {
    int n=153,temp=n,sum=0,d;
    while(n>0){ d=n%10; sum+=d*d*d; n/=10; }
    return sum==temp;
}

// With parameter, with return
int arm4(int n) {
    int temp=n,sum=0,d;
    while(n>0){ d=n%10; sum+=d*d*d; n/=10; }
    return sum==temp;
}

int main() {
    arm1();
    arm2(153);
    printf("%d\n", arm3());
    printf("%d\n", arm4(153));
    return 0;
}
