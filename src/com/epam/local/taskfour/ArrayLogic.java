package com.epam.local.taskfour;

public class ArrayLogic {
    public  static int maxIndexSearch(int []arr){
        int indexMax=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>arr[indexMax]){
                indexMax=i;
            }
        }
        return indexMax;
    }
    public  static int minIndexSearch(int []arr){
            int indexMin = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[indexMin]) {
                    indexMin = i;
                }
            }
            return indexMin;
        }
}
