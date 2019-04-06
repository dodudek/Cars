package pl.wszib.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Car {

    private String marka;
    private String model;
    private String rocznik;
    private double cena;
    private double przebieg;

    public String setMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String setModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String setRocznik() {
        return rocznik;
    }

    public void setRocznik(String rocznik) {
        this.rocznik = rocznik;
    }

    public double setCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double setPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(double przebieg) {
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getRocznik() {
        return rocznik;
    }

    public double getCena() {
        return cena;
    }

    public double getPrzebieg() {
        return przebieg;
    }
}
