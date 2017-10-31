/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author G.Vinothgopi
 */
public abstract class Employee 
{
     private int id;
     private String name;
     private double salary;

     /**
     Default public constructor
     */
    public Employee() {
    }
    /**
    * Constructor initializes employee id and name
    * @param id Id of the employee
    * @param name Name of the employee
    */
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * Getter method to get the name of the employee
     * @return name 
     */
    public String getName() {
        return name;
    }
    /**
     * Setter method that sets the name of the employee
     * @param name Name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getter method to get the salary
     * @return salary 
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Setter method to set the salary of the employee
     * @param salary 
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    /**
     * getter method to get the id of the employee
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * Setter method to set the id of the employee
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * toString method to return the string having id, name, Salary of the employee
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }
    /**
     * Abstract method to calculate salary to be implemented in derived class 
     */
    abstract public double calculateSalary(); 
}
