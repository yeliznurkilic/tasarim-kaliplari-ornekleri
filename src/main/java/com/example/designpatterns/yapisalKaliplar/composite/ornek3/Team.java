package com.example.designpatterns.yapisalKaliplar.composite.ornek3;

import java.util.ArrayList;
import java.util.List;

public class Team implements TeamMember {
    private List<TeamMember> teamMembers = new ArrayList<>();

    // Takım üyesi ekle
    public void addMember(TeamMember member) {
        teamMembers.add(member);
    }

    // Takım üyesi çıkar
    public void removeMember(TeamMember member) {
        teamMembers.remove(member);
    }

    @Override
    public void showDetails() {
        System.out.println("Team Members:");
        for (TeamMember member : teamMembers) {
            member.showDetails();
        }
    }
}
