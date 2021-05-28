package com.company;

public class reverse_number {
    public static void main(String[] args) {
        int num = -123456789;
        int res = 0;
        while (num!=0){
           int rem = num%10;
           res = rem+res*10;
           num=num/10;
        }
        System.out.println(res);
    }

}
