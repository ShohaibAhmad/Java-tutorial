package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class NOC_29_PRACTICE_SET {
    public static void main(String[] args) {
        //problem 1 solved
//        float sum = 0;
//        float[] marks = {48.9f,34.89f,89.0f,78.8f,56.89f};
//        for (float element:marks
//             ) {
//            sum = sum + element;
//        }
//        System.out.println(sum);
//        int[] marks ={34,45,67,78,34,2,67,78,89};
//        int num = 34;
//        boolean isInArray = false;
//        for (int element:marks) {
//            if (num==element){
//                isInArray=true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
//        Scanner sc = new Scanner(System.in);
//        float sum =0;
//        float[] marks = {sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat()};
//        for (float element:marks
//             ) {
//            sum = sum + element;
//        }
//        System.out.println(sum/ marks.length);

//        int [][] mat1 = {
//             {1,2,3},
//                {4,5,6}
//        };
//        int [][] mat2 = {
//             {1,2,3},
//                {4,5,6}
//        };
//        int [][] result = {
//             {1,2,3},
//                {4,5,6}
//        };
//        for (int i=0;i<mat1.length;i++){
//            for (int j=0;j<mat1[i].length;j++){
//                System.out.print(result[i][j] + " ");
//                result [i][j] = mat1[i][j]+mat2[i][j];
//            }
//        }
//         int [] number = {1,2,3,4,5,6,7,8,9};
//         int l = number.length;
//         int a = Math.floorDiv(number.length,2);
//         int temp;
//         for (int i=0;i<a;i++){
//                temp=number[i];
//             number[i] = number[l-i-1];
//             number[l-i-1]=temp;
//         }
//        for (int element:number
//             ) {
//            System.out.println(element);
//        }
        int [] number = {1,2,3,4,5,6,7,8,9};
        int max = 0;
        for (int element:number){
            if (element>max){
                max=element;
            }
        }
        System.out.println(max);
    }
}
