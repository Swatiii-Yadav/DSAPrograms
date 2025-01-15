package Qspider.oops;

public class Email {
    String from;
    String to;
    void readEmail(){
        System.out.println("Reading Email from "+from);
    }
    void  sendEmail(){
        System.out.println("Sending Email to "+to);
    }
    void deleteEmail(){

    }
    public static void main(String[] args) {
        Email e1=new Email();
        System.out.println("Details of e1 ");
        e1.from="Swarthi05@gmail.com";
        e1.to="swatiaydav0811@gmail.com";
        e1.readEmail();
        e1.sendEmail();

        Email e2=new Email();
        System.out.println("Details of e2 ");
        e2.from="Swarthi05@gmail.com";
        e2.to="swatiaydav0811@gmail.com";
        e2.readEmail();
        e2.sendEmail();
    }
}
