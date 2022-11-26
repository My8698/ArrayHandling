package com.bridgelabz.array;
import java.util.Scanner;
public class EvenPositionNumber {
    public static void main(String[] args) {
        /**
         * scanner to take input from user
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of Array:->");
        int size=scanner.nextInt();
        int []array=new int[size];
        /**
         * for loop to take array elements
         */
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter Elements of array:->");
            array[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.println("Elements On Even Position in Array:->");
        /**
         * for loop to print array element on even position
         */
        for (int i = 0; i < array.length; i++) {
            /**
             * condition to check for even number
             */
            if (i % 2 == 0)
                System.out.println(array[i]);
        }
    }
}