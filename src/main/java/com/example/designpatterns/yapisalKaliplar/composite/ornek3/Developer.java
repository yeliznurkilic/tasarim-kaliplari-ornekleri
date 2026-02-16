package com.example.designpatterns.yapisalKaliplar.composite.ornek3;

public class Developer implements TeamMember {
    private String name;
    private String skillSet;

    public Developer(String name, String skillSet) {
        this.name = name;
        this.skillSet = skillSet;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Skill Set: " + skillSet);
    }
}
