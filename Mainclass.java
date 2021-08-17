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
        int n;
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
        
    }

}
