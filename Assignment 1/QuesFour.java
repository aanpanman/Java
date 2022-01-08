import java.util.*;

class QuesFour {
    static void display(int[][] r)
    {
        for (int i = 0; i < r.length; i++)
        {
            for (int j = 0; j < r[i].length; j++)
            {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void operation(int[][] r)
    {
        int or, xor, j;
        for (int i = 0; i < r.length; i++)
        {
            loop2:
            for (j = 0; j < r[i].length-1; j++)
            {
                for (int k = j+1; k < r[i].length; k++)
                {
                    or = r[i][j] | r[i][k];
                    xor = r[i][j] ^ r[i][k];
                    System.out.println("(" + r[i][j] + "," + r[i][k] + ") OR = " + or + " XOR = " + xor);
                    if (or == xor)
                    {
                        System.out.println("Row " + i + " is abruptly terminated");
                        break loop2;
                    }
                }
            }
            if (j == r[i].length-1)
                    System.out.println("Row " + i + " is processed entirely");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int[][] r = new int[n-2][];

        for (int i = 0; i < n-2; i++)
        {
            r[i] = new int[n-i-1];
            for (int k = 0; k < r[i].length; k++)
            {
                r[i][k] = 0;
                for (int j = 0; j < i+2; j++)
                {
                    r[i][k] += a[k+j];
                }
            }
        }

        System.out.println("The ragged array: ");
        display(r);
        System.out.println("OR and Ex-OR operations: ");
        operation(r);
    }
}
