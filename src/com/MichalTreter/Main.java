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

        System.out.println(treeI.search(20));

        treeI.draw();
        System.out.println();
        treeI.delete(30);
        System.out.println(treeI.search(20));
        treeI.draw();

        treeS.insert("aaa");
        treeS.insert("aabaa");
        treeS.insert("caa");

        treeS.draw();
        System.out.println();
        treeS.delete("caa");
        treeS.draw();


        System.out.println("Test");
    }
}
