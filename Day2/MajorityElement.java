package com.company.Day2;

import java.util.*;

public class MajorityElement {
    public int majorityElement(int[] arr) {
        int ret = 0;
        int len = arr.length;
        // HashMap<Integer,Integer> freq = new HashMap<Integer, Integer>();
        // checking if elements are already present in the array,
        // if not present,adding them to the hash map

        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            else{
                freq.put(arr[i],1);
            }
            if(freq.get(arr[i])>len/2){
                ret =  arr[i];
                return ret;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
      MajorityElement m = new MajorityElement();
      int[] arr = {2,1,1,1,1,2,2};
      int a = m.majorityElement(arr);
       System.out.println(a);

       }
   }

//Following Counting Sort Approach
//        int max=0;
//        int[] new_nums = new int[10];
//        for(int i=0;i<nums.length;i++){
//            new_nums[nums[i]] += 1;
//        }
//        System.out.println(Arrays.toString(new_nums));
//
//        for(int i=0;i<new_nums.length;i++){
//            if(max<new_nums[i]){
//                max = new_nums[i];
//            }
//        }
//        int index = getIndex(new_nums,max);
//        return index;
//    }
//    public int getIndex(int[] arr, int val){
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]==val)
//                return i;
//        }
//        return -1;
//}

   /* public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] arr = {2,2,1,1,1,2,2};
        int a = m.majorityElement(arr);
        System.out.println(a);
    }
    */



