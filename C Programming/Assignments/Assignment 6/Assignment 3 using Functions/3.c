// Without parameter, without return
#include <stdio.h>
void sumRange1() {
    int start=1,end=5,sum=0,i;
    for(i=start;i<=end;i++) sum+=i;
    printf("%d\n",sum);
}

// With parameter, without return
void sumRange2(int start,int end) {
    int sum=0,i;
    for(i=start;i<=end;i++) sum+=i;
    printf("%d\n",sum);
}

int main() {
    sumRange1();
    sumRange2(1,5);
    return 0;
}
