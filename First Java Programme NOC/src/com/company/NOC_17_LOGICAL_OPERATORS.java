package com.company;

public class NOC_17_LOGICAL_OPERATORS {
    public static void main(String[] args) {
        Boolean a = true;
        Boolean b = false;
        if (a || b){
            System.out.println("y");
        }
        else {
            System.out.println("n");
        }
        Boolean a1 = true;
        Boolean b2 = false;
        if (a1 && b2){
            System.out.println("y");
        }
        else {
            System.out.println("n");
        }
        System.out.println(!a);
        System.out.println(!b);
    }
}