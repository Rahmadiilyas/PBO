
package test;
import paket1.Buku;

import paketInterface.MyInterface;
public class Bukukomik extends Buku implements MyInterface {
    private String jenis;

    // Constructor
    public Bukukomik(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public Bukukomik() {
        this.jenis = "Fantasi";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    @Override
    public void show() {
        System.out.println("Ini adalah sebuah komik");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
      String info = "Lulus Pbo";
        return info;
    }
}


