package com.start.examples.test15BinaryTree;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Node {
    @NonNull
    Object object;
   public Node left;
    public Node right;
}
