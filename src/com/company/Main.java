package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] arr = {3,7,5,23,90,78,65,45,12};
        quick(arr,0,arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quick(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int pivot = start + (end-start)/2;

        while(start<=end){
            while(arr[start]<arr[pivot]){
                start++;
            }
            while(arr[end]>arr[pivot]){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quick(arr,low,end);
        quick(arr,start,high);
    }
}

