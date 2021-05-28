package com.company;
import java.util.Locale;
import java.util.Scanner;
public class NOC_19_PRACTICE_SET {
    public static void main(String[] args) {
        // not work asignd in if
//        int a = 10;
//        if (a = 11){
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("no");
//        }
//        Scanner sc = new Scanner(System.in);
//        byte m1,  m2, m3;
//        System.out.println("Enter your marks Subject 1");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks Subject 2");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks Subject 3");
//        m3 = sc.nextByte();
//        int avg = (m1+m2+m3);
//        System.out.println("your total marks is: " + avg);
//        float totalP = avg/3.0f;
//        System.out.println("your total percentage is: " + totalP);
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc1.nextLine();
//        switch (name) {
//            case "Shohaib" -> System.out.println("yes");
//            case "Shohaib1" -> System.out.println("yes1");
//            case "Shohaib2" -> System.out.println("yes2");
//            default -> System.out.println("no");
//        }
//        if (totalP>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("you are pass");
//        }
//        else {
//            System.out.println("try again");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your day number");
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("day-1");
//            case 2 -> System.out.println("day-2");
//            case 3 -> System.out.println("day-3");
//            case 4 -> System.out.println("day-4");
//            case 5 -> System.out.println("day-5");
//            case 6 -> System.out.println("day-6");
//            case 7 -> System.out.println("day-7");
//            default -> System.out.println("You are not in a day");
//        }
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        String value = website.toLowerCase();
        if (value.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if (value.endsWith(".org")){
            System.out.println("Organization Website");
        }
        else if (value.endsWith(".bd")){
            System.out.println("Bangladeshi website");
        }
        else {
            System.out.println("Another website");
        }
    }
}
