package org.example;

public interface IManager {
    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods
    public void increaseSalary(SoftwareDeveloper softwareDeveloper1, int i);
    public void hireEmployee(Employee newEmployee);
    public void fireEmployee();
    public void getNumberOfEmployeesSupervised();
}
