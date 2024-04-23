
package test;
import paket7.Kendaraan;
import paketInterface.MyInterface;

public class KendaraanDarat extends Kendaraan implements MyInterface{

    private String jenis;

    // Constructor
    public KendaraanDarat(String jenis) {
        this.jenis = jenis;
    }

    // Overriding
    public void show3() {
        System.out.println("Ini adalah sebuah kendaraan darat");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        String info = "Lulus Pbo";
        return info;
    }
}

