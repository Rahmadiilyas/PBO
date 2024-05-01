package no4;
public class Kelinci extends Hewan {
    private String warna; 
    
    Kelinci(String nama, String spesies, String warna){
        super(nama, spesies);
        this.warna=warna;
    }

    @Override
    public void bersuara() {
        System.out.println("Kelinci "+nama+" Spesies "+spesies+" Warna "+warna+" Bersuara siiiiiiuuuuu");
    }
}
