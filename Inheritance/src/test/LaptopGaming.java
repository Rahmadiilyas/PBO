
package test;

import paket3.Laptop;
import paketInterface.MyInterface;

public class LaptopGaming extends Laptop  implements MyInterface{

    private String jenis;

    // Constructor
    public LaptopGaming(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public LaptopGaming() {
        this.jenis = "ROG";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    public void show4() {
        System.out.println("Ini adalah sebuah laptop gaming");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
