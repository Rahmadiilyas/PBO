package no4;

public class Kucing extends Hewan {
    private String warna; 
    
    Kucing(String nama, String spesies, String warna){
        super(nama, spesies);
        this.warna=warna;
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing "+nama+" Spesies "+spesies+" Warna "+warna+" Bersuara meawww");
    }
    
}
