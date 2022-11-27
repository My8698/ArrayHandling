package com.bridgelabz.array;
import java.util.Scanner;
public class PrintArrayElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of Array:->");
        int size=scanner.nextInt();
        int []array=new int[size];
        /**
         * for loop to input array
         */
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter Elements of array:->");
            array[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.println("Printing the Elements of array:->");
        /**
         * for loop to print elements of array
         */
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }

}
