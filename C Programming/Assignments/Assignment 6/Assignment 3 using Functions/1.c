// Without parameter, without return
#include <stdio.h>
void print1to10_1() {
    int i;
    for(i=1;i<=10;i++) printf("%d ",i);
    printf("\n");
}

// With parameter, without return
void print1to10_2(int n) {
    int i;
    for(i=1;i<=n;i++) printf("%d ",i);
    printf("\n");
}

int main() {
    print1to10_1();
    print1to10_2(10);
    return 0;
}
