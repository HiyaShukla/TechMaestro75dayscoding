package com.company.Day3;

import java.util.HashMap;

public class Remove_Duplicates_from_Sorted_Array {

//    public <Hashmap> int removeDuplicates(int[] arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//            for(int i=0;i<arr.length;i++){
//                if(map.containsKey(arr[i])) {
//                    continue;
//                }
//                else {
//                    map.put(arr[i],1);
//                }
//            }
//          System.out.println(map.keySet());
//            return map.size();
//        }
//        public static void main(String[] args) {
//            //System.out.println("Hello, World!");
//            int[] arr = {0,0,1,1,1,2,2,3,3,4};
//            //System.out.println(arr.length);
//            Remove_Duplicates_from_Sorted_Array r = new Remove_Duplicates_from_Sorted_Array();
//            int a = r.removeDuplicates(arr);
//            System.out.println(a);
//        }

    public int removeDuplicates(int[] nums){
        int n=nums.length;
        int i=0,index=1;
        while(i<n&&index<n)
        {
            if(nums[i]==nums[index])
            {
                index++;
            }
            else
            {
                i++;
                nums[i]=nums[index];
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
         //System.out.println(arr.length);
           Remove_Duplicates_from_Sorted_Array r = new Remove_Duplicates_from_Sorted_Array();
            int a = r.removeDuplicates(arr);
            System.out.println(a);
    }
    }

