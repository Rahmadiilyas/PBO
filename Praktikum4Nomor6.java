package praktikum4; // Mendefinisikan package praktikum4

import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util

public class no6 { // Mendefinisikan kelas no6

    public static void main(String[] args) { // Mendefinisikan method main
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna

        System.out.print("Masukkan n : "); // Menampilkan pesan meminta pengguna untuk memasukkan nilai n
        int n = input.nextInt(); // Menerima input dari pengguna dan menyimpannya dalam variabel n

        // Menampilkan bilangan Fibonacci ke-n dengan memanggil method fibonacci(n)
        System.out.println("Bilangan Fibonacci ke-" + n + " adalah: " + fibonacci(n));
    }

    // Method rekursif untuk menghitung bilangan Fibonacci ke-n
    public static int fibonacci(int n) {
        if (n <= 1) { // Basis kasus: jika n kurang dari atau sama dengan 1, kembalikan n
            return n;
        } else { // Jika n lebih besar dari 1, hitung nilai Fibonacci ke-(n-1) dan ke-(n-2), lalu jumlahkan keduanya
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
