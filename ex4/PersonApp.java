import ex4.person.*;
import java.util.Scanner;
import static java.lang.System.out;
class PersonApp
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int ch,ch1;
		do
		{
			out.println("\t---------- Main Menu --------------");
			out.println("\t|  1	-	Student App 	 |");
			out.println("\t|  2	-	Employee App 	 |");
			out.println("\t|  3	-	Exit 		 |");
			out.println("\t-----------------------------------");
			out.print("\tEnter your choice : ");
			ch=scan.nextInt();
			if(ch==1)
			{	
				int year;
				String name,department;
				float cgpa;
				int size;
				out.print("Enter the number of students to add : ");
				size=scan.nextInt();
				Student []students=new Student[size];
				for(int i=0;i<students.length;i++)
				{
					out.println("\t-----------------------------------------------------");
					out.print("\tEnter the name of the student "+(i+1)+" : ");
					name=scan.next();
					out.print("\tEnter the department of the student "+(i+1)+" : ");
					department=scan.next();
					out.print("\tEnter the year of the study : ");
					year=scan.nextInt();
					out.print("\tEnter the cgpa of the student "+(i+1)+" : ");
					cgpa=scan.nextFloat();
					students[i]=new Student(name,department,year,cgpa);
					out.println("\t********  student "+(i+1)+" added  ********");
					out.println("\t-----------------------------------------------------\n");
				}
				do
				{
					out.println("\t----------------------- Student Menu -----------------------");
					out.println("\t|	1	-	Display all student details 	 			  |");
					out.println("\t|	2	-	Display the students of a department  	      |");
					out.println("\t|	3	-	Display the students with greater cgpa 		  |");
					out.println("\t|	4	-	Go to Main Menu						 		  |");
					out.println("\t------------------------------------------------------------");
					out.print("\tEnter your choice : ");
					ch1=scan.nextInt();
					if(ch1==1)
					{
						out.println("\tRoll no\tName\tDepartment\tYear\tCGPA\n");
						for(int i=0;i<students.length;i++)
							out.println(students[i]);
					}
					else if(ch1==2)
					{
						out.print("Ente the department : ");
						department=scan.next();
						out.println("\tRoll no\tName\tDepartment\tYear\tCGPA\n");
						for(int i=0;i<students.length;i++)
							if((students[i].getDepartment()).equals(department))
								out.println(students[i]);
					}
					else if(ch1==3)
					{
						out.print("Ente the CGPA : ");
						cgpa=scan.nextFloat();
						out.println("\tRoll no\tName\tDepartment\tYear\tCGPA\n");
						for(int i=0;i<students.length;i++)
							if(students[i].getCgpa()>=cgpa)
								out.println(students[i]);
					}
				}while(ch1!=4);
			}
			else if(ch==2)
			{
				int experiance;
				String name,designation;
				float salary;
				int size;
				out.print("Enter the number of employee to add : ");
				size=scan.nextInt();
				Employee []employee=new Employee[size];
				for(int i=0;i<employee.length;i++)
				{
					out.println("\t-----------------------------------------------------");
					out.print("\tEnter the name of the employee "+(i+1)+" : ");
					name=scan.next();
					out.print("\tEnter the designation of the employee "+(i+1)+" : ");
					designation=scan.next();
					out.print("\tEnter the experiance : ");
					experiance=scan.nextInt();
					out.print("\tEnter the salary : ");
					salary=scan.nextFloat();
					employee[i]=new Employee(name,designation,experiance,salary);
					out.println("\t********  employee "+(i+1)+" added  ********");
					out.println("\t-----------------------------------------------------\n");
				}
				do
				{
					out.println("\t----------------------- Employee Menu -----------------------");
					out.println("\t|	1	-	Display all employee details 	 			  |");
					out.println("\t|	2	-	Display the employee of a designation  	      |");
					out.println("\t|	3	-	Display the employee with greater salary 	  |");
					out.println("\t|	4	-	Go to Main Menu						 		  |");
					out.println("\t------------------------------------------------------------\n");
					out.print("\tEnter your choice : ");
					ch1=scan.nextInt();
					if(ch1==1)
					{
						out.println("\tId\tName\tDesignation\tExperiance\tSalary\n");
						for(int i=0;i<employee.length;i++)
							out.println(employee[i]);
					}
					else if(ch1==2)
					{
						out.print("Ente the designation : ");
						designation=scan.next();
						out.println("\tId\tName\tDesignation\tExperiance\tSalary\n");
						for(int i=0;i<employee.length;i++)
							if((employee[i].getDesignation()).equals(designation))
								out.println(employee[i]);
					}
					else if(ch1==3)
					{
						out.print("Ente the salary : ");
						salary=scan.nextFloat();
						out.println("\tId\tName\tDesignation\tExperiance\tSalary\n");
						for(int i=0;i<employee.length;i++)
							if((employee[i].getSalary())>=salary)
								out.println(employee[i]);
					}
				}while(ch1!=4);
			}
		}while(ch!=3);
		out.println("\t*********************** THANK YOU ***********************");
	}
}