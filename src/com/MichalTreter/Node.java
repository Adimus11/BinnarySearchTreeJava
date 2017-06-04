package com.MichalTreter;

/**
 * Created by Adimus on 04.06.2017.
 */
public class Node<T extends Comparable<T>> {
    public Node<T> left = null;
    public Node<T> right = null;
    public Node<T> parrent = null;
    private T value;


    public Node(T v, Node<T> parrent) {
        this.value = v;
        this.parrent = parrent;
    }

    public T getValue() {
        return this.value;
    }

}
