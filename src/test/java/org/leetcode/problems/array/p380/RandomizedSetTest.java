package org.leetcode.problems.array.p380;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    @Test
    void insert() {
        RandomizedSet rs = new RandomizedSet();
        Assertions.assertEquals(true, rs.insert(1));
        Assertions.assertEquals(false, rs.insert(1));
    }
    @Test
    void remove() {
        RandomizedSet rs = new RandomizedSet();
        Assertions.assertEquals(true, rs.insert(1));
        Assertions.assertEquals(true, rs.remove(1));
        Assertions.assertEquals(false, rs.remove(1));
    }
    @Test
    void remove_two_elements() {
        RandomizedSet rs = new RandomizedSet();
        Assertions.assertEquals(true, rs.insert(1));
        Assertions.assertEquals(true, rs.insert(2));
        Assertions.assertEquals(true, rs.remove(1));
        Assertions.assertEquals(false, rs.insert(2));
    }
    @Test
    void getRandom() {
        RandomizedSet rs = new RandomizedSet();
        Assertions.assertEquals(true, rs.insert(1));
        Assertions.assertEquals(true, rs.insert(2));
        Assertions.assertEquals(1, rs.getRandom());
    }
}