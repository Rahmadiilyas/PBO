package praktikum4;
import java.util.Scanner;

public class no4 {
    public static class Staticfield {
        // Static field
        public static int nilaiStatic;

        // Static method
        public static void methodStatic() {
            System.out.println("Ini adalah metode statis dari Kelas Static");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai untuk static field: ");
        // Menerima input dari pengguna
        int nilai = scanner.nextInt();

        Staticfield.nilaiStatic = nilai;

        int nilaiField = Staticfield.nilaiStatic;
        System.out.println("Nilai static field: " + nilaiField);

        // Memanggil static method tanpa melakukan operasi instan class
        Staticfield.methodStatic();

        // Menutup scanner
        scanner.close();
    }
}
