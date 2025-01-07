package Qspider.Strings;

public class exa3 {
    //toCharArray
    public static void main(String[] args) {
        String str="Burger";
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+"  ");
        }
    }
}
