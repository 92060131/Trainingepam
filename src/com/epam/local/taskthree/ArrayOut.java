package com.epam.local.taskthree;

public class ArrayOut {
    public static void showResult(String msg,int []result){
        System.out.print(msg);
        for (int i=0;i<result.length;i++) {
            System.out.print(result[i]+" ");
        }
    }
}
