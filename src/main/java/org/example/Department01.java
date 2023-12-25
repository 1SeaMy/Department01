package org.example;

import java.util.LinkedList;

public class Department01 {
    private String name;
    private LinkedList<String> employees;

    public Department01(String name, LinkedList<String> employees) {
        this.name = name;
        this.employees = employees;
    }

    public LinkedList<String> getEmployees() {
        return employees;
    }
    public static void main(String[] args) {
        LinkedList<String> accountingEmployees = new LinkedList<>();
        accountingEmployees.add("Ayşe Can");
        accountingEmployees.add("Ali Kara");
        accountingEmployees.add("Fatma Gül");
        accountingEmployees.add("Veli Şen");

        Department01 accountingDepartment01 = new Department01("Muhasebe", accountingEmployees);

        LinkedList<String> employees = accountingDepartment01.getEmployees();
        System.out.print(accountingDepartment01.name + " Departmanı Personelleri:\n");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}