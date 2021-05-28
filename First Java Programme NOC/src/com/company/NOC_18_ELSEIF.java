package com.company;
import java.util.Scanner;
public class NOC_18_ELSEIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age..");
        int age = sc.nextInt();
//        switch (age) {
//            case 18 -> System.out.println("you can drive");
//            case 23 -> System.out.println("you can job");
//            case 60 -> System.out.println("you can retaed");
//            default -> System.out.println("Let's Enjoy your life");
//        }
        switch (age) {
            case 18:
                System.out.println("you can drive");
                break;
            default:
                System.out.println("you cannot drive");
        }
//        if (age>56){
//            System.out.println("you are experienced!");
//        }
//        else if (age>46){
//            System.out.println("you are semi-experienced!");
//        }
//        else if (age>36){
//            System.out.println("you are semi-semi-experienced!");
//
//        }
//        else{
//            System.out.println("you are not-experienced!");
//        }
//        System.out.println("Wait for break");
        // practice set
//        if (vara>200){
//            System.out.println("I will ride uber");
//        }
//        else if (vara>=100){
//            System.out.println("I will ride bike");
//
//        }
//        else if (vara>=70){
//            System.out.println("I will ride rickshaw");
//
//        }
//        else if (vara<=40){
//            System.out.println("I will ride Bus");
//
//        }
//        else if (vara<=10){
//            System.out.println("I will ride Walk");
//        }
//        else {
//            System.out.println("I will no need any ride");
//        }

    }
}
