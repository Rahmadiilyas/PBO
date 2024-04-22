
package test;

import paket6.Mobil;
import paketInterface.MyInterface;

public class MobilBMW extends Mobil implements MyInterface{

    private String jenis;

    // Constructor
    public MobilBMW(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public MobilBMW() {
        this.jenis = "Seri 7";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    public void info2() {
        System.out.println("Ini adalah sebuah mobil BMW");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

