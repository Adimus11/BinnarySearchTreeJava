package com.MichalTreter;

public class Main {

    public static void main(String[] args) {
        Node<Integer> treeI = new Node<Integer>(69);
        Node<Double> treeD = new Node<Double>(69.69);
        Node<String> treeS = new Node<String>("Test");

        treeI.insert(69);

        System.out.println("Test");
    }
}
