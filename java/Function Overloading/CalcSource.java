class Calculator{
void add(int a, int b){
System.out.println("Function 1");
System.out.println(a+b);}

void add(float a, float b){
System.out.println("Function 2");
System.out.println(a+b);}

void add(float a, int b){
System.out.println("Function 3");
System.out.println(a+b);}

void add(double a, double b){
System.out.println("Function 4");
System.out.println(a+b);}

//--------

void sub(int a, int b){
System.out.println("Function 1");
System.out.println(a-b);}

void sub(float a, float b){
System.out.println("Function 2");
System.out.println(a-b);}

void sub(float a, int b){
System.out.println("Function 3");
System.out.println(a-b);}

void sub(double a, double b){
System.out.println("Function 4");
System.out.println(a-b);}

//---------------

void mul(int a, int b){
System.out.println("Function 1");
System.out.println(a*b);}

void mul(float a, float b){
System.out.println("Function 2");
System.out.println(a*b);}

void mul(float a, int b){
System.out.println("Function 3");
System.out.println(a*b);}

void mul(double a, double b){
System.out.println("Function 4");
System.out.println(a*b);}

//-------------------------

void div(int a, int b){
System.out.println("Function 1");
System.out.println(a/b);}

void div(float a, float b){
System.out.println("Function 2");
System.out.println(a/b);}

void div(float a, int b){
System.out.println("Function 3");
System.out.println(a/b);}

void div(double a, double b){
System.out.println("Function 4");
System.out.println(a/b);}
}


class Test{
public static void main(String[] a){
Calculator c1 = new Calculator();
c1.add(8,7);
c1.add(2.3f, 9.7f);
c1.add(2.5f, 92);
c1.add(264.66, 798.98);

c1.sub(8,7);
c1.sub(2.3f, 9.7f);
c1.sub(2.5f, 92);
c1.sub(264.66, 798.98);

c1.mul(8,7);
c1.mul(2.3f, 9.7f);
c1.mul(2.5f, 92);
c1.mul(264.66, 798.98);

c1.div(8,7);
c1.div(2.3f, 9.7f);
c1.div(2.5f, 92);
c1.div(264.66, 798.98);


}
}

