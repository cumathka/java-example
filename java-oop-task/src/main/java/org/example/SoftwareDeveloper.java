package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{
    public SoftwareDeveloper(int id, String firstName, String lastName, int age, int salary, String department, Manager manager1, String selenium, int i) {
        super(id,firstName,lastName,age,salary,department);
    }

    // A Manager has Supervisor, skills, experience attribute additionally.

    private Manager Supervisor;
    private String skills;
    private String experience;

    @Override
    public void takeABreak() {

    }

    @Override
    public void writeCode() {
System.out.println("coe written bij : "+ this.getFirstName());
    }

    @Override
    public void testCode() {
        System.out.println("coe written bij : "+ this.getLastName());

    }

    @Override
    public void pushChanges() {

        System.out.println("coe written bij : "+ this.getFirstName());

    }

    // Please implement necessary methods to get and set these attributes of Manager

}
