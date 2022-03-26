package com.company.Day1;

import java.util.Arrays;

public class MoveZeros {
    public void result(int[] arr){
        int len = arr.length;
        System.out.println(len);
        int p1=0;
        int p2=0;
        int temp=0;
        while(p1<len){
            if(arr[p1]==0){
                p1++;
            }
            else if(arr[p1]!=0){
                if(p1==p2){
                    p1++;
                    p2++;
                }
                else{
                   temp = arr[p1];
                   arr[p1]=arr[p2];
                   arr[p2]=temp;

                   p2++;
                   p1++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        MoveZeros m = new MoveZeros();
        int[] a = {0,1,0,3,12};
        m.result(a);
    }
}
