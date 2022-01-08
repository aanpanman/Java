import java.util.*;

class QuesSix {
    static void convert(String [] s, int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            char ch[] = s[i].toCharArray();
            for (int j = 0; j < ch.length; j++)
            {
                if (ch[j] == 'A' || ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U')
                {
                    ch[j] = 'V';
                }
                else
                {
                    ch[j] = 'C';
                }
            }
            String temp = new String(ch);
            temp = temp.replace("CC", "C");
            s[i] = temp.replace("VV", "V");
            System.out.println(s[i]);
            int idx;
            String r;
            do
            {
                idx = s[i].indexOf("VC");
                if (idx != -1)
                {
                    r = s[i].substring(0, idx);
                    r += "*";
                    r += s[i].substring(idx+2);
                    s[i] = r;
                    count++;
                }
            } while (idx != -1);
            System.out.println(count);
            count = 0;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of words: ");
        n = sc.nextInt();
        System.out.println("Enter words: ");
        String [] s = new String [n];
        for (int i = 0; i < n; i++)
        {
            s[i] = sc.next();
        }
        convert(s, n);
    }
}
