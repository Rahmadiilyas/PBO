
package test;

import paket10.Sekolah;
import paketInterface.MyInterface;

public class SekolahNegeri extends Sekolah implements MyInterface{

    private String jenis;

    // Constructor
    public SekolahNegeri(String jenis) {
        this.jenis = jenis;
    }
    @Override
    public void show(){
        System.out.println("ini adalah superclass Sekolah");
    }

    public void info6() {
        System.out.println("Ini adalah sekolah negeri");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        String info = "Lulus Pbo";
        return info;
         }
}
