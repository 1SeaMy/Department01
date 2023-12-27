package org.example;

public class Main {
    public static void main(String[] args) {
        Employees employees01=new Employees(1, "Ayşe", "Can", "Muhasebe Müdürü", 25, 55000);
        Employees employees02=new Employees(2, "Ali", "Kara", "Muhasebe Uzmanı", 30,45000);

        Department department01=new Department(1, "Muhasebe",employees02);

        department01.depDisplay();
        System.out.println("########################################################");
        employees01.empDisplay();
        System.out.println("--------------------------------------------------------");
        System.out.println("Güncellenecek veri : "+ employees01.getEmpId() + ". personelin Soyadı: " + employees01.getEmpSurname());
        employees01.setEmpSurname("Canan");
        System.out.println("Güncellenen veri   : "+ employees01.getEmpId() + ". personelin Soyadı: " + employees01.getEmpSurname());
        System.out.println("--------------------------------------------------------");
        employees01.empDisplay();
        System.out.println("########################################################");
        department01.getEmployees().empDisplay();
        System.out.println("--------------------------------------------------------");
        System.out.println("Güncellenecek veri : "+ department01.getEmployees().getEmpId() + ". personelin Maaşı: " + department01.getEmployees().getEmpSalary());
        department01.getEmployees().setEmpSalary(51000);
        System.out.println("Güncellenen veri   : "+ department01.getEmployees().getEmpId() + ". personelin Maaşı: " + department01.getEmployees().getEmpSalary());
        System.out.println("--------------------------------------------------------");
        department01.getEmployees().empDisplay();
        System.out.println("########################################################");
        department01.setEmployees(employees01);
        department01.getEmployees().empDisplay();
        System.out.println("--------------------------------------------------------");
        System.out.println("Güncellenecek veri : "+ department01.getEmployees().getEmpId() + ". personelin Maaşı: " + department01.getEmployees().getEmpSalary());
        department01.getEmployees().setEmpSalary(61000);
        System.out.println("Güncellenen veri   : "+ department01.getEmployees().getEmpId() + ". personelin Maaşı: " + department01.getEmployees().getEmpSalary());
        System.out.println("--------------------------------------------------------");
        department01.getEmployees().empDisplay();
        System.out.println("--------------------------------------------------------");
    }
}