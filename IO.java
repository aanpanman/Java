import java.util.*;

public class IO {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers:");
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int c = n + m;
        System.out.println("The sum of the numbers:" + " " + c);
        System.out.println("The sum of the numbers: " + n + m); //concatenation will occure
        System.out.println("The sum of the numbers: " + (n + m)); //addiding then concatenation
        System.out.println("The product of the numbers: " + n * m); //precedence is given to * operator 
        //System.out.println("The sum of the numbers: " + n - m); //will give error
        System.out.println("The difference of the numbers: " + (n - m)); 

        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        System.out.println(args[2]+args[1]); //additon will always be concatention
        System.out.println(a + b);
        float d = Float.parseFloat(args[3]);
        System.out.println("Float " + d);
    }
    
}
