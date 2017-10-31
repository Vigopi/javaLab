import employee.CommissionEmployee;
import employee.Employee;
import employee.PermanentEmployee;
import java.util.Scanner;
/**
 *
 * @author G.Vinothgopi
 */

public class MyEmployeeApp {
    public static void main(String [] args)
    {
                Employee emp1 = null;
                Scanner scan=new Scanner(System.in);
                int id,days,experiance,hra;
                double basicPay,increment,commission;
                String name;
                int choice;
                do
                {
                    System.out.println("-----------------------------");
                    System.out.println("|\t 1 - Permanent Employee  |");
                    System.out.println("|\t 2 - Commission Employee |");
                    System.out.println("|\t Any other key to Exit \n");
                    System.out.println("-----------------------------");
                    System.out.print("\tEnter the choice : ");
                    choice=scan.nextInt();
                    switch(choice)
                    {
                        case 1:
                            System.out.print(" Enter the ID of employee : ");
                            id=scan.nextInt();
                            System.out.print(" Enter name : ");
                            name=scan.next();
                            System.out.print(" Enter the experiance : ");
                            experiance=scan.nextInt();
                            System.out.print(" Enter the basic pay : ");
                            basicPay=scan.nextDouble();
                            System.out.print(" Enter the HRA : ");
                            hra=scan.nextInt();
                            System.out.print(" Enter the increment per year : ");
                            increment=scan.nextDouble();
                            emp1=new PermanentEmployee(experiance,basicPay,hra,increment,id,name);
                            break;
                        case 2:
                             System.out.print(" Enter the ID of employee : ");
                             id=scan.nextInt();
                             System.out.print(" Enter name : ");
                             name=scan.next();
                             System.out.print(" Enter the number of days worked : ");
                             days=scan.nextInt();
                             System.out.println("Enter the commission per day : ");
                             commission=scan.nextDouble();
                             emp1=new CommissionEmployee(days, commission, id, name);
                             break;
                    }
                    if(emp1!=null)
                    {
			System.out.println(" Salary is : "+emp1.calculateSalary());
			if(emp1 instanceof PermanentEmployee)
			{
                            PermanentEmployee pEmp1=(PermanentEmployee)emp1;
                            System.out.print(" The basic pay of the employee is "+pEmp1.getBasicPay());
                            System.out.println(" The experience of the employee is "+pEmp1.getExperience());
			}
			else if(emp1 instanceof CommissionEmployee)
			{
                            CommissionEmployee cEmp1=(CommissionEmployee)emp1;
                            System.out.println(" The commission of the employee is "+cEmp1.getCommissionPerDay());
			}
                    }
                    emp1=null;			
                }while(choice==1 || choice==2);
                System.out.print("\n Exiting ");
                System.out.println("\n ----------- THANK YOU ------------");
    }
}