package com.epam.local.taskthree;
import java.util.Scanner;
public class ArrayInit {
    static int length;
    static int []arr;
    public static int[] push(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите размер массива:");
        length= scan.nextInt();
        arr=new int[length];
        System.out.println("Введите элементы массива:");
        for (int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        return arr;
    }
}
