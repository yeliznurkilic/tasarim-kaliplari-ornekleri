package com.example.designpatterns.yaratimsalKaliplar.builder.ornek11;

public class Ev {

    private final String sehir;      // zorunlu
    private final String ilce;       // zorunlu
    private final boolean havuz;     // opsiyonel
    private final int odaSayisi;     // opsiyonel

    // Constructor sadece Builder kullanır
    private Ev(EvBuilder builder) {
        this.sehir = builder.sehir;
        this.ilce = builder.ilce;
        this.havuz = builder.havuz;
        this.odaSayisi = builder.odaSayisi;
    }

    // ---------------- GETTER'LAR ----------------
    public String getSehir() {
        return sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public boolean isHavuz() {
        return havuz;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    @Override
    public String toString() {
        return "Ev {" +
                "sehir='" + sehir + '\'' +
                ", ilce='" + ilce + '\'' +
                ", havuz=" + havuz +
                ", odaSayisi=" + odaSayisi +
                '}';
    }

    // =============== BUILDER SINIFI ===============
    public static class EvBuilder {

        private final String sehir;
        private final String ilce;

        private boolean havuz = false;
        private int odaSayisi = 0;

        // Zorunlu parametreler constructor ile alınır
        public EvBuilder(String sehir, String ilce) {
            if (sehir == null || ilce == null) {
                throw new IllegalArgumentException("şehir ve ilçe boş olamaz");
            }
            this.sehir = sehir;
            this.ilce = ilce;
        }

        // Opsiyonel parametreler
        public EvBuilder havuz(boolean havuz) {
            this.havuz = havuz;
            return this;
        }

        public EvBuilder odaSayisi(int odaSayisi) {
            if (odaSayisi < 0) {
                throw new IllegalArgumentException("oda sayısı negatif olamaz");
            }
            this.odaSayisi = odaSayisi;
            return this;
        }

        public Ev build() {
            return new Ev(this);
        }
    }
}
