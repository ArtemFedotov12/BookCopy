package com.start.examples.test40CustomStrucutre;

import lombok.Getter;
import lombok.Setter;

public class MyHashMap<K, V> {
    private int capacity = 16;
    private int size = 0;
    private Entry<K, V> buckets[] = new Entry[capacity];

    @Getter
    @Setter
    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value);
        int bucketNumber = getHashCode(key) % capacity;
        buckets[bucketNumber] = entry;
    }

    private int getHashCode(K key) {
        return key.hashCode();
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("s",10);
        System.out.println();
    }

}
