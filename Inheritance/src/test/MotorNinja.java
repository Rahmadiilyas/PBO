
package test;

import paket5.Motor;
import paketInterface.MyInterface;

public class MotorNinja extends Motor implements MyInterface{
    private String jenis;

    // Constructor
    public MotorNinja(String jenis) {
        this.jenis = jenis;
    }

    // Overloading constructor
    public MotorNinja() {
        this.jenis = "Sport Bike";
    }

    // Getter dan setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Overriding
    public void info4() {
        System.out.println("Ini adalah sebuah motor Ninja");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

