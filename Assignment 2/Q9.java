import java.util.*;

interface Codes {
    String[] a = new String[] {"0101", "0100", "0000", "1111", "1000", "1011", "1001", "0111", "1010", "0110"}; 
    
    class Decimal {
        String[][] arr = new String[2][10];
        void conversion_table() {
            for (int i = 0; i < 10; i++)
            {
                arr[0][i] = a[i];
                String s = a[i];
                int dec = 8*Character.getNumericValue(s.charAt(0))+4*Character.getNumericValue(s.charAt(1))-2*Character.getNumericValue(s.charAt(2))-1*Character.getNumericValue(s.charAt(3));
                arr[1][i] = Integer.toString(dec);
            }
        }
    }
}

class Class8421 extends Codes.Decimal {
    String conversion(String num) {
        conversion_table();
        String result = "";
        for (int j = 0; j < num.length(); j++)
        {
            for (int i = 0; i < 10; i++)
            {
                if (arr[1][i].equals(num.charAt(j)+""))
                {
                    result += arr[0][i] + " ";
                }
            }
        }
        System.out.println("84-2-1 code: " + result);
        return result;
    }
}

class Complement9 extends Class8421{
    String complement(String n) {
        String number = conversion(n);
        String com = "";
        for (int i = 0; i < number.length(); i++)
        {
            if (number.charAt(i) == '0')
            {
                com += "1";
            }
            else if (number.charAt(i) == '1')
            {
                com += "0";
            }
            else if (number.charAt(i) == ' ')
            {
                com += " ";
            }
        }
        System.out.println("9's complement of the number: " + com);
        return com;
    }

    void decEq(String n) {
        String[] code = n.split(" ");
        String dec_eq = "";
        for (int i = 0; i < code.length; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (code[i].equals(arr[0][j]))
                    dec_eq += arr[1][j];
            }
        }
        System.out.println("Decimal equivalent of 9's complement: " + dec_eq);
    }
}

class Q9 {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextLine();
        Complement9 c = new Complement9();
        c.decEq(c.complement(n));
    }
}