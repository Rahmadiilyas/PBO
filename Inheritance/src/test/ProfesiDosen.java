
package test;

import paket4.Profesi;
import paketInterface.MyInterface;

public class ProfesiDosen extends Profesi implements MyInterface{
    private String jenis;

    // Constructor
    public ProfesiDosen(String jenis) {
        this.jenis = jenis;
    }

    // Overriding
    public void info5() {
        System.out.println("Ini adalah sebuah profesi dosen");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        String info = "Lulus Pbo";
        return info;
         }
}

