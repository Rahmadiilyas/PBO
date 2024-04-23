package test;

import paket8.BangunDatar;
import paketInterface.MyInterface;

public class BangunDatarPersegi extends BangunDatar implements MyInterface{
    private double sisi;

    // Constructor
    public BangunDatarPersegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
    public void info() {
        System.out.println("Ini adalah superclass bangun datar");
    }

    @Override
    public String getStringInfoState() {
        String info = "Lulus Pbo";
        return info;
    }
}

    

