
package test;

import paket3.Laptop;
import paketInterface.MyInterface;

public class LaptopGaming extends Laptop  implements MyInterface{

    private String jenis;

    // Constructor
    public LaptopGaming(String jenis) {
        this.jenis = jenis;
    }


    // Overriding
    public void show4() {
        System.out.println("Ini adalah sebuah laptop gaming");
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String getStringInfoState() {
        String info = "Lulus Pbo";
        return info;
    }
}
