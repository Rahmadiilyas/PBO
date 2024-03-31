package praktikum4;

import java.util.ArrayList;

public class Nomor5 {

    public static class Kotak {

        private String warna;
        private double panjang;
        private double lebar;

        public Kotak(String warna, double panjang, double lebar) {
            this.warna = warna;
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public Kotak(double panjang, double lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public void setWarna(String warna) {
            this.warna = warna;
        }

        public void setPanjang(double panjang) {
            this.panjang = panjang;
        }

        public void setLebar(double lebar) {
            this.lebar = lebar;
        }

        public double getKeliling() {
            return 2 * (panjang + lebar);
        }

        public double getLuas() {
            return panjang * lebar;
        }

        @Override
        public String toString() {
            return "KOTAK: warna= " + warna
                    + ", panjang= " + panjang
                    + ", lebar= " + lebar
                    + ", luas= " + getLuas()
                    + ", keliling= " + getKeliling();
        }

        public static void main(String[] args) {
            // Membuat ArrayList bertipe Generik dari class Kotak
            ArrayList<Kotak> arrayListKotak = new ArrayList<>();

            arrayListKotak.add(new Kotak("Merah", 5, 3));//0
            arrayListKotak.add(new Kotak("Biru", 4, 4));//1
            arrayListKotak.add(new Kotak("Hijau", 6, 2));//2

 
            arrayListKotak.get(0).setPanjang(10); // Mengubah panjang Kotak pertama
            arrayListKotak.get(1).setLebar(6);    // Mengubah lebar Kotak kedua
            arrayListKotak.get(2).setWarna("Kuning"); // Mengubah warna Kotak ketiga

            System.out.println(arrayListKotak.get(0).toString());
            System.out.println(arrayListKotak.get(1).toString());
            System.out.println(arrayListKotak.get(2).toString());
        }
    }
}
