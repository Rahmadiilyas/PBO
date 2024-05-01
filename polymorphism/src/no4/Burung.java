package no4;
public class Burung extends Hewan {
    private String warna; 
    
    Burung(String nama, String spesies, String warna){
        super(nama, spesies);
        this.warna=warna;
    }

    @Override
    public void bersuara() {
        System.out.println("Burung "+nama+" Spesies "+spesies+" Warna "+warna+" Bersuara krikkk");
    }
}
