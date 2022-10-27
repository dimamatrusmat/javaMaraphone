package org.example.day10.binary;

import java.util.ArrayList;

public class Tree <T>{
    private Node <T> tree;

    public Tree (T rootDate) {
        Node root = new Node<T>();
        root.data = (Node) rootDate;
        root.children = new ArrayList<Node<T>>();

    }

    public class Node <T> {
        private Node<T> data;
        private Node<T> parent;
        private ArrayList<Tree<T>.Node<T>> children;
    }
}