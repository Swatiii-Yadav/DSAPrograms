package Qspider.oops;

public class CarObj {
    double milage;
    double price;
    void drive(){
        System.out.println("");
    }
    void clean(){

    }
    public static void main(String[] args) {
        CarObj alto=new CarObj();
        alto.milage=18.5;
        alto.price=6.5;
        alto.drive();
        alto.clean();
        System.out.println(alto.milage);
        System.out.println(alto.price);



        CarObj audi=new CarObj();
        audi.milage=7.5;
        audi.price=65;
        audi.drive();
        audi.clean();
        System.out.println(audi.milage);
        System.out.println(audi.price);

        CarObj mercedes=new CarObj();
        mercedes.milage=6.7;
        mercedes.price=95;
        mercedes.drive();
        mercedes.clean();
        System.out.println(mercedes.milage);
        System.out.println(mercedes.price);
    }
}
