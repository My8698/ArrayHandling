package com.bridgelabz.array;
public class LargestElementInArray {
    /**
     * to print maximum element in given array
     *
     */
    public static void main (String[] args)
    {
        int array[]=new int[] {100,150,125,300,600};
        int max=array[0];

        for (int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i];

        }
        System.out.println("Largest number in given set of Array is:" + max);
    }
}

