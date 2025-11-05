class Calculator{
void add(int a, int b){
System.out.println(a , b)}

void add(float a, float b){
System.out.println(a , b)}

void add(folat a, double b){
System.out.println(a , b)}

void add(double a, int b){
System.out.println(a , b)}

}

class Test{
public static void main(String[] a){
Calculator c1 = new Calculator();
c1.add(8,7);
c1.add(2.33, 9.77);
c1.add(2.65, 9872.8987);
c1.add(2.3344, 7);
}}