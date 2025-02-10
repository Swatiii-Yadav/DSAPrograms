package february10;


import java.util.ArrayList;
import java.util.List;

public class ConnectNRopeinList {
    public static int minSum(List<Integer> list) {
        if (list.size() == 1) return 0;

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                List<Integer> temp = new ArrayList<>(list);
                int sum = temp.get(i) + temp.get(j);
                temp.remove(i);
                temp.add(sum);
                int curr = sum + minSum(temp);
                minCost = Math.min(minCost, curr);

            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of( 3, 2, 6,8);
        System.out.println("Min: " + minSum(new ArrayList<>(list)));
    }
}
