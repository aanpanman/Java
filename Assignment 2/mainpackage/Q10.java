package mainpackage;

import parentpackage.*;

class Q10 {
    public static void main(String[] args) {
        parentpackage.childpackage.ArrayBinaryTree at = new parentpackage.childpackage.ArrayBinaryTree();
        parentpackage.childpackage.LinkedBinaryTree lt = new parentpackage.childpackage.LinkedBinaryTree();
        at.insert(1);
        at.insert(2);
        at.insert(3);
        at.insert(4);
        at.insert(5);
        lt.insert(6);
        lt.insert(7);
        lt.insert(8);
        lt.insert(9);
        lt.insert(0);
        at.traverse();
        lt.traverse();
    }
}