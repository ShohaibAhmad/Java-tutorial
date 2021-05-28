package com.company;
import java.util.Scanner;
public class NOC_6_Exercise {
    public static void main(String[] args) {
        Scanner totalMarks = new Scanner(System.in);
        System.out.println("Enter Subject 1 Number");
        float subject1 = totalMarks.nextFloat();
        System.out.println("Enter Subject 2 Number");
        float subject2 = totalMarks.nextFloat();
        System.out.println("Enter Subject 3 Number");
        float subject3 = totalMarks.nextFloat();
        System.out.println("Enter Subject 4 Number");
        float subject4 = totalMarks.nextFloat();
        System.out.println("Enter Subject 5 Number");
        float subject5 = totalMarks.nextFloat();
        System.out.println("Enter Subject 6 Number");
        float subject6 = totalMarks.nextFloat();
        System.out.println("Enter Subject 7 Number");
        float subject7 = totalMarks.nextFloat();
        System.out.println("Enter Subject 8 Number");
        float subject8 = totalMarks.nextFloat();
        float sum = subject1 + subject2 + subject3 + subject4 + subject5 + subject6 + subject7 + subject8 ;
        System.out.println("Your Total Number is: "+sum);
        float sum2 = (subject1 + subject2 + subject3 + subject4 + subject5 + subject6 + subject7 + subject8)/10;
        System.out.println("Full marks parsentise is :% " + sum2);
    }
}
