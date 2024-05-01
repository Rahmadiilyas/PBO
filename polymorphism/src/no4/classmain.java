package no4;

public class classmain {

    public static void main(String[] args) {

        
        Hewan[]hewan = new Hewan[10];

        hewan[0] = new Kucing("Garfield", "Kucing Persia", "Oren");
        hewan[1] = new Kucing("Tom", "Domestik", "Hitam Putih");
        hewan[2] = new Ayam("Lucky", "Golden Retriever", "Emas");
        hewan[3] = new Ayam("Spike", "Bulldog", "Coklat");
        hewan[4] = new Burung("Tweety", "Kenari", "Kuning");
        hewan[5] = new Burung("Micky", "Merak", "Biru");
        hewan[6] = new Kelinci("Nemo", "Badut", "Oren Putih");
        hewan[7] = new Kelinci("Dory", "Tang", "Biru");
        hewan[8] = new Sapi("Luna", "Anggora", "Putih");
        hewan[9] = new Sapi("Snoopy", "Beagle", "Coklat Putih");

        for (Hewan h : hewan) {
            h.bersuara();

        }
        for (int i = 0; i < hewan.length; i++) {
            System.out.println(i);
            
        }
    }
}
