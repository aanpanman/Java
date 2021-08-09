import java.util.*;

class Mainclass {
    public static void main(String[] args) {
        int n;
        String name; 
        float age;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine(); // as after the next int method the /n is still present. this is to remove it 
        name = sc.nextLine(); // nextLine should be used with the dummy nextLine if needed
        age = sc.nextFloat();

        System.out.println(n + "\n" + name + "\n" + age);
    }
}
