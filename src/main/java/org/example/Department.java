package org.example;

public class Department {
    private int depId;
    private String depName;

    public Department(int depId, String depName) {
        this.depId = depId;
        this.depName = depName;
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
    public void depDisplay() {
        System.out.println("-----DEPARTMAN  BİLGİLERİ-----");
        System.out.println("Departman Id : " + depId);
        System.out.println("Departman Adı : " + depName);
    }

    public static class Employess {
        private int empId;
        private String empName;
        private String empSurname;
        private String empPosition;
        private double empSalary;

        public Employess(int empId, String empName, String empSurname, String empPosition, double empSalary) {
            this.empId = empId;
            this.empName = empName;
            this.empSurname = empSurname;
            this.empPosition = empPosition;
            this.empSalary = empSalary;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getEmpSurname() {
            return empSurname;
        }

        public void setEmpSurname(String empSurname) {
            this.empSurname = empSurname;
        }

        public String getEmpPosition() {
            return empPosition;
        }

        public void setEmpPosition(String empPosition) {
            this.empPosition = empPosition;
        }

        public double getEmpSalary() {
            return empSalary;
        }

        public void setEmpSalary(double empSalary) {
            this.empSalary = empSalary;
        }

        public void empDisplay() {
            System.out.println("-----PERSONEL BİLGİLERİ-----");
            System.out.println("Personel Id : " + empId);
            System.out.println("Personel Adı : " + empName);
            System.out.println("Personel Soyadı : " + empSurname);
            System.out.println("Personel Pozisyonu : " + empPosition);
            System.out.println("Personel Maaşı : " + empSalary);
        }
    }
}