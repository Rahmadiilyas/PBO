
package test;

import paket2.Hewan;
import paketInterface.MyInterface;

public class HewanBertulangBelakang extends Hewan implements MyInterface{

    private String jenis;

    // Constructor
    public HewanBertulangBelakang(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public HewanBertulangBelakang() {
        this.jenis = "Kucing";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    public void show1() {
        System.out.println("Ini adalah hewan bertulang belakang");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


