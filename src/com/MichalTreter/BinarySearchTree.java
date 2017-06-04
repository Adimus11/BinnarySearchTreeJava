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
                } else {
                    if (currentNode.getValue().compareTo(v) == 0) {
                        System.out.println("Taki element już znajduje się w drzewie");
                        currentNode = null;
                    } else {
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
        System.out.println("Added " + v + " to tree.");
    }

    public void delete(T v) {
        Node<T> currentNode = this.root;

        Node<T> nodeToDelete = searchNode(v);
        if (nodeToDelete == null) {
            System.out.println("chuja znalazłem ;----D");
        }

        currentNode = nodeToDelete;

        while (nodeToDelete.right != null && nodeToDelete.left == null) {
            if (currentNode.right != null) {
                currentNode = currentNode.right;
            } else {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else {
                    if (currentNode.parrent.left == currentNode) {
                        currentNode.parrent.left = null;
                    } else {
                        currentNode.parrent.right = null;
                    }

                    currentNode = currentNode.parrent;
                }
            }
        }
        if (nodeToDelete.parrent.right == nodeToDelete) {
            nodeToDelete.parrent.right = null;
        } else {
            nodeToDelete.parrent.left = null;
        }

        System.out.println("Deleted " + v + " from tree.");
    }

    public boolean search(T v) {
        Node<T> desiredNode = searchNode(v);

        if (desiredNode != null) {
            return true;
        }

        return false;

    }

    private Node<T> searchNode(T v) {
        Node<T> currentNode = this.root;

        while (currentNode.getValue().compareTo(v) != 0) {
            if (currentNode.left != null && currentNode.right != null) {
                if (currentNode.left.getValue().compareTo(v) == 1 && currentNode.right.getValue().compareTo(v) == -1) {
                    System.out.println("Nie ma takiego elementu w drzewie");
                    return null;
                }
            }

            if (currentNode.getValue().compareTo(v) == -1) {
                if (currentNode.left == null) {
                    return null;
                }

                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    return null;
                }

                currentNode = currentNode.right;
            }


        }

        return currentNode;
    }


    public void draw() {

    }
}
