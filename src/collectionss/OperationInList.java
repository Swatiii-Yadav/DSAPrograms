package collectionss;

import java.util.*;

public class OperationInList {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.addLast(60);
        ls.addFirst(5);
        System.out.println(ls);
    }
}
