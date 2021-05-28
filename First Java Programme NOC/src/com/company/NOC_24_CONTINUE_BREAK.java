package com.company;
import java.util.Scanner;
public class NOC_24_CONTINUE_BREAK {
    public static void main(String[] args) {
//        for (int i =0;i<=10;i++){
//            System.out.print(i);
//            System.out.println(" Java is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        System.out.println("loop end her");
//        int i = 0;
//        while (i<10){
//            System.out.print(i);
//            System.out.println("Java is a great");
//            if (i==2){
//                System.out.println("loop end her");
//                break;
//            }
//            i++;
//        }
//        for (int i = 0; i<50;i++){
//            if (i==2){
//                System.out.println("ending the loop");
//                continue;
//            }
//            System.out.print(i);
//            System.out.println(" java is great");
//        }
        Scanner sc = new Scanner(System.in);
        String propose = sc.nextLine();
        int ripley = 0;
        if (propose.startsWith("i love you")){
            while (ripley<=100){
                System.out.println( ripley +" I Love You To....");
                ripley++;
            }
        }
        else {
            while (ripley<=100){
                System.out.println( ripley + " BreakUp....");
                ripley++;
            }
        }
    }
}
