import java.util.*;

class QuesFive {

    static void rotateMatrix(char [][] m, int n) {

        for (int i = 1; i < n; i++)
        {
            for (int k = 0; k < i; k++)
            {
                char temp = m[i][0];
                for (int j = 0; j < n-1; j++)
                {
                    m[i][j] = m[i][j+1];
                }
                m[i][n-1] = temp;
            }
        }
        for (int i = 1; i < n; i++)
        {
            for (int k = 0; k < i; k++)
            {
                char temp = m[0][i];
                for (int j = 0; j < n-1; j++)
                {
                    m[j][i] = m[j+1][i];
                }
                m[n-1][i] = temp;
            } 
        }

    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        n = sc.nextInt();
        char [][] m = new char [n][n];
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                m[i][j] = sc.next().charAt(0);
            }
        }

        rotateMatrix(m, n);

        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
