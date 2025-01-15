package Qspider.oops;

public class MobileObj {
String model;
double price;
void call(){
    System.out.println("Used to call");
}
    void message(){
        System.out.println("Used to message");
    }
    public static void main(String[] args) {
MobileObj m1=new MobileObj();
m1.model="S24 ultra pro max";
m1.price=1.5;

        System.out.println("First mobile details");
        System.out.println(m1.model);
        System.out.println(m1.price);;
        m1.call();
        m1.message();

        MobileObj m2=new MobileObj();
        m2.model="iphone 16 pro max";
        m2.price=1.8;

        System.out.println("second mobile details");
        System.out.println(m2.model);
        System.out.println(m2.price);;
        m2.call();
        m2.message();

        MobileObj m3=new MobileObj();
        m3.model="One plus";
        m3.price=0.8;

        System.out.println("third mobile details");
        System.out.println(m3.model);
        System.out.println(m3.price);;
        m3.call();
        m3.message();

    }
}
