#include <stdio.h>

// 1. Without parameter, without return
void triangle1() {
    int a = 5, b = 5, c = 5;  
    if(a==b && b==c)
        printf("Equilateral Triangle\n");
    else if(a==b || b==c || a==c)
        printf("Isosceles Triangle\n");
    else
        printf("Scalene Triangle\n");
}

// 2. With parameter, without return
void triangle2(int a, int b, int c) {
    if(a==b && b==c)
        printf("Equilateral Triangle\n");
    else if(a==b || b==c || a==c)
        printf("Isosceles Triangle\n");
    else
        printf("Scalene Triangle\n");
}

// 3. Without parameter, with return
int triangle3() {
    int a = 4, b = 4, c = 6;  // hardcoded
    if(a==b && b==c)
        return 1;   // Equilateral
    else if(a==b || b==c || a==c)
        return 2;  
    else
        return 3;   
}

// 4. With parameter, with return
int triangle4(int a, int b, int c) {
    if(a==b && b==c)
        return 1;
    else if(a==b || b==c || a==c)
        return 2;
    else
        return 3;
}

void main() {
    triangle1();                   
    
    triangle2(7,7,10);             
    
    int t1 = triangle3();          
    if(t1==1) printf("Equilateral\n");
    else if(t1==2) printf("Isosceles\n");
    else printf("Scalene\n");
    
    int t2 = triangle4(3,4,5);     
    if(t2==1) printf("Equilateral\n");
    else if(t2==2) printf("Isosceles\n");
    else printf("Scalene\n");
}
