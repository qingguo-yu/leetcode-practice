package org.leetcode.problems.combo.p146;

import java.util.LinkedHashMap;

public class LRUCache1 {
    private final int capacity;
    private LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache1(int capacity) {
        this.capacity = capacity;
    }


    public int get(int key) {
        if (cache.containsKey(key)) {
            int val = cache.get(key);
            cache.remove(key);
            cache.put(key, val);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.remove(key);
            cache.put(key, value);
        }
        else {
            if (cache.size() >= capacity) {
                int oldestKey = cache.keySet().iterator().next();
                cache.remove(oldestKey);
            }
            cache.put(key, value);
        }

    }
}
