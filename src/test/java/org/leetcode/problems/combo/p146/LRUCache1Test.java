package org.leetcode.problems.combo.p146;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LRUCache1Test {

    @Test
    void get() {
        LRUCache1 lruCache1 = new LRUCache1(2);
        lruCache1.put(2, 2);
        Assertions.assertEquals(2, lruCache1.get(2));
    }

    @Test
    void put() {
        LRUCache1 lruCache1 = new LRUCache1(2);
        lruCache1.put(2, 2);
        Assertions.assertEquals(2, lruCache1.get(2));
    }

    @Test
    void putGet() {
        LRUCache1 lruCache1 = new LRUCache1(2);
        lruCache1.put(1, 1);
        lruCache1.put(2, 2);
        Assertions.assertEquals(1, lruCache1.get(1));
        lruCache1.put(3, 3);
        Assertions.assertEquals(-1, lruCache1.get(2));
        lruCache1.put(4, 4);
        Assertions.assertEquals(-1, lruCache1.get(1));
        Assertions.assertEquals(3, lruCache1.get(3));
        Assertions.assertEquals(4, lruCache1.get(4));
    }
}