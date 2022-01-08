import java.util.*;

class LabFAT {

    static String shuffle(String s) {
        String str = s.substring(1, s.length()-1);
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            int random = (int)(Math.random() * ch.length);
            char temp = ch[i];
            ch[i] = ch[random];
            ch[random] = temp;
        }
        String result = String.valueOf(s.charAt(0)) + String.valueOf(ch) + String.valueOf(s.charAt(s.length()-1));
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int max=0;
        for (int i = 0; i < words.length; i++)
        {
            if (words[i].length() > max)
                max = words[i].length();
        }
        ArrayList<ArrayList<String>> mainList = new ArrayList<ArrayList<String>>(max);
        for (int i = 0; i < max; i++)
        {
            ArrayList<String> l = new ArrayList<String>();
            if (i > 2)
            {
                    for (int j = 0; j < words.length; j++)
                {
                    if (i+1 == words[j].length())
                    {
                        System.out.println(words[j]);
                        String r = shuffle(words[j]);
                        l.add(r);
                    }
                }
                mainList.add(l);
            }
            else
            {
                for (int j = 0; j < words.length; j++)
                {
                    if (i+1 == words[j].length())
                    {
                        l.add(words[j]);
                    }
                }
                mainList.add(l);
            }
        }
        System.out.println(mainList);
    }
}
