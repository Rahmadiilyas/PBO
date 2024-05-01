
package no4;

public class Ayam extends Hewan {
    private String warna; 
    
    Ayam(String nama, String spesies, String warna){
        super(nama, spesies);
        this.warna=warna;
    }

    @Override
    public void bersuara() {
        System.out.println("Ayam "+nama+" Spesies "+spesies+" Warna "+warna+" Bersuara titiroko");
    }
}
