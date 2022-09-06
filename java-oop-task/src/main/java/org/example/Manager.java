package org.example;

public class Manager extends Employee implements IManager{


    public Manager(int i, String john, String murphy, int i1, int i2, String test) {
        super(1, "John", "Murphy", 45, 10000, "Test");
    }

    // A Manager has numberOfEmployeesSupervised attribute additionally.
    void numberOfEmployeesSupervised(){}


    // Please implement necessary methods to get and set these attributes of Manager


    @java.lang.Override
    public double getSalary() {
        return super.getSalary();
    }
    @java.lang.Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @java.lang.Override
    public String getDepartment() {
        return super.getDepartment();
    }
    @java.lang.Override
    public void setDepartment(String department) {
        super.setDepartment(department);
    }
    @java.lang.Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @java.lang.Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void takeABreak() {
        
    }

    @Override
    public void increaseSalary(SoftwareDeveloper softwareDeveloper1, int i) {

    }

    @Override
    public void hireEmployee(Employee newEmployee) {

    }

    @Override
    public void fireEmployee() {

    }

    @Override
    public void getNumberOfEmployeesSupervised() {

    }

    public void hireEmployee(SoftwareDeveloper newSoftwareDeveloper) {
    }

    public void fireEmployee(SoftwareDeveloper newSoftwareDeveloper) {
    }
}
