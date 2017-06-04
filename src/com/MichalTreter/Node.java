package com.MichalTreter;

/**
 * Created by Adimus on 04.06.2017.
 */
public class Node<T extends Comparable<T>> {
    private Node<T> parrent = null;
    public Node<T> left = null;
    public Node<T> right = null;
    private T value;

    public Node(T v){
        this.value = v;
    }

    public T getValue() {
        return this.value;
    }

    public void insert(T v){
        if(this.parrent == null && this.value == null){
            this.value = v;
        }
        else{
            if(this.value.compareTo(v) == 1){
                if(this.right == null){
                    this.right = new Node<T>(v);
                }
                else{
                    this.right.insert(v);
                }
            }
            if(this.value.compareTo(v) == 0){
                System.out.println("Taki element już znajduje się w drzewie");
            }
            if(this.value.compareTo(v) == -1){
                if(this.left == null){
                    this.left = new Node<T>(v);
                }
                else{
                    this.left.insert(v);
                }
            }
        }
    }

    public void delete(T v){

    }

}
