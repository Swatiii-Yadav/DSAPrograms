package Qspider.ConditionalStatement.operaters;

public class TotalPrice {
    public static void main(String[] args) {
        int p1=2500,p2=1899,p3=6200;
        int s1=599,s2=1299,s3=899,s4=799;
        double pantDiscount=0.0;
        double shirtDiscount=0.0;
        int pantCost=p1+p2+p3;
        int shirtCost=s1+s2+s3+s4;
        //calc pant cost with discount
        if (pantCost>3000 && pantCost<4000){
            pantDiscount=(0.15f *pantCost);
        } else if (pantCost>4000 && pantCost<6000){
            pantDiscount=(0.35f *pantCost);
        } else if (pantCost>6000 && pantCost<10000){
            pantDiscount=(0.5f *pantCost);
        }else if(pantCost>10000) {
            pantDiscount=(0.5f*pantCost)-500;
        }
        int totalPantShirtCost=shirtCost+pantCost;

        //calc shirt cost with discount
        if (shirtCost>2000 && shirtCost<3000){
            shirtDiscount=(0.20f *shirtCost);
        } else if (shirtCost>3000 && shirtCost<4000){
            shirtDiscount=(0.30f *shirtCost);
        } else if (shirtCost>4000 && shirtCost<5000){
            shirtDiscount=(0.40f *shirtCost);
        }
        else if(shirtCost>5000) {
            shirtDiscount=(0.50f*shirtCost)-(totalPantShirtCost-(0.05f*totalPantShirtCost));
        }
        double totalAmountToPay=(pantCost+shirtCost)-(pantDiscount+shirtDiscount);
        System.out.println("Total pant cost "+pantCost);
        System.out.println("Total shirt cost "+shirtCost);
        System.out.println("Total discount on pant  "+pantDiscount);
        System.out.println("Total discount on shirt "+shirtDiscount);
        System.out.println("Total Amount to be pay "+totalAmountToPay);


    }
}
