
package test;

import paket2.Hewan;
import paketInterface.MyInterface;

public class HewanBertulangBelakang extends Hewan implements MyInterface{

    private String jenis;

    // Constructor
    public HewanBertulangBelakang(String jenis) {
        this.jenis = jenis;
    }

    
    // Overriding
    public void show1() {
        System.out.println("Ini adalah hewan bertulang belakang");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
       String info = "Lulus Pbo";
        return info;
    }
}


