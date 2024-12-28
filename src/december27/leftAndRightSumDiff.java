package december27;

public class leftAndRightSumDiff {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []left=new int[n];
        left[0]=0;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        int []right=new int[n];
        right[0]=0;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        int []answer=new int[n];
        answer[0]=nums[0];
        for(int i=0;i<nums.length;i++){
            answer[i]=Math.abs(left[i]-right[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int []nums={10,4,8,3};

    }
}
