package com.bridgelabz.array;
import java.util.Scanner;
public class DuplicateElementsInArray {
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
        for (int i = 0; i <size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j])
                {
                    System.out.println("Duplicate Elements in given Array are:->"+array[j]);
                }
            }
        }
    }
}