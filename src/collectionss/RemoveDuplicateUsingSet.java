package collectionss;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {
    public static void main(String[] args) {
        Set<String> str=new HashSet<>();
        str.add("Flower");
        str.add("Florist");
        str.add("Flower");
        str.add("Flow");
        System.out.println(str);
    }
}
