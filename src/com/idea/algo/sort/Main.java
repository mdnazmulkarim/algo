package com.idea.algo.sort;

/**
 * @author Md Nazmul Karim
 */
public class Main {
    /**
     * Main method for project
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("We will be exploring the basic sorting here.");

        int[] numbers = {20, 6 ,8, 90, 8, 654, 89,1, 5, 33, 34, 89,2};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.printArray(numbers);
        insertionSort.sort(numbers);
        System.out.println();
        insertionSort.printArray(numbers);

    }
}
