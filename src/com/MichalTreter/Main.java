package com.MichalTreter;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> treeI = new BinarySearchTree<>();
        BinarySearchTree<Double> treeD = new BinarySearchTree<Double>();
        BinarySearchTree<String> treeS = new BinarySearchTree<String>();

        treeI.insert(50);
        treeI.insert(30);
        treeI.insert(20);
        treeI.insert(40);
        treeI.insert(70);
        treeI.insert(60);
        treeI.insert(80);

        treeI.draw();
        System.out.println();
        treeI.delete(20);
        treeI.draw();


        System.out.println("Test");
    }
}
