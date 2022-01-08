class QuesTwo {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i+=3)
        {
            String name = args[i];
            float total = Float.parseFloat(args[i+1]);
            float tran = Float.parseFloat(args[i+2]);
            boolean flag = true;
            float p_tran = Math.abs(tran);
            if (tran > 0)
            {
                total += tran;
            }
            else if (tran < 0)
            {
                if (p_tran > total)
                {
                    flag = false;
                }
                else if (p_tran > 25000)
                {
                    flag = false;
                }
                else
                {
                    total += tran;
                    if (p_tran <= 500)
                        total -= 5;
                    else if (p_tran <= 1000)
                        total -= 8;
                    else if (p_tran <= 5000)
                        total -= 10;
                    else if (p_tran <= 15000)
                        total -= 12;
                    else
                        total -= 15;
                }
            }

            System.out.println(name);
            if (flag == false)
                System.out.println("Failed transaction");
            System.out.println(total);
        }
    }
}