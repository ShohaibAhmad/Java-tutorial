package com.company;
import java.util.Scanner;
public class NOC_35_PRACTICE_SET {
     static void namta(int n){
        for (int a=1;a<=10;a++){
            System.out.format("%d X %d = %d\n",n,a, n * a );
        }
    }

        static void pattern(int n){
         for (int i =n;i>0;i--){
             for (int j=0;j<i;j++){
                 System.out.print(" * ");
             }
             System.out.println();
         }
        }
        static void pattern1(int n){
         for (int i =0;i<n;i++){
             for (int j=0;j<i+1;j++){
                 System.out.print(" * ");
             }
             System.out.println();
         }
        }

        static void pattern1rec(int n){
            if (n>0){
                pattern1rec(n-1);
                for (int i =0;i<n;i++){
                    System.out.print(" * ");
                }
                System.out.println();
            }

        }


        static int sumr(int n){
         if (n==1){
             return 1;
         }
         return n+sumr(n-1);
        }


        static int fib(int n){
         if (n==1){
             return 0;
         }
         else if (n==2){
             return 1;
         }
         else {
             return fib(n-1) + fib(n-2);
         }
        }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Multiplication of any number");
//        System.out.println("Enter your number");
//         namta(sc.nextInt());
//       pattern(sc.nextInt());

//        int a = sumr(sc.nextInt());
//        System.out.println(a);
//pattern1(5);


//
//        int result = fib(9);
//        System.out.println(result);
        pattern1rec(5);


    }
    }
