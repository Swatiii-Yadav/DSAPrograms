package collectionss;

import java.util.ArrayList;
import java.util.List;

public class CheckIfListAreEqualOrNot {
    public static void main(String[] args) {
        List<Integer> ls1=new ArrayList<>();
        ls1.add(10);
        ls1.add(20);
        ls1.add(30);
        ls1.add(40);
        ls1.add(50);
        List<Integer> ls2=new ArrayList<>();
        ls2.add(10);
        ls2.add(29);
        ls2.add(30);
        ls2.add(40);
        ls2.add(50);
        System.out.println(ls1.equals(ls2));

    }
}
