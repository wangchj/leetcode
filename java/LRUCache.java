/**
 * LRU Cache
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
 *
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 *
 * Author: Chih-Jye Wang
 * Date  : March 20, 2015
 */

import java.util.HashMap;

public class LRUCache {
    private class Node {
        Node prev, next;
        int key;
        int value;

        public Node(int key, int value) {
            this.key   = key;
            this.value = value;
        }
    }

    private int capacity;

    /** Most recently used at front, least recently used at rear */
    private Node front, rear;
    
    /** Cache look up */
    private HashMap<Integer, Node> cache;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
    }

    public int get(int key) {
        if(!cache.containsKey(key))
            return -1;

        Node node = cache.get(key);
        moveToFront(node);
        return node.value;
    }

    public void set(int key, int value) {
        if(cache.containsKey(key)) {
            Node n = cache.get(key);
            n.value = value;
            moveToFront(n);
            return;
        }

        if(cache.size() == capacity) {
            cache.remove(rear.key);
            removeRear();
        }

        Node node = new Node(key, value);
        addToFront(node);
        cache.put(key, node);
    }

    private void moveToFront(Node node) {
        if(node == front)
            return;
        if(node == rear) {
            node.prev.next = null;
            rear = node.prev;
        }
        else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        node.prev = null;
        node.next = front;
        front.prev = node;
        front = node;
    }

    private void addToFront(Node node) {
        if(front == null)
            front = rear = node;
        else {
            node.next = front;
            front.prev = node;
            front = node;
        }
    }

    private void removeRear() {
        if(front == null)
            return;
        if(front == rear)
            front = rear = null;
        else {
            rear.prev.next = null;
            rear = rear.prev;
        }
    }
}