package com.example.datastructure.Sort;

import java.util.Arrays;

public class MergeSort implements ISort{

    @Override
    public void sort(int[] arr) {
        // in-place sort
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return; // base case
        }

        int mid = low + ((high - low) / 2);
        System.out.println("mergeSort(arr, " + low + ", " + high + ")");
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int idx = 0;

        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[idx] = arr[left];
                left++;
            }else {
                temp[idx] = arr[right];
                right++;
            }
            idx++;
        }

        while(left <= mid){
            temp[idx] = arr[left];
            idx++;
            left++;
        }

        while(right <= high){
            temp[idx] = arr[right];
            idx++;
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp[i - low];
        }
    }
}
