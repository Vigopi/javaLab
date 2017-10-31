/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author G.Vinothgopi
 */
public class CommissionEmployee extends Employee
{
    private int noOfDaysWorked;
    private double commissionPerDay;

    public CommissionEmployee() {
    }

    public CommissionEmployee(int noOfDaysWorked, double commissionPerDay, int id, String name) {
        super(id, name);
        this.noOfDaysWorked = noOfDaysWorked;
        this.commissionPerDay = commissionPerDay;
    }

    public double getCommissionPerDay() {
        return commissionPerDay;
    }

    public void setCommissionPerDay(double commissionPerDay) {
        this.commissionPerDay = commissionPerDay;
    }

    public int getNoOfDaysWorked() {
        return noOfDaysWorked;
    }

    public void setNoOfDaysWorked(int noOfDaysWorked) {
        this.noOfDaysWorked = noOfDaysWorked;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "noOfDaysWorked=" + noOfDaysWorked + ", commissionPerDay=" + commissionPerDay + '}';
    }
    
    @Override
    public double calculateSalary()
    {
        double sal=noOfDaysWorked*commissionPerDay;
        super.setSalary(sal);
        return sal;
    }
}