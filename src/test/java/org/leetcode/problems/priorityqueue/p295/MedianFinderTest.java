package org.leetcode.problems.priorityqueue.p295;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {

    @Test
    void findMeidanForTwoNums() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        Assertions.assertEquals(1.5, mf.findMedian());
    }
    @Test
    void findMeidanFor3Nums() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        mf.addNum(3);
        Assertions.assertEquals(2, mf.findMedian());
    }

}