class Student{
int rollno;
String name;
float percentage;

}

class Employee{
int id;
String name;
double annualsal;
}

class Loan{

void approveloan(int r, String n, float p){

if(p>80){
System.out.println("Approved Loan is 2 Lakh ");
}

else if(p>60 && p<80){
System.out.println("Approved Loan is 1 Lakh ");
}

else if(p>40 && p<60){
System.out.println("Approved Loan is 50 Thousand ");
}

else{
System.out.println("No Loan Approved ");
}

}


void approveloan(int i, String n, double sal){

if(sal>12){
System.out.println("Approved Loan is 7 Lakh ");
}

else if(sal>10 && sal<12){
System.out.println("Approved Loan is 6 Lakh ");
}

else if(sal>6 && sal<10){
System.out.println("Approved Loan is 5 Lakh ");
}

else if(sal>4 && sal<6){
System.out.println("Approved Loan is 4 Lakh ");
}

else{
System.out.println("No Loan Approved ");
}
}
}

class Test{
public static void main(String[] a){
Loan l1 = new Loan();
l1.approveloan(10, "Vishnavi", 85.95f);
l1.approveloan(101, "Rushikesh", (double)9570000);
}
}





