package january21;

public class LongestCommonSubArray {
    public static void main(String[] args) {
        int []arr={4,5,6,7,8,13,16,60,61};

       int maxx=0;
        for (int i=0;i<arr.length;i++){
            int count=0;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]==arr[j-1]+1){
                    count++;
                }
            }
            maxx=Math.max(maxx,count);
        }
        System.out.println(maxx);
    }
}
