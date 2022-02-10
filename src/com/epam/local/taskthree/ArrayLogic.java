package com.epam.local.taskthree;

public class ArrayLogic {
    public static void logicCount(int []arr){
    for (int i=0;i< arr.length;i++){
        if(arr[i]>0){
            System.out.println(arr[i]*arr[i]);
        }
        else {
            System.out.println(arr[i]*arr[i]*arr[i]*arr[i]);
        }
    }}
}
