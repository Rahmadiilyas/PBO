
package test;

import paket10.Sekolah;
import paketInterface.MyInterface;

public class SekolahNegeri extends Sekolah implements MyInterface{

    private String jenis;

    // Constructor
    public SekolahNegeri(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public SekolahNegeri() {
        this.jenis = "SMK";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    public void info6() {
        System.out.println("Ini adalah sekolah negeri");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
