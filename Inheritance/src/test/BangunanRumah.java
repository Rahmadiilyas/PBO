
package test;

import paket9.bangunan;
import paketInterface.MyInterface;

public class BangunanRumah extends bangunan implements MyInterface{
    private String jenis;

    // Constructor
    public BangunanRumah(String jenis) {
        this.jenis = jenis;
    }

    public void infoBangunan(){
         System.out.println("ini adalah superclass bangunan");
    }
    // Overriding
    public void show() {
        System.out.println("Ini adalah sebuah rumah");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
       String info = "Lulus Pbo";
       return info;
    }
}



