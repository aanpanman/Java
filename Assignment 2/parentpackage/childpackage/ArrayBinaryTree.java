package parentpackage.childpackage;

public class ArrayBinaryTree implements parentpackage.BinaryTree {
    int[] bt = new int[15];
    int n = 0;

    public void insert(int a) {
        if (this.n <= this.bt.length) {
            bt[n] = a;
            n++;
        } else
            System.out.println("The tree is full.");
    }

    public void traverse() {
        for (int i = 0; i < this.bt.length; i++) {
            System.out.print(this.bt[i] + " ");
        }
        System.out.println();
    }
}
