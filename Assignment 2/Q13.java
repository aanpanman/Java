import java.util.*;

class Bill {
    int n, total;
    int fcount, mcount, faccount;
    Bill(int fac, int m, int f) {
        n = 1;
        faccount = fac;
        mcount = m;
        fcount = f;
        total = faccount + mcount + fcount;
    }
    void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of each item type: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        double bill = 50*a + 75*b + 100*c + 150*d;
        System.out.println("Bill: " + bill);
    }
    synchronized void faculty() {
        System.out.println("Faculty count: " + faccount);
        while (n != 1)
        {
            try 
            {
                wait();
            } 
            catch (InterruptedException ie){}
        }
        if (faccount != 0) 
        {
            System.out.println("Faculty input queue: ");
            for (int i = 0; i < 3; i++) 
            {
                getInfo();
                faccount--;
                if (faccount <= 0)
                {
                    break;
                }
            }
        }
        System.out.println("Faculty count: " + faccount);
        if (mcount > 0)
            n = 2;
        else if (fcount > 0)
            n = 3;
        notifyAll();
    }
    synchronized void mStudent() {
        System.out.println("Male student count: " + mcount);
        while (n != 2)
        {
            try 
            {
                wait();
            } 
            catch (InterruptedException ie) {}
        }
        if (mcount != 0) 
        {
            System.out.println("Male student inout queue: ");
            getInfo();
            mcount--;
        }
        if (fcount > 0)
            n = 3;
        else if (faccount > 0)
            n = 1;
        System.out.println("Male student count: " + mcount);
        notifyAll();
    }
    synchronized void fStudent() {
        System.out.println("Female student count: " + fcount);
        while (n != 3)
        {
            try 
            {
                wait();
            } 
            catch (InterruptedException ie) {}
        }
        if (fcount != 0) 
        {
            System.out.println("Female student input queue: ");
            getInfo();
            fcount--;
        }
        System.out.println("Female student count: " + fcount);
        if (faccount > 0)
            n = 1;
        else if (mcount > 0)
            n = 2;
        notifyAll();
    }
}

class Faculty extends Thread {
    Bill b;
    int fac;
    Faculty(Bill b) {
        this.b = b;
        fac = b.faccount;
        this.start();
    }
    public void run() {
        for (int i = 0; i < fac; i += 3)
        {
            b.faculty();
        }
    }
}

class Mstudent extends Thread {
    Bill b;
    int m;
    Mstudent(Bill b) {
        this.b = b;
        m = b.mcount;
        this.start();
    }
    public void run() {
        for (int i = 0; i < m; i++)
        {
            b.mStudent();
        }
    }
}

class Fstudent extends Thread {
    Bill b;
    int f;
    Fstudent(Bill b) {
        this.b = b;
        f = b.fcount;
        this.start();
    }
    public void run() {
        for (int i = 0; i < f; i++)
        {
            b.fStudent();
        }
    }
}

class Q13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of faculty, male and female students: ");
        int fac = sc.nextInt();
        int m = sc.nextInt();
        int f = sc.nextInt();
        Bill b = new Bill(fac, m, f);
        Faculty t1 = new Faculty(b);
        Mstudent t2 = new Mstudent(b);
        Fstudent t3 = new Fstudent(b);
        System.out.println("Total people who visited the canteen: " + b.total);
    }
}