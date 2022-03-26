package com.company.Day1;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public int[] digits(int[] arr, int t) {
        // creating an arraylist
        ArrayList<Integer> list = new ArrayList<>();
        // checking for the required condition
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == t) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        // converting arraylist to integer array
        int[] new_arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            new_arr[i] = list.get(i).intValue();
        }
        return new_arr;
    }

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] a = {2,7,11,15};
        int tr = 9;
        int[] b = new int[2];
        b = t.digits(a, tr);
        System.out.println(Arrays.toString(b));

    }
}
