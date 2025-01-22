package january22;

public class HourGlassPattern {
    public static void main(String[] args) {
        int n=4;
        for (int i=n;i>=0;i--){
            for (int j=n;j>=i+1;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1;i<=n;i++){//start from 1 instead of 0 becouse only 1 star is used make hourglass
            for (int j=n;j>=i+1;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
