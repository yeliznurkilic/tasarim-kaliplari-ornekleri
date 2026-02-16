package com.example.designpatterns.yaratimsalKaliplar.builder.ornek1;

public class House {

    // --- Özellikler ---
    private int odaSayisi;
    private int katSayisi;
    private boolean balkon;
    private boolean havuz;
    private boolean garaj;
    private boolean bahce;

    // Constructor sadece Builder kullanarak oluşturulabilir
    private House(Builder builder) {
        this.odaSayisi = builder.odaSayisi;
        this.katSayisi = builder.katSayisi;
        this.balkon = builder.balkon;
        this.havuz = builder.havuz;
        this.garaj = builder.garaj;
        this.bahce = builder.bahce;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public boolean isHavuz() {
        return havuz;
    }

    public boolean isGaraj() {
        return garaj;
    }

    public boolean isBahce() {
        return bahce;
    }

    // --- BUILDER SINIFI ---
    public static class Builder {

        private int odaSayisi;
        private int katSayisi;
        private boolean balkon;
        private boolean havuz;
        private boolean garaj;
        private boolean bahce;

        public Builder odaSayisi(int odaSayisi) {
            this.odaSayisi = odaSayisi;
            return this;
        }

        public Builder katSayisi(int katSayisi) {
            this.katSayisi = katSayisi;
            return this;
        }

        public Builder balkon(boolean balkon) {
            this.balkon = balkon;
            return this;
        }

        public Builder havuz(boolean havuz) {
            this.havuz = havuz;
            return this;
        }

        public Builder garaj(boolean garaj) {
            this.garaj = garaj;
            return this;
        }

        public Builder bahce(boolean bahce) {
            this.bahce = bahce;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    // --- Opsiyonel: Bilgileri göstermek için ---
    @Override
    public String toString() {
        return "House {" +
                "odaSayisi=" + odaSayisi +
                ", katSayisi=" + katSayisi +
                ", balkon=" + balkon +
                ", havuz=" + havuz +
                ", garaj=" + garaj +
                ", bahce=" + bahce +
                '}';
    }
}
