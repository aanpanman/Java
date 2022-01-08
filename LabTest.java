import java.io.*;
import java.util.*;

class LabTest {
	public static void main (String [] args) throws FileNotFoundException, IOException
	{
		FileReader details = new FileReader("C:\\Programming\\Java\\details.txt");
		Scanner sc = new Scanner(details);
		Map<String, Map<String, Integer>> students = new LinkedHashMap<String, Map<String, Integer>>();
		while(sc.hasNextLine())
		{
			String s = sc.nextLine();
			String[] arr = s.split(",");
			Map<String, Integer> course = new LinkedHashMap<String, Integer>();
			for (int i = 1; i < arr.length-1; i += 2)
			{
				course.put(arr[i], Integer.parseInt(arr[i+1]));
			}
			students.put(arr[0], course);
		}
		System.out.println(students);
		System.out.println();
    	System.out.println("Course Name:");
        String course_name = sc.nextLine();
		for(String reg: students.keySet())
        {
            boolean flag = false;

            for(String cour: students.get(reg).keySet())
            {
                if(cour.equals(course_name))
                {
                    flag=true;
                }
            }

            if(flag)
            {
                System.out.println(reg);
            }
        }
        sc.close();
    }
}