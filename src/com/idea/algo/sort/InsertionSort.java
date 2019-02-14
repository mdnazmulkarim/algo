package com.idea.algo.sort;

public class InsertionSort {

    public void printArray(int[] numbers){

        int i=0;
        int length = numbers.length;

        while (i < length) {
            System.out.print( numbers[i] + " ");
            i++;
        }


    }

    public void sort(int[] numbers) {
        int j= 0;
        int k = 0;
        int key;

        int n = numbers.length;

        for(j=1; j <n; j++)
        {
            key = numbers[j];
            k = j-1;

            while( k>=0 && numbers[k] >= key )
            {
                numbers[k+1] = numbers[k];
                k = k-1;
            }
            numbers[k+1] = key;
        }
    }
}
