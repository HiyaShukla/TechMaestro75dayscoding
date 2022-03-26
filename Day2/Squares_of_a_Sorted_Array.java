package com.company.Day2;

import java.util.Arrays;



public class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = (int) Math.pow(arr[i],2);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Squares_of_a_Sorted_Array s = new Squares_of_a_Sorted_Array();
        int[] a = {-4,-1,0,3,10};
        int[] b = new int[a.length];
        b = s.sortedSquares(a);
        System.out.println(Arrays.toString(b));
    }
}





