package com.bridgelabz.array;
public class ReverseArray {
    public static void main(String[] args) {
        int[] number = new int[]{10, 11, 12, 13, 14, 15};
        System.out.println("Given Array:->");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse Array is:->");
        /**
         * for loop to print reverse of given array
         */
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i] + " ");

        }
    }
}
