package com.example.designpatterns.yaratimsalKaliplar.builder.ornek4;

public class User {

    // ---- ZORUNLU ALANLAR ----
    private final String kullaniciAdi;
    private final String email;

    // ---- OPSIYONEL ALANLAR ----
    private final String telefon;
    private final String adres;
    private final Integer yas;

    // Constructor sadece Builder tarafından çağrılır
    private User(Builder builder) {
        this.kullaniciAdi = builder.kullaniciAdi;
        this.email = builder.email;
        this.telefon = builder.telefon;
        this.adres = builder.adres;
        this.yas = builder.yas;
    }

    // ---------------- BUILDER SINIFI ----------------
    public static class Builder {

        // Zorunlu alanlar
        private final String kullaniciAdi;
        private final String email;

        // Opsiyonel alanlar
        private String telefon;
        private String adres;
        private Integer yas;

        // Zorunlu parametreler constructor’da
        public Builder(String kullaniciAdi, String email) {
            if (kullaniciAdi == null || email == null) {
                throw new IllegalArgumentException("Kullanıcı adı ve email boş olamaz.");
            }
            this.kullaniciAdi = kullaniciAdi;
            this.email = email;
        }

        // Opsiyonel alanlar set metotları
        public Builder telefon(String telefon) {
            this.telefon = telefon;
            return this;
        }

        public Builder adres(String adres) {
            this.adres = adres;
            return this;
        }

        public Builder yas(int yas) {
            if (yas < 0) {
                throw new IllegalArgumentException("Yaş negatif olamaz.");
            }
            this.yas = yas;
            return this;
        }

        // --- asıl nesneyi oluşturan method ---
        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "kullaniciAdi='" + kullaniciAdi + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                ", yas=" + yas +
                '}';
    }
}
