package org.leetcode.problems.combo.p146;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCache3Test {

    @Test
    void lruCache() {
        LRUCache3 lruCache3 = new LRUCache3(2);
        lruCache3.get(2);
        lruCache3.put(2, 6);
        lruCache3.get(1);
        lruCache3.put(1, 5);
        lruCache3.put(1, 2);
        lruCache3.get(1);
        Assertions.assertEquals(6, lruCache3.get(2) );
    }
}