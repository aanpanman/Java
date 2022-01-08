import java.util.*;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        float b;
        int icount = 0, fcount = 0;
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++)
        {
            try
            {
                a = sc.nextInt();
                icount++;
            }
            catch(InputMismatchException e)
            {
                b = sc.nextFloat();
                fcount++;
            }
        }
        System.out.println("Number of integer values: " + icount);
        System.out.println("Number of float values: " + fcount);
    }
}
