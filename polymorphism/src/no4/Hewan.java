package no4;

public abstract class Hewan {

    public String nama;
    public String spesies;

    public Hewan(String nama, String spesies) {
        this.nama = nama;
        this.spesies = spesies;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesies() {
        return spesies;
    }

    public abstract void bersuara();
}
