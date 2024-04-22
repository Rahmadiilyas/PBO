
package test;

import paket9.bangunan;
import paketInterface.MyInterface;

public class BangunanRumah extends bangunan implements MyInterface{
    private String jenis;

    // Constructor
    public BangunanRumah(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public BangunanRumah() {
        this.jenis = "Kayu";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    public void infoBangunan() {
        System.out.println("Ini adalah sebuah rumah");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



