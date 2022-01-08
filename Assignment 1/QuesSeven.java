import java.util.*;

class QuesSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String s = sc.nextLine();
        int start = s.indexOf('{');
        int end = s.indexOf('}');
        String x = s.substring(start+1, end);
        String [] dict = x.split("\\),");
        String [] keys = new String [dict.length];
        int [] elements = new int [dict.length];
        for (int i = 0; i < dict.length; i++)
        {
            String [] parts = dict[i].split(":");
            keys[i] = parts[0].replace("'", "");
            keys[i] = keys[i].replace(" ", "");
            //System.out.print(keys[i] + " ");
            parts[1] = parts[1].replace("(", "");
            parts[1]  = parts[1].replace(")", "");
            parts[1]  = parts[1].replace(" ", "");
            int sum = 0;
            String [] v = parts[1].split(",");
            for (String ii: v)
            {
                String t;
                if (ii.charAt(0) == '-')
                {
                    t = ii.substring(1);
                    sum += (Integer.parseInt(t)*-1);
                }
                else
                {
                    sum += Integer.parseInt(ii);
                }
            }
            elements[i] = sum;
        }
        for (int i = 0; i < keys.length; i++)
        {
            System.out.print(keys[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < elements.length; i++)
        {
            System.out.print(elements[i] + " ");
        }
    }
}
