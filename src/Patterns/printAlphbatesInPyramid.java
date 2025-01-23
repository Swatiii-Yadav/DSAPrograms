package Patterns;

public class printAlphbatesInPyramid {
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++){
            for (char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
