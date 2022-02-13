package com.epam.local.taskthree;
import java.util.Scanner;
public class ArrayInit {
    static int length;
    static int []arr;
    public static int[] push(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите размер массива:");
        if(scan.hasNextInt()) {
            length = scan.nextInt();
        }else{
            System.out.println("Введите число!");
        }
        arr=new int[length];
        System.out.print("Введите элементы массива:");
        for (int i=0;i<arr.length;i++){
            if(scan.hasNextInt()) {
                arr[i] = scan.nextInt();
            }else{
                System.out.println("Некоректный ввод данных!");
            }
        }
        return arr;
    }
}
