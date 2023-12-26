package org.example;

public class Main {
    public static void main(String[] args) {
        Department department01=new Department(1, "Muhasebe");
        Department.Employess employees01=new Department.Employess(1, "Ayşe", "Can", "Muhasebe Müdürü", 50000);

        department01.depDisplay();
        employees01.empDisplay();
        System.out.println("------------------------------");
        employees01.setEmpSurname("Canan");
        System.out.println("Güncellenen veri :\n "+ employees01.getEmpId() + ". personelin Soyadı: " +employees01.getEmpSurname());

    }
}