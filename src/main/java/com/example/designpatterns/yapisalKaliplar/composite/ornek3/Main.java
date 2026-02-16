package com.example.designpatterns.yapisalKaliplar.composite.ornek3;

public class Main {
    public static void main(String[] args) {

        // Developer ve Manager oluştur
        TeamMember developer1 = new Developer("John", "Java, Spring");
        TeamMember developer2 = new Developer("Alice", "JavaScript, React");
        TeamMember manager1 = new Manager("Bob", "Engineering");

        // Takım oluştur
        Team team = new Team();

        // Takım üyelerini ekle
        team.addMember(developer1);
        team.addMember(developer2);
        team.addMember(manager1);

        // Takımı görüntüle
        team.showDetails();

        System.out.println("\nRemoving Alice from the team...\n");

        // Alice'yi takımdan çıkar
        team.removeMember(developer2);

        // Güncel takımı görüntüle
        team.showDetails();
    }
}
