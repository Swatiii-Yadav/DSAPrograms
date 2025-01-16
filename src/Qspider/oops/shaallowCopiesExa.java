package Qspider.oops;

public class shaallowCopiesExa {
    String wallpaper="swati.jpeg";
    public static void main(String[] args) {
        shaallowCopiesExa s1=new shaallowCopiesExa();
        shaallowCopiesExa s2=s1;
        System.out.println(s1.wallpaper);
        System.out.println(s2.wallpaper);
        s1.wallpaper="yadav.jpeg";
        System.out.println(s1.wallpaper);
        System.out.println(s2.wallpaper);
    }
}
