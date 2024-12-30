package Qspider.ConditionalStatement;

public class CalcMarks {
    public static void main(String[] args) {
        /*4 subjects marks are given calculate total % only when
        all subjects are having minnimum 35.Any 1 subject scoreis below 35 do not calc total % instead
        print fail . Also print marks and subject name in which student has fail*/

        int phy=76;
        int chem=24;
        int maths=57;
        int optional=65;
        double marks=0;
        if (phy<35 || chem<35 ||maths<35 ||optional<35){
            System.out.println("fail");
        }
        else {
            marks=((phy+chem+marks+optional)/400.0)*100.0;
            System.out.println(marks);
        }
        if (chem<35){
            System.out.println("Failed in chemistry");
        }
        if (phy<35){
            System.out.println("Failed in physics");
        } if (maths<35){
            System.out.println("Failed in maths");
        } if (optional<35){
            System.out.println("Failed in optional");
        }


    }
}
