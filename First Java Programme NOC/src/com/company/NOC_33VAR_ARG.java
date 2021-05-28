package com.company;
public class NOC_33VAR_ARG {
//    static int sum(int a,int b){
//        return a + b;
//    }
//    static int sum(int a,int b,int c){
//        return a + b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a + b+c+d;
//    }
    public static int sum(int x,int ...shohaib){
        int result = x;
        for (int element:shohaib
             ) {
            result+=element;
        }
        return result;
    }
//    static String sum(String ...shohaib) {
//       return sum();
//    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
//        System.out.println(sum(4,7));
//        System.out.println(sum(4,7,6));
        System.out.println(sum(4,7,6,9,90,789,7));
    }
}
