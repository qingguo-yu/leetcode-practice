package org.leetcode.problems.combo.p146;

import java.util.HashMap;

public class LRUCache {
    private final int capacity;
    private HashMap<Integer, Node> map = new HashMap<>();
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    private void removeNode(Node n) {
        if(n.pre != null) {
            n.pre.next = n.next;
        }
        else {
            head = n.next;
        }
        if(n.next != null){
            n.next.pre = n.pre;
        }
        else {
            tail = n.pre;
        }
    }

    private void addHead(Node n) {
        n.pre = null;
        n.next = head;
        if(head != null){
            head.pre = n;
        }
        if (tail == null) {
            tail = n;
        }
        head = n;
    }
    public int get(int key) {
        if (map.containsKey(key)) {
            Node n = map.get(key);
            //removeNode
            removeNode(n);
            //addhead
            addHead(n);
            return n.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            n.val = value;
            removeNode(n);
            addHead(n);
        }
        else {
            if (map.size() >= capacity) {
                //delete tail
                map.remove(tail.key);
                removeNode(tail);
            }
            Node n = new Node(key, value);
            addHead(n);
            map.put(key, n);
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
}
