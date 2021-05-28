package com.company;

import java.util.Arrays;

public class NOC_32_Method_Overloading {
    static void foo(){ System.out.println("Good morning bro"); }
    static void foo(int a){ System.out.println("Good morning " + a + " bro"); }
    static void foo(int a,int b){
        System.out.println("Good morning " + a + " bro");
        System.out.println("Good morning " + b + " bro");
    }
    static void tellJokes(){
        System.out.println("Hey may name is elon mask");
    }
//    static void change(int a){
//         a = 98;
//    }
    static void change2(int [] arr){
         arr[0] = 98;
    }

    public static void main(String[] args) {
       // tellJokes();
        //case1
//        int [] marks = {1,2,3,4,5,6,7,8,9,};
//        int x= 45;
//        change(x);
//        System.out.println(x);
        //case2
//        change2(marks);
//        System.out.println(Arrays.toString(marks));


        foo();
        foo(3000);
        foo(3000,4000);


    }
}
