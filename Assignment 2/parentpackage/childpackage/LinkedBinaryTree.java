package parentpackage.childpackage;

import java.util.*;

public class LinkedBinaryTree {
    LinkedList<Integer> linked = new LinkedList<Integer>();

    public void insert(int n) {
        this.linked.add(n);
    }

    public void traverse() {
        for (int i = 0; i < this.linked.size(); i++) {
            System.out.print(this.linked.get(i) + " ");
        }
        System.out.println();
    }
}
