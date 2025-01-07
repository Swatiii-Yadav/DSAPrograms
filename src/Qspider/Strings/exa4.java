package Qspider.Strings;

public class exa4 {
    public static void main(String[] args) {
        String str="Developer";
        System.out.println(str.indexOf('v'));
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('r'));
        int occ=str.indexOf('e');
        while (occ!=-1){
            System.out.print(occ+"  " );
            occ=str.indexOf('e',occ+1);
        }
    }
}
