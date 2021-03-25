package org.leetcode.problems.combo.p146;

import java.util.HashMap;

public class LRUCache2 {
    private final int capacity;
    private HashMap<Integer, Node> map;
    private DoubleList cache;

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.cache = new DoubleList();
    }

    private void makeRecently(int key) {
        Node x = map.get(key);
        cache.remove(x);
        cache.addLast(x);
    }

    private void addRecently(int key, int val) {
        Node x = new Node(key, val);
        cache.addLast(x);
        map.put(key, x);
    }

    private void deleteKey(int key) {
        Node x = map.remove(key);
        cache.remove(x);
    }

    private void removeLeastRecently() {
        Node deletedNode = cache.removeFirst();
        map.remove(deletedNode.key);
    }
    public int get(int key) {
        if (map.containsKey(key)) {
            Node n = map.get(key);
            makeRecently(n.key);
            return n.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            n.val = value;
            makeRecently(key);
        }
        else {
            if (map.size() >= capacity) {
                removeLeastRecently();
            }
            addRecently(key,value);
        }

    }
    class Node {
        int key;
        int val;
        Node pre;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    class DoubleList{
        private Node head, tail;
        private int size;

        public DoubleList() {
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.pre = head;
            size = 0;
        }

        public void addLast(Node x) {
            x.pre = tail.pre;
            x.next = tail;
            tail.pre.next = x;
            tail.pre = x;
            size ++;
        }

        public void remove(Node x) {
            x.pre.next = x.next;
            x.next.pre = x.pre;
            size--;
        }

        public Node removeFirst() {
            if (head.next == tail) {
                return null;
            }
            Node first = head.next;
            remove(first);
            return first;
        }
        public int size(){
            return size;
        }
    }
}
