package Patterns;

public class diamondPattern {
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++){
            for (int j=n;j>=i+1;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=0;i--){
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
