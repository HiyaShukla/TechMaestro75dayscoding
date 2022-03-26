package com.company.Day2;

public class Pivot_Index {
    public int pivotIndex(int[] nums) {
//        int pivot ;
//        int mid;
//        int sum_l;
//        int sum_r;
//        int len = nums.length - 1;
//        for (pivot = 0; pivot <= len; pivot++) {
//            mid = get_mid(pivot, len);
//            sum_l = sum_left(nums, mid);
//            sum_r = sum_right(nums, mid);
//            if (sum_l == sum_r) {
//                return mid;
//            }
//            if (pivot==len && sum_r == 0) {
//                sum_l = 0;
//                //sum_r = sum_right(nums, 0);
//                return 0;
//                }
//            }
//            if (pivot == len) {
//                sum_r = 0;
//                sum_l = sum_left(nums, len);
//                if (sum_l == sum_r) {
//                    return 0;
//                }
//            }
//        return -1;
//        }
//
//
//
//    public int sum_left(int[] nums,int mid){
//        int sum=0;
//        for(int i=0;i<mid;i++){
//            sum = sum + nums[i];
//        }
//        System.out.println("sum_l" + sum);
//        return sum;
//    }
//    public int sum_right(int[] nums,int mid){
//        int sum=0;
//        for(int i=mid+1;i<nums.length;i++){
//            sum = sum + nums[i];
//        }
//        System.out.println("sum_r" + sum);
//        return sum;
//    }
//    public int get_mid(int start,int end) {
//        int mid;
//         mid = start + (end-start)/2;
//        System.out.println(mid);
//            return mid;
//    }

        int p = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        //System.out.println(sum);

        for (int i = 0; i < nums.length; i++) {
            if (p == sum - p - nums[i]) {
                return i;
            }
            p = p + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Pivot_Index p = new Pivot_Index();
        int[] arr = {-1,-1,-1,-1,0,1};
        int a = p.pivotIndex(arr);
       System.out.println(a);
    }
}
