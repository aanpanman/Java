class Fixi implements Runnable {
    int start, end;
    int sum = 0;
    int [] arr;
    Fixi(int[] fixi, int s, int e) {
        arr = new int[fixi.length];
        for (int i = 0; i < fixi.length; i++)
        {
            arr[i] = fixi[i];
        }
        start = s;
        end = e;
    } 
    public void run() {
        for (int i = start; i < end; i++)
        {
            sum += arr[i];
        }
    }
}

class Fi implements Runnable {
    int start, end;
    int sum = 0;
    int [] arr;
    Fi(int [] fi, int s, int e) {
        arr = new int[fi.length];
        for (int i = 0; i < fi.length; i++)
        {
            arr[i] = fi[i];
        }
        start = s;
        end = e;
    }
    public void run() {
        for (int i = start; i < end; i++)
        {
            sum += arr[i];
        }
    }
}

class Q12 {
    public static void main(String[] args) {
        int[] marks = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] student_count = new int[] {3,4,17,8,23,10,4,6,5,2};
        int[] fixi = new int[marks.length];
        for (int i = 0; i < marks.length; i++)
        {
            fixi[i] = marks[i]*student_count[i];
        }

        Fixi one = new Fixi(fixi, 0, (fixi.length/2));
        Fixi two = new Fixi(fixi, (fixi.length/2), fixi.length);
        Fi three = new Fi(student_count, 0, (student_count.length/2));
        Fi four = new Fi(student_count, (student_count.length/2), student_count.length);
        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);
        Thread t3 = new Thread(three);
        Thread t4 = new Thread(four);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            float mean = (one.sum+two.sum)/(three.sum+four.sum);
            System.out.println("Mean of the given distribution: " + mean);
        }
        catch(Exception e)
        {
            System.out.println("Exception thrown.");
        }   
    }
}
