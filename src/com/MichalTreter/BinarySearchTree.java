package com.MichalTreter;

import java.util.ArrayList;

/**
 * Created by Adimus on 04.06.2017.
 */
public class BinarySearchTree<T extends Comparable<T>> {
    public Node<T> root = null;

    public BinarySearchTree(){
        root = null;
    }

    public void insert(T v){
        if(root == null){
            root = new Node<T>(v);
        }
        else{
            //Node<T> tempRoot;
            //tempRoot = root.add(root, v);
            //root = tempRoot;

            root = root.add(root, v);
        }
    }

    public void delete(T v){
        if(root != null) {
            root = root.remove(root, v);
        }
    }

    public void draw(){
        root.inorder(root);
    }

    public boolean search(T v){

    }


}
