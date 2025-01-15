package Qspider.oops;

public class ObjectExa {
    int eid;
     double ctc;
    void work(){
        System.out.println("work work work...........");
    }
    void meeting()
    {
        System.out.println("i have a meeting now");
    }

    public static void main(String[] args) {

        ObjectExa s1=new ObjectExa();
        s1.eid=7866;
        s1.ctc=700000000;
        s1.work();
        s1.meeting();
        System.out.println("First employee details");
        System.out.println(s1.eid);
        System.out.println(s1.ctc);
        ObjectExa s2=new ObjectExa();
        System.out.println("second  employee details");
        s2.eid=7867;
        s2.ctc=7.0;
        s2.work();
        s2.meeting();
        ObjectExa s3=new ObjectExa();
        System.out.println("third  employee details");
        s3.eid=456;
        s3.ctc=4.6;
        System.out.println(s3.eid);
        System.out.println(s3.ctc);

    }
}
