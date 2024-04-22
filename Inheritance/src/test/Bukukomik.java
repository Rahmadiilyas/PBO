
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


