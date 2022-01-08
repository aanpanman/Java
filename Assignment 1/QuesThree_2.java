import java.util.*;

class QuesThree_2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {   
            if (i < n-1)
            {
                for (int j = 0; j < n-1-i; j++)
                {
                    System.out.print(" ");
                }
            }
            
            System.out.print(1);
            if (i > 0)
            {
                System.out.print(" ");
                if (i > 1)
                {
                    for (int j = 0; j < i-1; j++)
                        System.out.print("  ");
                }
                System.out.print(i+1);
            }

            for (int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n-1; i > 0; i--)
        {
            for (int j = 0; j < n-i; j++)
            {
                System.out.print(" ");
            }

            System.out.print(1);
            if (i > 1)
            {
                System.out.print(" ");
                if (i > 2)
                {
                    for (int j = 0; j < i-2; j++)
                    {
                        System.out.print("  ");
                    }
                }
                System.out.print(i);
            }

            for (int j = 0; j < n-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
