package com.company;
import java.util.Scanner;
public class NOC_11_EXERCISE {
    public static void main(String[] args) {
        Scanner addMarks = new Scanner(System.in);
        System.out.println("Enter your subject 1");
        float subject1 = addMarks.nextFloat();
        System.out.println("Enter your subject 2");
        float subject2 = addMarks.nextFloat();
        System.out.println("Enter your subject 3");
        float subject3 = addMarks.nextFloat();
        System.out.println("Enter your subject 4");
        float subject4 = addMarks.nextFloat();
        System.out.println("Enter your subject 5");
        float subject5 = addMarks.nextFloat();
        System.out.println("Enter your subject 6");
        float subject6 = addMarks.nextFloat();
        System.out.println("Enter your subject 7");
        float subject7 = addMarks.nextFloat();
        System.out.println("Enter your subject 8");
        float subject8 = addMarks.nextFloat();
        System.out.println("Enter your subject 9");
        float subject9 = addMarks.nextFloat();
        System.out.println("Enter your subject 10");
        float subject10 = addMarks.nextFloat();
        float totalMarks = subject1 +subject2 +subject3 +subject4 +subject5 +subject6 +subject7 +subject8 +subject9 +subject10;
        System.out.println("Your Total Marks is: "+totalMarks);
        float totalParcent = totalMarks /10;
        System.out.println("Your Total parcentice is: "+totalParcent);
        System.out.println("Tutorial number 11 is ended 12 is coming");

    }
}
