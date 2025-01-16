package Qspider.oops;

public class DeepCopiesExample {
    String name="Swati";
    public static void main(String[] args) {
        DeepCopiesExample n1=new DeepCopiesExample();
        DeepCopiesExample n2=new DeepCopiesExample();
        System.out.println(n1.name);
        System.out.println(n2.name);
        n1.name="yadav";
        System.out.println(n1.name);
        System.out.println(n2.name);
    }
}
