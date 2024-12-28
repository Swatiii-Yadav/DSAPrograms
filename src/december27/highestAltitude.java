package december27;

public class highestAltitude {
    public static void main(String[] args) {
        int []gain={-5,1,5,0,-7};
       int result= largestAltitude(gain);
        System.out.println(result);
    }

        public  static int largestAltitude(int[] gain) {
            int []result=new int[gain.length];
            result[0]=0;
            for(int i=1;i<gain.length;i++){
                result[i]=result[i-1]+gain[i-1];
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]+" ");
            }
            int max=0;
            for(int i=0;i<result.length;i++){
                if(result[i]>max){
                    max=result[i];
                }
            }
            return max;
        }

}
