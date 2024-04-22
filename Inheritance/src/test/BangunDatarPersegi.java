package test;

import paket8.BangunDatar;
import paketInterface.MyInterface;

public class BangunDatarPersegi extends BangunDatar implements MyInterface{
    private double sisi;

    // Constructor
    public BangunDatarPersegi(double sisi) {
        this.sisi = sisi;
    }

    // Overloading Constructor
    public BangunDatarPersegi() {
        this.sisi = 0;
    }

    // Getter dan Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public void info() {
        System.out.println("Ini adalah superclass bangun datar");
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    

