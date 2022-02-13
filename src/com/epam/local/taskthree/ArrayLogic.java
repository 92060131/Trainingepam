package com.epam.local.taskthree;

public class ArrayLogic {
    public static int[] logicCount(int []arr){
        int []brr=new int[arr.length];
    for (int i=0;i< arr.length;i++){
        if(arr[i]>0){
           brr[i]=arr[i]*arr[i];
        }
        else {
            brr[i]=arr[i]*arr[i]*arr[i]*arr[i];
        }
    }
        return brr;
    }
}
