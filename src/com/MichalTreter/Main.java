package com.MichalTreter;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> treeI = new BinarySearchTree<>();
        BinarySearchTree<Double> treeD = new BinarySearchTree<Double>();
        BinarySearchTree<String> treeS = new BinarySearchTree<String>();

        treeI.insert(10);
        treeI.insert(5);
        treeI.insert(15);
        treeI.insert( 2);
        treeI.insert(4);
        treeI.insert( 1);
        treeI.delete( 5);
        System.out.println(treeI.search(5));

        System.out.println("Test");
    }
}
