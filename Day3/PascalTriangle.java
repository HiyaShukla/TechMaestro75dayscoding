package com.company.Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(numRows == 0){
            return res;
        }

        else if(numRows == 1){
            list.add(1);
            res.add(list);
            return res;
        }
        else if(numRows == 2){
            list.add(1);
            list.add(1);
            res.add(list);
            return res;
        }
      for(int i=1;i<=numRows;i++){
          List<Integer> innerlist = new ArrayList<>();
              if (i == 1) {
                  innerlist.add(1);
              }
              else if(i==2){
                  innerlist.add(1);
                  innerlist.add(2);
                  innerlist.add(1);
              }
              else{
                  for (int j = 1; j < numRows ; j++) {

                  }
          }
          res.add(innerlist);
        }
        return res;
    }

    public static void main(String[] args) {
        PascalTriangle p = new PascalTriangle();
        List<List<Integer>> list1 = new ArrayList<>();
        list1 = p.generate(5);
        System.out.println(list1);

    }
}
