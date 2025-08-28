#include<stdio.h>
#include<string.h>
struct Employee{
    int Emp_ID;
    char Emp_name[30];
    int Emp_Sal;
};

void main(){
    struct Employee e1, e2;
    e1.Emp_ID=887;
    strcpy(e1.Emp_name, "Rohit");
    e1.Emp_Sal=83;
    
    printf("This is student one information : \n");
    printf("EmployeeId= %d \nEmployeeName= %s \nEmployee Salary= %d", e1.Emp_ID, e1.Emp_name, e1.Emp_Sal);

    printf("\nThis is student two information\n");
    printf("Enter the required information");
    scanf("%d", &e2.Emp_ID);
    scanf("%s", &e2.Emp_name);
    scanf("%d", &e2.Emp_Sal);
    printf("\nEmployee Id=%d \nEmployee Name=%s \nEmployee Salary=%d", e2.Emp_ID, e2.Emp_name, e2.Emp_Sal);
}
