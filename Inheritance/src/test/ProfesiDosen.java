
package test;

import paket4.Profesi;
import paketInterface.MyInterface;

public class ProfesiDosen extends Profesi implements MyInterface{
    private String jenis;

    // Constructor
    public ProfesiDosen(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public ProfesiDosen() {
        this.jenis = "Dosen Tetap";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    public void info5() {
        System.out.println("Ini adalah sebuah profesi dosen");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

