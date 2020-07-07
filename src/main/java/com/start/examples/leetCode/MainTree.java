package com.start.examples.leetCode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsExclude;

public class MainTree {
    public static void main(String[] args) {
      Tree tree1 = new Tree(1);
      Tree tree2 = new Tree(2);
      Tree tree3 = new Tree(3);

      tree1.setLeftNode(tree2);
      tree1.setRightNode(tree3);

        Tree tree4 = new Tree(4);
        Tree tree5 = new Tree(5);
        tree2.setLeftNode(tree4);
        tree2.setRightNode(tree5);

        Tree tree6 = new Tree(6);
        Tree tree7 = new Tree(7);
        tree3.setLeftNode(tree6);
        tree3.setRightNode(tree7);

        Tree tree11 = new Tree(1);
        Tree tree12 = new Tree(2);
        Tree tree13 = new Tree(3);

        tree11.setLeftNode(tree12);
        tree11.setRightNode(tree13);

        Tree tree14 = new Tree(4);
        Tree tree15 = new Tree(5);
        tree12.setLeftNode(tree14);
        tree12.setRightNode(tree15);

        Tree tree16 = new Tree(6);
        Tree tree17 = new Tree(7);
        tree13.setLeftNode(tree16);
        tree13.setRightNode(tree17);

        System.out.println(isTree(tree1,tree11));


    }

        @EqualsAndHashCode
        @Getter
        @Setter
    private static  class Tree {
        int value;
        @EqualsAndHashCode.Exclude
        Tree leftNode;
        @EqualsAndHashCode.Exclude
        Tree rightNode;

        public Tree(int value) {
            this.value = value;
        }
    }
    private static boolean isTree(Tree first, Tree second) {

        if (first == null && second == null) {
            return  true;
        }

        if (first == null || second== null) {
            return false;
        }

        if (first.getValue() != second.getValue()) {
            return false;
        }

        return isTree(first.leftNode, second.leftNode);
    }
}
