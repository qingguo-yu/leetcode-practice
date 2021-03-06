package org.leetcode.problems.array.p380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
    List<Integer> data = new ArrayList<>();
    HashMap<Integer, Integer> indexMap = new HashMap<>();
    Random random = new Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(indexMap.containsKey(val)){
            return false;
        }
        data.add(val);
        indexMap.put(val, data.indexOf(val));
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!indexMap.containsKey(val)){
            return false;
        }
        int index = indexMap.get(val);
        int lastVal = data.get(data.size() - 1);
        indexMap.put(lastVal, index);
        data.set(index,lastVal);
        data.remove(data.size() - 1);
        indexMap.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return data.get(random.nextInt(data.size()));
    }
}
