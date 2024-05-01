package polymorphism.no1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Menggunakan method tambah
        System.out.println("Hasil Penjumlahan (int): " + calculator.tambah(5, 3));
        System.out.println("Hasil Penjumlahan (double): " + calculator.tambah(5.5, 3.7));

        // Menggunakan method kurang
        System.out.println("Hasil Pengurangan (int): " + calculator.kurang(10, 4));
        System.out.println("Hasil Pengurangan (double): " + calculator.kurang(10.5, 4.2));

        // Menggunakan method kali
        System.out.println("Hasil Perkalian (int): " + calculator.kali(6, 8));
        System.out.println("Hasil Perkalian (double): " + calculator.kali(6.5, 8.2));

        // Menggunakan method bagi
        System.out.println("Hasil Pembagian (int): " + calculator.bagi(10, 2));
        System.out.println("Hasil Pembagian (double): " + calculator.bagi(10.5, 2.5));

        // Menggunakan method modulus
        System.out.println("Hasil Modulus (int): " + calculator.modulus(10, 3));
        System.out.println("Hasil Modulus (double): " + calculator.modulus(10.5, 3.2));

        // Menggunakan method luasPersegi
        System.out.println("Luas Persegi (int): " + calculator.luasPersegi(4));
        System.out.println("Luas Persegi (double): " + calculator.luasPersegi(4.5));

        // Menggunakan method luasPersegiPanjang
        System.out.println("Luas Persegi Panjang (int): " + calculator.luasPersegiPanjang(5, 3));
        System.out.println("Luas Persegi Panjang (double): " + calculator.luasPersegiPanjang(5.5, 3.5));

        // Menggunakan method luasLingkaran
        System.out.println("Luas Lingkaran (int): " + calculator.luasLingkaran(7));
        System.out.println("Luas Lingkaran (double): " + calculator.luasLingkaran(7.5));

        // Menggunakan method luasTrapesium
        System.out.println("Luas Trapesium (int): " + calculator.luasTrapesium(3, 4));
        System.out.println("Luas Trapesium (double): " + calculator.luasTrapesium(3.5, 4.5));

        // Menggunakan method luasSegitiga
        System.out.println("Luas Segitiga (int): " + calculator.luasSegitiga(6, 8));
        System.out.println("Luas Segitiga (double): " + calculator.luasSegitiga(6.5, 8.5));
    }
}
