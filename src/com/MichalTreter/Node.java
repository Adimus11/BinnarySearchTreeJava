package com.MichalTreter;

/**
 * Created by Adimus on 04.06.2017.
 */
public class Node<T extends Comparable<T>> {
    public Node<T> left = null;
    public Node<T> right = null;
    public T value;


    public Node(T v) {
        this.value = v;
    }

    public Node<T> add(Node<T> node, T v){

        if(node == null){
            node = new Node<T>(v);
            return node;
        }

        if(node.value.compareTo(v) > 0){
            node.left = add(node.left, v);
        }
        else{
            if(node.value.compareTo(v) < 0){
                node.right = add(node.right, v);
            }
        }

        return node;
    }

    public void inorder(Node<T> node){
        if(node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    public Node<T> remove(Node<T> node, T v){

        if(node == null){
            return node;
        }

        if(node.value.compareTo(v) > 0){
            node.left = remove(node.left, v);
        }
        else {
            if(node.value.compareTo(v) < 0){
                node.right = remove(node.right, v);
            }
            else{
                if(node.left == null){
                    return node.right;
                }
                else{
                    if(node.right == null){
                        return node.left;
                    }
                }

                node.value = minValue(node.right);
                node.right = remove(node.right, node.value);
            }
        }

        return node;
    }

    private T minValue(Node<T> node) {
        T min = node.value;
        while(node.left != null){
            min = node.left.value;
            node = node.left;
        }

        return min;
    }

}
