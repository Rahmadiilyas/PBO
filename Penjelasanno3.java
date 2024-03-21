package praktikum3;

import java.util.Scanner;
import java.util.Stack;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk masukan pengguna
        String sc = input.nextLine(); // Membaca baris masukan dari pengguna
        Stack mystack = new Stack(); // Membuat tumpukan (stack) untuk menyimpan karakter

        // Memasukkan setiap karakter dari string masukan ke dalam tumpukan
        for (char c : sc.toCharArray()) {
            mystack.push("" + c); // Konversi karakter ke dalam string sebelum dimasukkan ke dalam tumpukan
        }
       
        // Mengeluarkan dan mencetak karakter dari tumpukan sampai tumpukan kosong
        while (!mystack.isEmpty()) {
            System.out.print(mystack.pop()); // Mengeluarkan dan mencetak karakter teratas dari tumpukan
        }
        System.out.println(); // Mencetak baris kosong setelah mencetak semua karakter dari tumpukan
    }
}
