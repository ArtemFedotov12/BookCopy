package com.start.examples.test15BinaryTree;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Tree {

    @NonNull
    Node root;

    public static void main(String[] args) {
        Node root = new Node(1);
        Tree tree = new Tree(root);

        tree.root.right=new Node(3);
        tree.root.left=new Node((2));

        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
    }

}
