package org.leetcode.problems.combo.p146;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LRUCache3 {
    private int capacity;
    private LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache3(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        int value = cache.remove(key);
        cache.put(key, value);
        return cache.get(key);
    }

    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            cache.remove(key);
            cache.put(key, val);
            return;
        }
        if (cache.size() >= capacity) {
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        cache.put(key, val);
    }
}
