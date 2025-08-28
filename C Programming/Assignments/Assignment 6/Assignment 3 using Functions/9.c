// Without parameter, without return
#include <stdio.h>
void pal1() {
    int n=121,temp=n,rev=0,d;
    while(n>0){ d=n%10; rev=rev*10+d; n/=10; }
    if(rev==temp) printf("Palindrome\n"); else printf("Not Palindrome\n");
}

// With parameter, without return
void pal2(int n) {
    int temp=n,rev=0,d;
    while(n>0){ d=n%10; rev=rev*10+d; n/=10; }
    if(rev==temp) printf("Palindrome\n"); else printf("Not Palindrome\n");
}

// Without parameter, with return
int pal3() {
    int n=121,temp=n,rev=0,d;
    while(n>0){ d=n%10; rev=rev*10+d; n/=10; }
    return rev==temp;
}

// With parameter, with return
int pal4(int n) {
    int temp=n,rev=0,d;
    while(n>0){ d=n%10; rev=rev*10+d; n/=10; }
    return rev==temp;
}

int main() {
    pal1();
    pal2(121);
    printf("%d\n", pal3());
    printf("%d\n", pal4(121));
    return 0;
}
