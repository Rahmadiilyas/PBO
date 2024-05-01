package polymorphism.no1;

public class Calculator {

    // Penjumlahan
    public int tambah(int a, int b) {
        return a + b;
    }

    public double tambah(double a, double b) {
        return a + b;
    }

    // Pengurangan
    public int kurang(int a, int b) {
        return a - b;
    }

    public double kurang(double a, double b) {
        return a - b;
    }

    // Perkalian
    public int kali(int a, int b) {
        return a * b;
    }

    public double kali(double a, double b) {
        return a * b;
    }

    // Pembagian
    public int bagi(int a, int b) {
        return a / b;
    }

    public double bagi(double a, double b) {
        return a / b;
    }

    // Modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    // Luas persegi
    public int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    public double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    public double luasTrapesium(double alas1, double alas2) {
        return 0.5 * alas1 * alas2;
    }

    public double luasTrapesium(int alas1, int alas2) {
        return 0.5 * alas1 * alas2;
    }

    public int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Luas lingkaran
    public double luasLingkaran(double radius) {
        return Math.PI * radius * radius;
    }

    public double luasLingkaran(int radius) {
        return Math.PI * radius * radius;
    }

    public double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public double luasSegitiga(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

}
