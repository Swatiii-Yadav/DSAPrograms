package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveKeyElementList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            int val= itr.next();
            if (val==30){
                itr.remove();
            }
        }
for (int key:list){
    System.out.println(key);
}
    }
}
