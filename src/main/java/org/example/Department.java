package org.example;

public class Department {
    private int depId;
    private String depName;

    public Department() {
    }

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

    public void displayData() {
        System.out.println("-----DEPARTMAN BİLGİLERİ-----");
        System.out.println("Departman Id : " + depId);
        System.out.println("Departman Adı : " + depName);
    }
}