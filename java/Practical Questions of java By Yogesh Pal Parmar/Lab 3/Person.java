class Person
{
	private int id;
	private String name;
	Person()
	{
		this.id = id;
		this.name = name;
	}
	void setId(int id)
	{
		this.id = id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
}

class Employee extends Person
{
	Employee()
	{
		super();
	}
	double annualSalary;
	String dateOfJoining;
	String mobileNumber; 
	Employee(double annualSalary, String dateOfJoining, String mobileNumber)
	{
		this.annualSalary = annualSalary;
		this.dateOfJoining = dateOfJoining;
		this.mobileNumber = mobileNumber;
	}
	void setAnnualSalary(double annualSalary)
	{
		this.annualSalary = annualSalary;
	}
	double getAnnualSalary()
	{
		return annualSalary;
	}
	void setDateOfJoining(String dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining; 
	}
	String getDateOfJoining()
	{
		return dateOfJoining;
	}
	void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	String getMobileNumber()
	{
		return mobileNumber;
	}
}

class TestEmployee
{
	public static void main(String[] args)
	{
		Person ob1 = new Person();
		Employee ob2 = new Employee();
		ob1.setId(110);
		System.out.println(ob1.getId());
		ob1.setName("Yogesh");
		System.out.println(ob1.getName());
		ob2.setAnnualSalary(12000.0);
		System.out.println(ob2.getAnnualSalary());
		ob2.setDateOfJoining("20-03-2023");
		System.out.println(ob2.getDateOfJoining());
		ob2.setMobileNumber("9295684562");
		System.out.println(ob2.getMobileNumber());
	}
}








