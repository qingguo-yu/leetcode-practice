package org.leetcode.problems.combo.p146;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCache2Test {
    @Test
    void putGet() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        Assertions.assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3);
        Assertions.assertEquals(-1, lruCache.get(2));
        lruCache.put(4, 4);
        Assertions.assertEquals(-1, lruCache.get(1));
        Assertions.assertEquals(3, lruCache.get(3));
        Assertions.assertEquals(4, lruCache.get(4));
    }
}