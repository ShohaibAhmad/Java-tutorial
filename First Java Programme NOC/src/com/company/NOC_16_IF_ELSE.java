package com.company;
import java.util.Scanner;
public class NOC_16_IF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age..??");
//        int age = sc.nextInt();
//        if (age != 18){
//            System.out.println("you can drive");
//        }
//        else {
//            System.out.println("you can not drive");
//        }
        System.out.println("Enter your Amount");
        int rikshaVara1 = sc.nextInt();
        System.out.println("Enter your uber amount");
        int uber = sc.nextInt();
        if (rikshaVara1<30 || uber <100){
            System.out.println("Rkshay jabo");
        }
        else{
            System.out.println("Paye hate jabo");
        }
        System.out.println("tutorial number 16 is ended 17 is coming");
    }
}
