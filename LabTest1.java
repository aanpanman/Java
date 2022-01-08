import java.util.*;

class Customer {
	String name;
	float[][] cost = new float[3][];
	
	Customer (String n) {
		name = n;
		for (int i = 0; i < cost.length; i++)
		{
			System.out.println("Enter number of products bought in month "+(i+1));
			Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();
			cost[i] = new float[m];
			System.out.println("Enter cost of each product: ");
			for (int j = 0; j < cost[i].length; j++)
			{
				float p = sc.nextFloat();
				cost[i][j] = p;
			}
		}
	}

	static void haveDiscount(Customer[] c) {
		for (int k = 0; k < c.length; k++)
		{
			float total1 = 0, total2 = 0;
			boolean check1 = false, check2 = false;
			for (int i = 0; i < c[k].cost.length; i++)
			{
				for (int j = 0; j < c[k].cost[i].length; j++)
				{
					total1 += c[k].cost[i][j];
				}
				if (total1 >= 25000)
					check1 = true;
				total2 += total1;
				total1 = 0;
			}
			if (total2 >= 50000)
            {
				check2 = true;
            }
            if (check1 == true || check2 == true)
			{
                System.out.println(c[k].name);
            }
        }
    }

	static void findMaxMonth(Customer[] c) {
		float total = 0;
		float max = 0;
		int month = 0;

		for (int k = 0; k < c.length; k++)
		{
			for (int i = 0; i < c[k].cost.length; i++)
			{
				for (int j = 0; j < c[k].cost[i].length; j++)
				{
					total += c[k].cost[i][j];
				}
				if (max <= total)
				{
					max = total;
					month = (i+1);
				}
				total = 0;
			}
			System.out.println("Month is which maximum purchases where made by customer "+ (k+1) + " = " + month);
		}
		
	}
}

class LabTest1 {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter numeber of customers: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		Customer [] c = new Customer[n];
		for (int i = 0; i < c.length; i++)
		{
			System.out.print("Customer name: ");
			c[i] = new Customer(sc.nextLine());
		}
		Customer.haveDiscount(c);
		Customer.haveDiscount(c);
	}
}
