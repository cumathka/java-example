package org.example;

import java.net.StandardSocketOptions;

public class Employee implements IEmployee{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private  String department;

    public Employee(int i, String max, String adams, int i1, int i2, String unknown) {
        super();
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    // Please implement necessary methods to get and set these attributes of employee
    // All methods should only print the name of the employee (Manager or SoftDev) and the name of the method.

    public void getSalaryPayment(){
        System.out.println("getSalaryPayment");
    }

    @Override
    public void takeABreak() {
        
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }
}
