package no4;
public class Sapi extends Hewan {
    private String warna; 
    
    Sapi(String nama, String spesies, String warna){
        super(nama, spesies);
        this.warna=warna;
    }

    @Override
    public void bersuara() {
        System.out.println("Sapi "+nama+" Spesies "+spesies+" Warna "+warna+" Bersuara mooooooooooooooooooooooooooo");
    }
}
