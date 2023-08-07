package com.example.datastructure.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        MergeSort mergeSort = new MergeSort();

        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSort.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}