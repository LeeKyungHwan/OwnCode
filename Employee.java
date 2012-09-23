public class Employee
{
	private final String EID;
	private String eName;
	private double salary;
	public final static double BASIC_SALARY = 15000;
	public static int counter = 0;

	public Employee(String eName, double salary)
	{
		counter++;
		this.eName = eName;
		this.salary = salary;
		EID = generateEID(eName);
	}
	public Employee(String eName)
	{
		this(eName, BASIC_SALARY);
	}
	public String generateEID(String eName)
	{
		return "2012-" + eName.length() + counter;
	}
	public String getEName()
	{
		return eName;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getEID()
	{
		return EID;
	}
	public String toString()
	{
		return  "Employee ID: " + getEID() + 
			"\nName: " + getEName() + 
			"\nSalary: " + getSalary() + "\n";
	}
}
