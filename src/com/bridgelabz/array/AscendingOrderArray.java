package com.bridgelabz.array;

public class AscendingOrderArray {
    /**
     * static variable of int datatype
     * to take length of array
     */
    static int length;
    public static void printArray(int[] array) {
        /**
         * for loop to iteration and printing array element
         */
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void sortArray(int[] array) {
        int temporary = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.println("Elements Of Array Sorted In Ascending order->");
        printArray(array);
    }
    public static void main(String[] args) {
        int[] array = new int[]{12, 20, 1, -4, -19, 3};
        length = array.length;
        System.out.println("Elements of original Array->");
        printArray(array);
        sortArray(array);
    }
}