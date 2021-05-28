package com.company;
import java.util.Scanner;

public class NOC_5_user_input {
    public static void main(String[] args) {
        System.out.println("Tutorial number 5 is running 6 is comming");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a+b;
//        float sum = a+b;
//        System.out.println("The total number is: "+sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        System.out.println("Enter your name:");
//        String str = sc.nextLine();
//        System.out.println(str);
        Scanner profile = new Scanner(System.in);
        System.out.println("Enter Your Name.......");
        String name = profile.nextLine();
        System.out.println("Enter Your Address.......");
        String address = profile.nextLine();
        System.out.println("Enter your email.......");
        String email = profile.nextLine();
        System.out.println("Enter Your Number.......");
        int number = profile.nextInt();
        System.out.println("Your name is: "+name);
        System.out.println("Your email is: "+email);
        System.out.println("Your address is: "+address);
        System.out.println("Your number is: "+number);
        System.out.println("Tutorial 5 is ended now we will start 6");
    }
}
