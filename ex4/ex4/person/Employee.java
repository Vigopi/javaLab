package ex4.person;
/**
	Employee class having employee details
*/
public class Employee
{
	private static int nextId=0;
	private int id;
	private String name;
	private String designation;
	private int experiance;
	private float salary;
	/**
		default constructor which initializes the employee ID automatically
	*/
	public Employee()
	{
		nextId++;
		this.id=nextId;
	}
	/**
		constructor which initializes the employee details
		@param name Employee name
		@param designation Designation of the employee
		@param experiance Number of years of experiance of the employee
		@param salary Salary of the employee
	*/
	public Employee(String name,String designation,int experiance,float salary)
	{
		this();
		this.name=name;
		this.designation=designation;
		this.experiance=experiance;
		this.salary=salary;
	}
	/**
		to display the employee details
		@return Sting having employee details
	*/
	public String toString()
	{
		return("\t"+this.id+"\t"+this.name+"\t"+this.designation+"\t"+this.experiance+"\t"+this.salary+"\n");
	}
	/**
	This is a setter method which sets the name of the employee
	@param name Name of the employee
	*/
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	This is a setter method which sets the designation of the employee
	@param designation Designation of the employee
	*/
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	/**
	This is a setter method which sets the year of experiance of the employee
	@param experiance Year of experiance of the employee
	*/
	public void setExperiance(int experiance)
	{
		this.experiance=experiance;
	}
	/**
	This is a setter method which sets the salary of the employee
	@param salary Salary of the employee
	*/
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	/**
	A getter method to get the ID of the employee
	@return id ID of the employee
	*/
	public int getId()
	{
		return this.id;
	}
	/**
	A getter method to get the name of the employee
	@return name Name of the employee
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	A getter method to get the Designation of the employee
	@return designation Designation of the employee
	*/
	public String getDesignation()
	{
		return this.designation;
	}
	/**
	A getter method to get the Salary of the employee
	@return salary Salary of the employee
	*/
	public float getSalary()
	{
		return this.salary;
	}
}