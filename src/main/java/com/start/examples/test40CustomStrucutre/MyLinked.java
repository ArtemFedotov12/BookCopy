package com.start.examples.test40CustomStrucutre;

public class MyLinked<V> {
    private Node<V> head;
    private Node<V> tail;
    private Node<V> current;

    private static class Node<V> {
        private Node<V> previous;
        private Node<V> next;
        private V value;

        public Node(V value) {
            this.value = value;
        }
    }

    public void add(V value) {
        Node<V> node = new Node(value);
        if (head == null) {
            head = node;
        }
        if (current == null) {
            current = node;
        } else {
            current.next = node;
            node.previous = current;
            node.next = null;
            current = node;
        }

        tail = node;
    }


    public static void main(String[] args) {
        MyLinked<String> myLinked = new MyLinked<>();
        myLinked.add("s");
        myLinked.add("s1");
        myLinked.add("s2");
        System.out.println();
    }
}
