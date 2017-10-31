package ex4.person;
/**
	A public class Student having the Student details
*/
public class Student
{
	private static int nextRoll=0;
	private int rollNo;
	private String name;
	private String department;
	private int year;
	private float cgpa;
	/**
		Default constructor which assigns the roll number of the student automaticcally
	*/
	public Student()
	{
		nextRoll++;
		this.rollNo=nextRoll;
	}
	/**
		Constructor which assigns the student details passed as arguments
		@param name Name of the student
		@param department Department of the student
		@param year Year of study
		@param cgpa CGPA of the student
	*/
	public Student(String name,String department,int year,float cgpa)
	{
		this();
		this.name=name;
		this.department=department;
		this.year=year;
		this.cgpa=cgpa;
	}
	/**
	This is a setter method which sets the name of the student
	@param name Name of the student
	*/
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	This is a setter method which sets the year of the student
	@param year Year of study of the student
	*/
	public void setYear(int year)
	{
		this.year=year;
	}
	/**
	This is a setter method which sets the department of the student
	@param department Department of the student
	*/
	public void setDepartment(String department)
	{
		this.department=department;
	}
	/**
	This is a setter method which sets the CGPA of the student
	@param cgpa CGPA of the student
	*/
	public void setCgpa(float cgpa)
	{
		this.cgpa=cgpa;
	}
	//Getter methods
	/**
	A getter method to get the roll number of the student
	@return rollNo roll number of the student
	*/
	public int getRollNo()
	{
		return this.rollNo;
	}
	/**
	A getter method to get the name of the student
	@return name Name of the student
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	A getter method to get the year of study of the student
	@return yaer year of study of the student
	*/
	public int getYear()
	{
		return this.year;
	}
	/**
	A getter method to get the department of the student
	@return department Department of the student
	*/
	public String getDepartment()
	{
		return this.department;
	}
	/**
	A getter method to get the CGPA of the student
	@return cgpa CGPA of the student
	*/
	public float getCgpa()
	{
		return this.cgpa;
	}
	/**
	to return the details of the student as string
	@return String having rollNo, name, department, year, CGPA of the student
	*/
	public String toString()
	{
		return("\t"+this.rollNo+"\t"+this.name+"\t"+this.department+"\t"+this.year+"\t"+this.cgpa+"\n");
	}
}