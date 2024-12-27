package Qspider.ConditionalStatement;

/*Given a problem in which , a person purchases 3 pants and 4 shirts .If he purchases pants worth more than 4000
 he will get 30% discount if not only 15% . Also if he purchases shirts worth more than 2500 ,get 20% discount
  if not 10% discount .find the total amount he will pay */


public class TotalBill {
    public static void main(String[] args) {


    int p1=1400;
    int p2=159;
    int p3=250;

    int s1=1699;
    int s2=800;
    int s3=120;
    int s4=90;

    int pantCost=p1+p2+p3;
        System.out.println("Pants cost before discount= "+pantCost);
    int shirtsCosts=s1+s2+s3+s4;
        System.out.println("shirts cost before discount= "+shirtsCosts);


    double pants30Discount=((30.0/100.0)*pantCost);
        double pants15Discount=((15.0/100.0)*pantCost);
        double pants30Total=0.0;
        double pants15Total=0.0;

        double shirts20Discount=((20.0/100.0)*shirtsCosts);
        double shirts10Discount=((10.0/100.0)*shirtsCosts);
        double shirts20Total=0.0;
        double shirts10Total=0.0;


    if(pantCost>=4000){
        pants30Total=pantCost-pants30Discount;
        System.out.println("Total pants cost after discount "+pants30Total);
    }
    if (pantCost<4000 && pantCost>0){
        pants15Total=pantCost-pants15Discount;
        System.out.println("Total pants cost   after discount "+pants15Total);
    }
    if (shirtsCosts>=2500){
        shirts20Total=shirtsCosts-shirts20Discount;
        System.out.println("Total shirts cost  after discount "+shirts20Total);
    }
        if (shirtsCosts<2500 && shirtsCosts>0){
            shirts10Total=shirtsCosts-shirts10Discount;
            System.out.println("Total shirts cost  after discount "+shirts10Total);
        }



        //when both price are greater than specified amount
        if (pantCost>=4000 && shirtsCosts>2500){
            System.out.println("Total Bill "+pants30Total+shirts20Total);
        }
        //when both price are less than specified amount
        if (pantCost<4000 && shirtsCosts<2500){
            System.out.println("Total Bill "+pants15Total+shirts10Total);
        }
        //when pants price is greater than specified amount is shirt is not
        if (pantCost>=4000 && shirtsCosts<2500){
            System.out.println("Total Bill "+pants30Total+shirts10Total);
        }
        //when shirt price is greater than specified amount  is not pants is not
        if (pantCost<4000 && shirtsCosts>2500){
            System.out.println("Total Bill "+pants15Total+shirts20Total);
        }

}
}
