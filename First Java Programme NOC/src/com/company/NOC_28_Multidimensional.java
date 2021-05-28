package com.company;

import java.util.Arrays;

public class NOC_28_Multidimensional {
    public static void main(String[] args) {
/*
        int [] a;
        int [][] b;
        b=new int[2][5];
        b [0][0] = 101;
        b [0][1] = 102;
        b [0][2] = 103;
        b [0][3] = 104;
        b [0][4] = 105;
        b [1][0] = 201;
        b [1][1] = 202;
        b [1][2] = 203;
        b [1][3] = 204;
        b [1][4] = 205;
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
*/
        int [][] build;
        build= new int[7][3];
        //first floor
        build [0][0]= 101;
        build [0][1]= 102;
        build [0][2]= 103;
        //second floor
        build [1][0]= 201;
        build [1][1]= 202;
        build [1][2]= 203;
        //3rd  floor
        build [2][0]= 301;
        build [2][1]= 302;
        build [2][2]= 303;
        //4th floor
        build [3][0]= 401;
        build [3][1]= 402;
        build [3][2]= 403;
        //5th floor
        build [4][0]= 501;
        build [4][1]= 502;
        build [4][2]= 503;
        //6th floor
        build [5][0]= 601;
        build [5][1]= 602;
        build [5][2]= 603;
        //7th floor
        build [6][0]= 701;
        build [6][1]= 702;
        build [6][2]= 703;
        for (int i=0;i<build.length;i++){
            for (int j=0;j<build[i].length;j++){
                System.out.print("Floor Number is: "+i+" > ");
                System.out.println(build[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
