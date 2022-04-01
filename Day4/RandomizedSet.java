package com.company.Day4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class RandomizedSet {
    Random r;
    ArrayList<Integer> li;
    HashMap<Integer,Integer> map;

    public RandomizedSet() {
        // when this class constructor is called , all the values will be initialized/ created
      r = new Random();
      li = new ArrayList<>();
      map = new HashMap<>();
    }

    public boolean insert(int val) {
     if(map.containsKey(val)){
         return false;
     }
     else
         li.add(val);
         map.put(val, li.size()-1);

         return true;
    }

    public boolean remove(int val) {
        int index;
        int ele;
      if (!map.containsKey(val)){
         return false;
      }
      else
          index = map.get(val);
          ele = li.get(li.size()-1);
          li.set(index,ele);
          li.remove(li.size()-1);
          map.put(ele,index);
          map.remove(val);
          return true;

    }

    public int getRandom() {
      return li.get(r.nextInt(li.size()));
    }
//    public static void main(String[] args) {
//        RandomizedSet r = new RandomizedSet();
//
//    }
}
