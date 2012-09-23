public class TestEmployee
{
	public static void main(String args[])
	{
		Employee staff[] = new Employee[args.length];
		for (int i = 0; i < args.length;i++)
		{
			if (args[i].contains(","))
			{
				String strTemp[] = args[i].split(",");
				staff[i] = new Employee(strTemp[0], 
						Double.parseDouble(strTemp[1]));
			}
			else
			{
				staff[i] = new Employee(args[i]);
			}
		}

		// print all Employee objects
		for (Employee e : staff)
		{
			System.out.println(e);
		}

	}
	
}
