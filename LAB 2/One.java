import java.util.*;

class One {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0, sign = 1;

        for (int i = 1; i <= n; i++)
        {   
            int num = 0;
            for (int j = 0; j < i; j++)
            {
                num +=  i*((int) Math.pow(10, j));
            }
            //int num = ( ((int) Math.pow(-1, i-1)) * i * (((int) Math.pow(10, i))-1)) / 9;
            num *= sign;
            //System.out.println(num);
            sum += num;
            sign = sign*(-1);
        }
        
        System.out.println(sum);
    }
}
