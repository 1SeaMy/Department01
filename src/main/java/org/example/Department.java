package org.example;

public class Department {
    private int depId;
    private String depName;
    private Employees employees;

    public Department() {
    }

    public Department(int depId, String depName, Employees employees) {
        this.depId = depId;
        this.depName = depName;
        this.employees = employees;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public void depDisplay() {
        System.out.println("-----DEPARTMAN  BİLGİLERİ-----");
        System.out.println("Departman Id : " + depId);
        System.out.println("Departman Adı : " + depName);
    }
}