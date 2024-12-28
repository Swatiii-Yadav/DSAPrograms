package Qspider.ConditionalStatement;

public class IceCreamPrice {
    public static void main(String[] args) {
        int fc=1;
        String flavour=null;
        int price=0;
        boolean topings=false;
        boolean dryFruits=true;
       if (fc==1){
           price=110;
            flavour="vanilla";
       }
        if (fc==2){
            price=125;
            flavour="kiwi";
        }
        if (fc==3){
            price=145;
            flavour="dragon";
        }
        if (topings){
            price+=15;
        }
        if (dryFruits){
            price+=20;
        }
        double gst=(18.0/100.0)*price;
        double total=price+gst;


    }
}
