package Qspider.oops;

class Main {
    void work() {
        System.out.println("work is going on`");
    }
}

public class objectRefernces {

    public static void main(String[] args) {
        Main w1 = new Main();
        w1.work();
        Main w2 = null;
        w2.work();
    }
}