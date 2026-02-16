package com.example.designpatterns.yaratimsalKaliplar.builder.ornek2;
public class Pizza {

    private String hamurTipi;
    private String boy;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    // Constructor sadece Builder ile çalışsın
    private Pizza(Builder builder) {
        this.hamurTipi = builder.hamurTipi;
        this.boy = builder.boy;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
    }
    public String getHamurTipi() {
        return hamurTipi;
    }

    public String getBoy() {
        return boy;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isBacon() {
        return bacon;
    }




    @Override
    public String toString() {
        return "Pizza {" +
                "hamurTipi='" + hamurTipi + '\'' +
                ", boy='" + boy + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                '}';
    }

    // ---- BUILDER SINIFI ----
    public static class Builder {

        private String hamurTipi;
        private String boy;
        private boolean cheese;
        private boolean pepperoni;
        private boolean bacon;

        public Builder hamurTipi(String hamurTipi) {
            this.hamurTipi = hamurTipi;
            return this;
        }

        public Builder boy(String boy) {
            this.boy = boy;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Builder bacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }


}
