package com.example.designpatterns.yapisalKaliplar.composite.ornek2;

public class Main {
    public static void main(String[] args) {

        // Günler
        TakvimOgesi pazartesi = new Gun("Pazartesi");
        TakvimOgesi sali = new Gun("Salı");
        TakvimOgesi carsamba = new Gun("Çarşamba");
        TakvimOgesi persembe = new Gun("Perşembe");
        TakvimOgesi cuma = new Gun("Cuma");
        TakvimOgesi cumartesi = new Gun("Cumartesi");
        TakvimOgesi pazar = new Gun("Pazar");

        // Hafta 1 (Pazartesi - Pazar)
        Hafta hafta1 = new Hafta();
        hafta1.addDay(pazartesi);
        hafta1.addDay(sali);
        hafta1.addDay(carsamba);
        hafta1.addDay(persembe);
        hafta1.addDay(cuma);
        hafta1.addDay(cumartesi);
        hafta1.addDay(pazar);

        // Hafta 2 (Pazartesi - Pazar)
        TakvimOgesi pazartesi2 = new Gun("Pazartesi");
        TakvimOgesi sali2 = new Gun("Salı");
        Hafta hafta2 = new Hafta();
        hafta2.addDay(pazartesi2);
        hafta2.addDay(sali2);
        // Diğer günleri de ekleyebilirsiniz...

        // Ay (İçinde Haftalar olacak)
        Ay ay = new Ay();
        ay.addHafta(hafta1);
        ay.addHafta(hafta2); // Eğer daha fazla hafta eklemek isterseniz buraya ekleyebilirsiniz.

        // Takvimi Görüntüle
        ay.goruntule();
    }
}
