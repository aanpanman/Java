import java.util.*;

class NotPrimeException extends Exception {
    NotPrimeException(int a) {
        System.out.println("Number " + a + " NOT prime.");
    }
}

class NotTwinException extends Exception {
    NotTwinException(int a, int b) {
        System.out.println("Numbers " + a + " and " + b + " are NOT twin prime.");
    }
}

class Prime {
    void isPrime(int a) throws NotPrimeException {
        int flag = 0;
        for (int i = 2; i < a/2; i++)
        {
            if (a % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (a == 1)
        {
            System.out.println("Number " + a + " is neither prime nor composite.");
        }
        else if (flag == 0)
        {
            System.out.println("Number " + a + " is prime.");
        }
        else
        {
            throw new NotPrimeException(a);
        }
    }
}

class TwinPrime extends Prime {
    void isTwinPrime(int a, int b) throws NotPrimeException, NotTwinException {
        Prime p = new Prime();
        p.isPrime(a);
        p.isPrime(b);
        if (a-b!=2 && b-a!=2)
        {
            throw new NotTwinException(a, b);
        }
        else 
        {
            System.out.println("Number " + a + " and " + b + " are twin prime.");
        }
    }
}

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of pairs: ");
        int n = sc.nextInt();
        TwinPrime t = new TwinPrime();
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter pair: ");
            try
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                t.isTwinPrime(a, b);
            }
            catch (NotPrimeException p)
            {
                System.out.println(p);
            }
            catch (NotTwinException tp)
            {
                System.out.println(tp);
            }
        }
    }
}
