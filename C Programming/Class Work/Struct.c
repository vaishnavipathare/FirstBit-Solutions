#include<stdio.h>
#include<string.h>
struct student{
    int rollno;
    char name[30];
    int marks;
};

void main(){
    struct student s1, s2;
    s1.rollno=1;
    strcpy(s1.name, "Vaishnavi");
    s1.marks=83;
    
    printf("This is student one information : \n");
    printf("Rollno= %d \nName= %s \nMarks= %d", s1.rollno, s1.name, s1.marks);

    printf("\nThis is student two information\n");
    printf("Enter the required information");
    scanf("%d", &s2.rollno);
    scanf("%s", &s2.name);
    scanf("%d", &s2.marks);
    printf("\nRollno=%d \nName=%s \nMarks=%d", s2.rollno, s2.name, s2.marks);
}