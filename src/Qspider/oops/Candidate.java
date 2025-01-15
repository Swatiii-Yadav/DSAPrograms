package Qspider.oops;

/* Define a class Candidate with the following description
Members are : RNo of int type, Name of type String, Score of type float, Remarks of type String.
Member functions :
AssignRem() to assign Remarks as per the Score obtained by a candidate. Score range are given below:
Score	Remarks
>=50	Selected
<50	Not Selected
 A function ENTER() to allow user to enter values for RNo, Name, Score and call function AssignRem() to assign the remarks.
A function DISPLAY() to allow user to view the content of all the data members.*/


import java.util.Scanner;

public class Candidate {
int rollNo;
String name;
float score;
String remark;
void assignRemark(){
if (score>=50){
    System.out.println(name+" is selected ");
}
else {
    System.out.println(name+" is not selected");
}
}
void enter(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Roll Number: ");
    rollNo = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Name: ");
    name = sc.nextLine();
    System.out.print("Enter Score: ");
    score = sc.nextFloat();
    assignRemark();

}
void display(){
    System.out.println("Candidate details: ");
    System.out.println("roll number: "+rollNo);
    System.out.println("name: "+name);
    System.out.println("score: "+score);

}
    public static void main(String[] args) {
        Candidate c1=new Candidate();
        c1.enter();
        c1.display();
        c1.assignRemark();
    }
}
