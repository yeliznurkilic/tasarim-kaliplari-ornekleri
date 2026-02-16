package com.example.designpatterns.yaratimsalKaliplar.prototype.ornek2;

public class StudentCard implements Prototype{
    private String name;
    private String studentId;
    private String department;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public StudentCard(String name, String studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    @Override
    public Prototype clone() {
        return new StudentCard(name, studentId, department); // aynı değerlerle yeni obje
    }

    @Override
    public String toString() {
        return "StudentCard {" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
