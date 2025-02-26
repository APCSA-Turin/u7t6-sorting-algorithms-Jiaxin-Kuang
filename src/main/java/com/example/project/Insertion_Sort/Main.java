package com.example.project.Insertion_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrA = {2, 6, 1, 3};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {2, 6, 1, 3};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
}
