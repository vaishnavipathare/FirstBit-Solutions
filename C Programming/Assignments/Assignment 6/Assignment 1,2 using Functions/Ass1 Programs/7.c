#include <stdio.h>

// 1. Without parameter, without return
void salary1() {
    float basic = 4000, da, ta, hra, total;
    if(basic <= 5000) {
        da = basic * 0.10;
        ta = basic * 0.20;
        hra = basic * 0.25;
    } else {
        da = basic * 0.15;
        ta = basic * 0.25;
        hra = basic * 0.30;
    }
    total = basic + da + ta + hra;
    printf("Total Salary = %.2f\n", total);
}

// 2. With parameter, without return
void salary2(float basic) {
    float da, ta, hra, total;
    if(basic <= 5000) {
        da = basic * 0.10;
        ta = basic * 0.20;
        hra = basic * 0.25;
    } else {
        da = basic * 0.15;
        ta = basic * 0.25;
        hra = basic * 0.30;
    }
    total = basic + da + ta + hra;
    printf("Total Salary = %.2f\n", total);
}

// 3. Without parameter, with return
float salary3() {
    float basic = 6000, da, ta, hra, total;
    if(basic <= 5000) {
        da = basic * 0.10;
        ta = basic * 0.20;
        hra = basic * 0.25;
    } else {
        da = basic * 0.15;
        ta = basic * 0.25;
        hra = basic * 0.30;
    }
    total = basic + da + ta + hra;
    return total;
}

// 4. With parameter, with return
float salary4(float basic) {
    float da, ta, hra, total;
    if(basic <= 5000) {
        da = basic * 0.10;
        ta = basic * 0.20;
        hra = basic * 0.25;
    } else {
        da = basic * 0.15;
        ta = basic * 0.25;
        hra = basic * 0.30;
    }
    total = basic + da + ta + hra;
    return total;
}

void main() {
    salary1();                
    salary2(8000);            

    float s1 = salary3();    
    printf("Total Salary = %.2f\n", s1);

    float s2 = salary4(4500); 
    printf("Total Salary = %.2f\n", s2);
}
