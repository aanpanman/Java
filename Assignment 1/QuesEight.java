import java.util.*;

class Encoding {
    String inputtext;
    String [] SA;
    int [] IA;

    Encoding(String text) {
        inputtext = text;
        SA = inputtext.split(" ");
        IA = new int [SA.length];
    }

    static String sort(Encoding [] e) {
        String s = "";
        for(int i = 0; i < e.length; i++)
        {
            s += e[i].inputtext + " ";
        }

        String [] n = s.split(" ");
        for (int i = 0; i < n.length; i++)
        {
            for (int j = i+1; j < n.length; j++)
            {
                if (n[i].compareToIgnoreCase(n[j]) > 0)
                {
                    String temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        String result = n[0] + " ";
        for (int i = 0; i < n.length-1; i++)
        {
            if (n[i].compareToIgnoreCase(n[i+1]) != 0)
                result += n[i+1] + " ";
        }
        return result;
    }

    void encodeText(String s) {
        String [] n = s.split(" ");
        for (int i = 0; i < SA.length; i++)
        {
            for (int j = 0; j < n.length; j++)
            {
                if (SA[i].compareToIgnoreCase(n[j]) == 0)
                    IA[i] = j;
            }
            System.out.print(IA[i] + " ");
        }
        
    }

    static void encodeText(Encoding [] e) {
        int max = 0;
        for (int i = 0; i < e.length-1; i++)
        {
            for (int j = i+1; j < e.length; j++)
            {
                if (e[i].IA.length < e[j].IA.length)
                    max = e[j].IA.length;
            }
        }

        for (int i = 0; i < e.length; i++)
        {
            if (e[i].IA.length != max)
            {
                int [] a = new int [max];
                for (int j = 0; j < e[i].IA.length; j++)
                {
                    a[j] = e[i].IA[j];
                    System.out.print(a[j] + " ");
                }
                for (int j = e[i].IA.length; j < max; j++)
                {
                    a[j] = -1;
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
            else
            {
                for (int j = 0; j < e[i].IA.length; j++)
                {
                    System.out.print(e[i].IA[j] + " ");
                }
                System.out.println();
            }
        }

    }
}

class QuesEight {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sentences: ");
        n = sc.nextInt();
        System.out.println("Enter sentences: ");
        sc.nextLine();
        Encoding [] e = new Encoding [n];
        for (int i = 0; i < e.length; i++)
        {
            e[i] = new Encoding(sc.nextLine());
        }
        System.out.println("Sorted list of words: ");
        String s = Encoding.sort(e);
        System.out.println(s);

        System.out.println("Encoded list from the first ecodeText(): ");
        for (int i = 0; i < e.length; i++)
        {
            e[i].encodeText(s);
            System.out.println();
        }
        
        System.out.println("Encoded list from the second ecodeText(): ");
        Encoding.encodeText(e);

    }
}
