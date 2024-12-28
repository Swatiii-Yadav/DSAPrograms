package Qspider.ConditionalStatement;

/*Given a problem in which , a person purchases 3 pants and 4 shirts .If he purchases pants worth more than 4000
 he will get 30% discount if not only 15% . Also if he purchases shirts worth more than 2500 ,get 20% discount
  if not 10% discount .find the total amount he will pay */


public class TotalBill {
    public static void main(String[] args) {


        int p1 = 1400;
        int p2 = 159;
        int p3 = 250;

        int s1 = 1699;
        int s2 = 800;
        int s3 = 120;
        int s4 = 90;

        int pantCost = p1 + p2 + p3;
        System.out.println("Pants cost before discount= " + pantCost);
        int shirtsCosts = s1 + s2 + s3 + s4;
        System.out.println("shirts cost before discount= " + shirtsCosts);


        double pantsDiscount = ((15.0 / 100.0) * pantCost);
        double shirtsDiscount = ((10.0 / 100.0) * shirtsCosts);


        if (pantCost >= 4000) {
            pantsDiscount = pantCost * (30.0 / 100.0);

        }
        if (shirtsCosts >2500) {
            shirtsDiscount = shirtsCosts * (20.0/100.0);
        }
        double total=(pantCost-pantsDiscount)+(shirtsCosts-shirtsDiscount);
        System.out.println(total);
    }
}
