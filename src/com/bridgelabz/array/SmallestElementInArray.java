package com.bridgelabz.array;

public class SmallestElementInArray {
    public static void main (String[] args)
    {
        int setarr[]=new int[] {100,150,125,300,600};
        int min=setarr[0];

        for (int i=0;i<setarr.length;i++){
            if(setarr[i]<min)
                min=setarr[i];

        }
        System.out.println("Largest number in given set of Array is:" + min);
    }

}
