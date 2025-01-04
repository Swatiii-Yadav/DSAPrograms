package Qspider.ConditionalStatement.operaters;

public class CalcPriceOfCar {
    public static void main(String[] args) {
        String name="Verna";
        int price=1345000;
        float tax=0,insurance=0;
        int cc=1500;
        //firsst calculate  tax
        if (price<1000000){
            tax=price*(28f/100f);
        } else if (price>1000000 && price<2000000) {
            tax=price*(32f/100f);
        } else if (price>2000000 && price<3000000) {
            tax=price*(37f/100f);
        }else {
            tax=price*0.4f;
        }
        //calculate insurance based on cc
        if (cc<1000){
            insurance=4500;
        } else if (cc>1000 && price<2000) {
            insurance=6500;
        } else if (cc>2000&& cc<3000) {
            insurance=7780;
        }else {
            insurance=12450;
        }

        double total=price+tax+(5*insurance);
        System.out.println("Price of car without including tax and insurance "+price);
        System.out.println(" total tax "+tax);
        System.out.println("insurance  "+insurance);
        System.out.println("total price including tax and insurance "+total);
    }
}
