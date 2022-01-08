import java.util.*;
import java.io.*;

class Q16 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:/Programming/Java/Assignment 2/sentences.txt");
        Scanner sc = new Scanner(file);
        Scanner sc2 = new Scanner(System.in);
        Map<String, ArrayList<String>> parts = new TreeMap<>();
        while(sc.hasNextLine())
        {
            String sentence = sc.nextLine();
            sentence = sentence.replace("?", "");
            int key_start = sentence.indexOf("(")+1;
            int key_end = sentence.indexOf(")");
            String key = sentence.substring(key_start, key_end);
            sentence = sentence.substring(0, key_start-1);
            key = key.trim();
            sentence = sentence.trim().toLowerCase();
            String words[] = sent_str.split(" ");
            String keys[] = key_str.split(" ");

            for (int i = 0; i < keys.length; i++) {
                    list = map.get(keys[i]);

                    if (list == null) {
                            list = new ArrayList<>();
                    }
                    if (!list.contains(words[i])) {
                            list.add(words[i]);
                    }

                    map.put(keys[i], list);
            }
    }

            System.out.print("Enter words: ");
            String input_sent = sc.nextLine();

            input_sent = input_sent.trim().toLowerCase();

            String words[] = input_sent.split(" ");
            String map_seq[][] = new String[words.length][];

            for (int i = 0; i < words.length; i++) {
                    ArrayList<String> p_o_s = new ArrayList<>();
                    Set<String> keySet = map.keySet();

                    for (String key : keySet) {
                            ArrayList<String> l = map.get(key);
                            if (l.contains(words[i])) {
                                    p_o_s.add(key);
                            }
                    }

                    int n = p_o_s.size();
                    map_seq[i] = new String[n];

                    for (int j = 0; j < n; j++) {
                            map_seq[i][j] = p_o_s.get(j);
                    }
            }

            for (String word[] : map_seq) {
                    for (String pos : word) {
                            System.out.print(pos + " ");
                    }
                    System.out.println();
            }

            System.out.print("Enter user parse string: ");
            String par_str = sc.nextLine();

            par_str = par_str.trim();
            String user_str[] = par_str.split(" ");


            int cnt = 0;
            for (String word[] : map_seq) {
                    boolean flag = false;
                    for (String pos : word) {
                            if (user_str[cnt].equals(pos)) {
                                    flag = true;
                            }
                    }
                    if (flag == false) {
                            System.out.println("Unacceptable");
                            break;
                    }
                    cnt++;
            }

            if (cnt == user_str.length) {
                    System.out.println("Acceptable");
            }

            sc.close();
            sc.close();
        }
    }
}