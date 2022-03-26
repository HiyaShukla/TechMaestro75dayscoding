package com.company.Day1;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int Max_profit(int[] arr) {
        int prof = 0;
        int min_cp = 10000;
        for (int i = 0; i < arr.length;i++){
            if( min_cp > arr[i]){
                min_cp = arr[i];
            }
            int cur_p = arr[i]-min_cp;

            if(cur_p > prof){
                prof = cur_p;
            }

        }
        return prof;
    }

    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock obj = new Best_Time_to_Buy_and_Sell_Stock();
        int[] prices = {7,1,5,3,6,4};
        int a = obj.Max_profit(prices);
        System.out.println(a);
    }
}

