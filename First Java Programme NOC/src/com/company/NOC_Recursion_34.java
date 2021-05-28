package com.company;

public class NOC_Recursion_34 {
    public static int factorial(int n){
        //factorial(0)=1
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static int factorial_iterative(int n){
        //factorial(0)=1
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i =1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
            int n = 6;
        System.out.println("the value of factorial n is: "+ factorial(n));
        System.out.println("the value of factorial n is: "+ factorial_iterative(n));

        
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
