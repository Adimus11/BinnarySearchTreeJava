package com.MichalTreter;

/**
 * Created by Adimus on 04.06.2017.
 */
public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root = null;

    public void insert(T v) {
        if (root == null) {
            root = new Node(v, null);
        } else {
            Node<T> currentNode = root;
            while (currentNode != null) {
                if (currentNode.getValue().compareTo(v) == 1) {
                    if (currentNode.right == null) {
                        currentNode.right = new Node<T>(v, currentNode);
                        currentNode = null;

                    } else {
                        currentNode = currentNode.right;

                    }
                }
                if (currentNode.getValue().compareTo(v) == 0) {
                    System.out.println("Taki element już znajduje się w drzewie");
                    currentNode = null;
                }
                if (currentNode.getValue().compareTo(v) == -1) {
                    if (currentNode.left == null) {
                        currentNode.left = new Node<T>(v, currentNode);
                        currentNode = null;
                    } else {
                        currentNode = currentNode.left;
                    }
                }
            }
        }
    }
}
