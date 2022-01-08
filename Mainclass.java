import java.util.*;

class MainClass {
    int p = 12;
    public static void main(String[] args) {
        /*int n;
        String name; 
        float age;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine(); // as after the next int method the /n is still present. this is to remove it 
        name = sc.nextLine(); // nextLine should be used with the dummy nextLine if needed
        age = sc.nextFloat();

        System.out.println(n + "\n" + name + "\n" + age);*/

        /*Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        //while(sc.hasNextInt())
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
            {
                n = sc.nextInt();
                sum += n;
                System.out.println(n);
            }
            else 
                break;
        }

        //System.out.println(n); //gives error*/

        //MainClass mc = new MainClass(); // if method not static
        //int x = mc.sumEven(n) 
        //          (OR)
        //int x = new MainClass().sumEven(n);
        /*int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = sumEven(n);
        System.out.println("The sum of integers is " + sum);
        System.out.println(new MainClass().p); 
        //to print non static member of the MainClass class for accessing it from a staic method
    }

    
    static int sumEven (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i+=2)
        {
            sum += i;
        }
        return sum;
        
    }*/

        //System.out.println(1.0/0);
        //System.out.println(3.0f/0);
        //System.out.println(12/0); // throws error as infinity is not defined in Integer wrapper class
        /*System.out.println(Float.POSITIVE_INFINITY-Float.POSITIVE_INFINITY); // will give NaN
        System.out.println(4 << 1); //left shift
        System.out.println(16 >> 3); //right shift
        byte b1 = -78, b2 = (byte)130;
        System.out.println(b1 + " " + b2);*/

        /*loop1:
            for (int i = 0; i < 10; i++)
            {
                System.out.println();
                for (int j = 0; j < 10; j++)
                {
                    System.out.print(j + " ");
                    if (j >= i)
                        continue loop1;

                }
            }
        */

        /*outer:
        {
            System.out.println("hello");
            middle:
            {
                System.out.println("students");
                if (true)
                    break outer;
                inner:
                {
                    System.out.println("welcome to java");
                }
            }
            System.out.println("class");
        }*/

        // 2d array
        /*byte[][] b = new byte[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(b + " " + b[1]);

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        for (byte[] i : b)
        {
            for (byte j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
        Scanner sc = new Scanner(System.in);

        //3d array 
        int [][][] a = {{{1,2,3}, {4,5}}, {{7,8,9}, {0,5,3,6}, {12,13}}}; 

        for (int [][] x : a)
        {
            for (int [] y : x)
            {
                for (int z : y)
                {
                    System.out.print(z+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        



    }

}
