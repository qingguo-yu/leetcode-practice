package org.leetcode.problems.combo.p460;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LFUCacheTest {
    @Test
    void putGet() {
        LFUCache lruCache = new LFUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        Assertions.assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3);
        Assertions.assertEquals(-1, lruCache.get(2));
        Assertions.assertEquals(3, lruCache.get(3));
        lruCache.put(4, 4);
        Assertions.assertEquals(-1, lruCache.get(1));
        Assertions.assertEquals(3, lruCache.get(3));
        Assertions.assertEquals(4, lruCache.get(4));
    }
}