
package test;
import paket7.Kendaraan;
import paketInterface.MyInterface;

public class KendaraanDarat extends Kendaraan implements MyInterface{

    private String jenis;

    // Constructor
    public KendaraanDarat(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public KendaraanDarat() {
        this.jenis = "Mobil";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    public void show3() {
        System.out.println("Ini adalah sebuah kendaraan darat");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

