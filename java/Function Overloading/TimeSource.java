class Time{
int hours, min, sec;

Time(int hr, int m, int s){
hours=hr;
min=m;
sec=s;
}

Time add(Time t){
Time t1 = new Time(0, 0, 0);
t1.sec = sec + t.sec;
t1.min = min + t.min + t1.sec/60;
t1.sec %= 60;
t1.hours = hours + t.hours + t1.min/60;
t1.min %= 60;
t1.hours %= 24;
return t1;
}

Time add(int s){
Time t2 = new Time(hours, min, sec + s);
t2.min += t2.sec / 60;
t2.sec%= 60;
t2.hours += t2.min / 60;
t2.min %= 60;
t2.hours %= 24;
return t2;
}

void display(){
System.out.printf("%02d:%02d:%02d\n",hours , min , sec );
}
}


class Test{
public static void main(String[] a){
Time t3 =new Time(10, 59, 50);
Time t4 =new Time(2, 5, 20);

Time Sum1 = t3.add(t4);
Time Sum2 = t3.add(134);

System.out.println("Sum of Time is : " );
Sum1.display();
Sum2.display();

}
}