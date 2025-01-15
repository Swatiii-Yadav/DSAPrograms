package Qspider.oops;

/*1 Define a class CARRENTAL with the following details :
Class Members are : CarId of int type, CarType of string type and Rent of int type.
Define GetCar() method which accepts CarId and CarType.//
carType Small car,van,suv
GetRent() method which return rent of the car on the basis of car type, i.e. Small Car = 1000, Van = 800, SUV = 2500
ShowCar() method which allow user to view the contents of cars i.e. id, type and rent.*/

import java.util.Scanner;

public class CarRental {
    int carId;
    String carType;
    int rent;

    void getCar( ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter carId: ");
        carId=sc.nextInt();
        System.out.println("Enter carType: ");
        carType=sc.nextLine();

    }
    int getRent(){
        if (carType=="small car"){
            rent=1000;
        }
        else if(carType=="Van"){
            rent=800;
        }
        else{
            rent=2500;
        }
        return rent;


    }
    void showCar(){
        System.out.println("car ID: "+carId);
        System.out.println("car Type: "+carType);
        System.out.println("Rent of car "+getRent());

    }
    public static void main(String[] args) {
CarRental car1=new CarRental();
car1.getCar();
car1.getRent();
car1.showCar();
    }
}




