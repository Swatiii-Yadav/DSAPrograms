package Qspider.arrays;

public class AvgCgpaValue {
    public static void main(String[] args) {
        double[] cgpa = {7.5, 7.0, 8.8, 8.3, 6.9};
        double sum=0.0;
        for (int i = 0; i < cgpa.length; i++) {
            sum+=cgpa[i];
        }
        System.out.println(sum/ cgpa.length);
    }
}
