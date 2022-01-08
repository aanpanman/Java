
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int [] a = {6,12,18,24,30,36,42,48,54,60};
        String s = new String();
        for (int i = 0; i < a.length; i++)
        {
            s += a[i];
        }

        System.out.println(s);
        String x = new String();
        Integer sum = 0;
        for (int i = 0; i < s.length() ; i++)
            {
                if (i % 2 == 0)
                {
                    if (i == s.length()-1)
                    {
                        
                    }
                    String sub = (String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1)));
                    x += (sub +",");
                    sum += Integer.parseInt(sub);
                }
            }
        System.out.println(x);
        System.out.println(sum);
    }

} 