package com.example.designpatterns.yapisalKaliplar.composite.ornek3;

public class Manager implements TeamMember {
    private String name;
    private String department;

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void showDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
    }
}
