package com.bridgelabz.array;
import java.util.Scanner;
public class OddPositionNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array:->");
        int size=scanner.nextInt();
        /**
         *  integer array number
         */
        int[] number=new int[size];
        /**
         * for loop to take array elements
         */
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter Elements of array:->");
            number[i]=scanner.nextInt();
        }
        System.out.println("Elements On Odd Position in Array:->");
        /**
         * to print odd position initially take i=1
         */
        for (int i = 1; i < number.length; i=i+2) {
            System.out.println(number[i]);
        }
    }
}
