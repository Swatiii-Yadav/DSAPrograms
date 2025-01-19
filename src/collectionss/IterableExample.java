package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("iterate using iterable");
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            int val= itr.next();
            System.out.println(val);
            if (val==30){
                itr.remove();
            }
        }
        System.out.println("iterate using forEach ");
        for (int val:list){
            System.out.println(val);
        }

    }
}
