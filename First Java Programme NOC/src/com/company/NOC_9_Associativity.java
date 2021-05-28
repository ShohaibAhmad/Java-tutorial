package com.company;

public class NOC_9_Associativity {
    public static void main(String[] args) {
        System.out.println("tutorial number 9 is running 10 is coming");
//        int a = 6*4-23/2+78-90;
//        int b = 6/4-23*2+78-100;
//        System.out.println(b);
        int x = 67;
        int y = 1;
//        int k = x * y/2;
        int b = 1;
        int c = 4;
        int a = 5;
        int k =
                b*b // b+b gun hosse
                - (4 // tar 4 mainas hosse
                *a // a ar sathe gun hosse
                        *c) // ota abr c ar shate gun hosse
                /(2 // total abar devaid hosse 2 ar sathe
                *a); // abar ota a ar shate gun hosse
        System.out.println(k);
    }
}
