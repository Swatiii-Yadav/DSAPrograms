package Patterns;

public class PrintOddNumOfStarInTriangle
{
    public static void main(String[] args) {
        int n= 5;
        for (int i=0;i<n;i++){
            for (char j=0;j<=i+i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
