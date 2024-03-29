package praktikum4; // Mendefinisikan package praktikum4

import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util

public class no4 { // Mendefinisikan kelas no4
    // Mendefinisikan kelas dalam kelas (nested class) Staticfield
    public static class Staticfield {
        // Static field
        public static int nilaiStatic; // Mendefinisikan static field nilaiStatic

        // Static method
        public static void methodStatic() { // Mendefinisikan static method methodStatic
            System.out.println("Ini adalah metode statis dari Kelas Static"); // Menampilkan pesan
        }
    }

    public static void main(String[] args) { // Mendefinisikan method main
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna

        System.out.print("Masukkan nilai untuk static field: "); // Menampilkan pesan meminta pengguna untuk memasukkan nilai
        // Menerima input dari pengguna
        int nilai = scanner.nextInt(); // Menyimpan nilai yang dimasukkan pengguna ke dalam variabel nilai

        Staticfield.nilaiStatic = nilai; // Mengatur nilai static field dengan nilai yang dimasukkan pengguna

        int nilaiField = Staticfield.nilaiStatic; // Mendapatkan nilai static field
        System.out.println("Nilai static field: " + nilaiField); // Menampilkan nilai static field

        // Memanggil static method tanpa melakukan operasi instan class
        Staticfield.methodStatic(); // Memanggil static method methodStatic dari kelas Staticfield

        // Menutup scanner
        scanner.close(); // Menutup objek Scanner
    }
}
