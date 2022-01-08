import java.util.*;

class Faculty {
    Student [] s;

    Faculty(int n) {
        s = new Student [n];
        for (int i = 0; i < s.length; i++)
        {   
            System.out.println("Enter marks of student " + (i+1) + ":");
            s[i] = new Student();
        }
        System.out.print("Class average: ");
        findClassAverage();
        System.out.print("Highest internal marks: ");
        findMaxScore();
    }

    void findClassAverage() {
        int total = 0;
        for (int i = 0; i < s.length; i++)
        {
            total += s[i].getIndividualTotal();
        }
        float avg = (float)total/s.length;
        System.out.println(avg);
    }

    private void findMaxScore() {
        int max = 0;
        for (int i = 0; i < s.length; i++)
        {
            int temp = s[i].getIndividualTotal();
            if (temp > max)
                max = temp;
        }
        System.out.println(max);
    }

    class Student {
        int sum;
        int [] marks;

        Student() {
            Scanner sc = new Scanner(System.in);
            marks = new int[5];
            for (int i = 0; i < marks.length; i++)
            {
                marks[i] = sc.nextInt();
            }
        }
        
        int getIndividualTotal() {
            sum = 0;
            for (int i = 0; i < marks.length; i++)
            {
                sum += marks[i];
            }
            return sum;
        }
    }
}

class QuesNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Faculty f = new Faculty(n);
    }
}
