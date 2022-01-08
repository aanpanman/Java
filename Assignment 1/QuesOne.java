import java.util.*;

class QuesOne {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int l_reg = 9999, g_reg = 0;
        float cgpa = 0;
        String name = "";
        int ccount = 0;
        int ncount = 0;
        int rcount = 0;
        for (int i = 0; i < n; i++)
        {
            if (sc.hasNextInt())
            {
                int reg = sc.nextInt();
                if (reg > g_reg)
                    g_reg = reg;
                if (reg < l_reg)
                    l_reg = reg;
                rcount++;
                sc.nextLine();
            }

            else if (sc.hasNextFloat())
            {
                cgpa += sc.nextFloat();
                ccount++;
                sc.nextLine();
            }

            else
            {
                name += sc.nextLine() + ",";
                ncount++;
            }
        }
        
        System.out.println("rcount = " + rcount);
        System.out.println("ccount = " + ccount);
        System.out.println("ncount = " + ncount);
    

        float avg = cgpa/ccount;
	    if (ccount != 0)
		    System.out.println("avg" + avg);

	    if (rcount != 0)
		    System.out.println("small" + l_reg);
        	System.out.println("larger" + g_reg);

        System.out.println(name);
    }
}
