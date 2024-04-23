
package test;

import paket6.Mobil;
import paketInterface.MyInterface;

public class MobilBMW extends Mobil implements MyInterface{

    private String jenis;

    // Constructor
    public MobilBMW(String jenis) {
        this.jenis = jenis;
    }

   

    
    // Overriding
    @Override
    public void info2() {
        System.out.println("Ini adalah sebuah mobil BMW");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        String info = "Lulus Pbo";
        return info;
}

}