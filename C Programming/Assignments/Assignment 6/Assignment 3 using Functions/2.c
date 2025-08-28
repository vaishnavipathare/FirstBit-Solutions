// Without parameter, without return
#include <stdio.h>
void table1() {
    int n=5,i;
    for(i=1;i<=10;i++) printf("%d ",n*i);
    printf("\n");
}

// With parameter, without return
void table2(int n) {
    int i;
    for(i=1;i<=10;i++) printf("%d ",n*i);
    printf("\n");
}

int main() {
    table1();
    table2(5);
    return 0;
}
