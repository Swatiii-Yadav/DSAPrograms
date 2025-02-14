package february13;

public class MergeIntervals {
        public static void mergeOverlappingIntervals(int[][] arr) {
            int n = arr.length;
            boolean[] merge = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (merge[i]){
                    continue;
                }
                int low = arr[i][0];
                int high = arr[i][1];
                for (int j = 0; j < n; j++) {
                    if (i != j && !merge[j]) {
                        if ((arr[j][0] >= low && arr[j][0] <= high) ||
                                (arr[j][1] >= low && arr[j][1] <= high) ||
                                (arr[j][0] <= low && arr[j][1] >= high)) {

                            low = Math.min(low, arr[j][0]);
                            high = Math.max(high, arr[j][1]);
                            merge[j] = true;
                        }
                    }
                }
                System.out.print("[" + low + ", " + high + "] ");
            }
            System.out.println();
        }


        public static void main(String[] args) {
            int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
            System.out.println("result:");
            mergeOverlappingIntervals(arr);
        }

}
