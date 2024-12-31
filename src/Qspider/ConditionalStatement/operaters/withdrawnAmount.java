package Qspider.ConditionalStatement.operaters;

/* we have given

*
*/
public class withdrawnAmount {
    public static void main(String[] args) {
int balance =75000;//total balance available
int amount=70000;//amount to withdraw
        int bankCode=1;
        boolean panCard=true;
        if (amount<=balance){
            if (amount<50000 || panCard==true){
                balance-=amount;
                System.out.println("current balance: "+balance);
                if (bankCode==1){
                    if (balance<10000){
                        System.out.println("Min low balance");
                        System.out.println(10000-balance);
                    }
                }
                if (bankCode==3 || bankCode==4){
                    if (balance<5000){
                        System.out.println("Min low balance");
                        System.out.println(5000-balance);
                    }
                }

            }
            else {
                System.out.println("Link Pan-Card");
            }
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}
