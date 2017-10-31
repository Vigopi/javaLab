/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author G.Vinothgopi
 */
public class PermanentEmployee extends Employee
{
    private int experience;
    private double basicPay;
    private int hra;
    private double incrementPerYear;

    /**
     *
     */
    public PermanentEmployee() {
    }

    /**
     *
     * @param experience
     * @param basicPay
     * @param hra
     * @param incrementPerYear
     * @param id
     * @param name
     */
    public PermanentEmployee(int experience, double basicPay, int hra, double incrementPerYear, int id, String name) {
        super(id, name);
        this.experience = experience;
        this.basicPay = basicPay;
        this.hra = hra;
        this.incrementPerYear = incrementPerYear;
    }

    /**
     *
     * @return
     */
    public double getIncrementPerYear() {
        return incrementPerYear;
    }

    /**
     *
     * @param incrementPerYear
     */
    public void setIncrementPerYear(double incrementPerYear) {
        this.incrementPerYear = incrementPerYear;
    }

    /**
     *
     * @return
     */
    public int getExperience() {
        return experience;
    }

    /**
     *
     * @param experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     *
     * @return
     */
    public double getBasicPay() {
        return basicPay;
    }

    /**
     *
     * @param basicPay
     */
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    /**
     *
     * @return
     */
    public int getHra() {
        return hra;
    }

    /**
     *
     * @param hra
     */
    public void setHra(int hra) {
        this.hra = hra;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" + "experience=" + experience + ", basicPay=" + basicPay + ", hra=" + hra + ", incrementPerYear=" + incrementPerYear + '}';
    }
    
    @Override
    public double calculateSalary()
    {
        double sal=basicPay+hra+experience*incrementPerYear;
        super.setSalary(sal);
        return sal;
    }
}
