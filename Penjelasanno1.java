package praktikum3;

import java.util.Stack;

public class no1 {

    public static void main(String[] args) {
        // Membuat objek stack untuk menyimpan nilai-nilai
        Stack<Double> data = new Stack<>();
        // Array nilai-nilai yang akan diolah
        double[] nilai = {91.35, 4.72, 26.0, 3.5, 8.0, 61.0, 65.36, 12.0, 5.6, 7.11,
            27.0, 9.53, 549.0, 2.23, 17.31, 4.25, 2.13, 83.0, 7.0, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173.0, 4.25, 19.8, 17.35, 5.768};

        // Variabel untuk menyimpan nilai minimum, maksimum, dan jumlah
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;

        // Menyimpan nilai-nilai ke dalam stack
        for (int i = 0; i < nilai.length; i++) {
            data.push(nilai[i]);
        }

        // Mengiterasi melalui nilai-nilai pada stack
        for (double value : data) {
            // Memeriksa dan memperbarui nilai minimum
            if (value < min) {
                min = value;
            }
            // Memeriksa dan memperbarui nilai maksimum
            if (value > max) {
                max = value;
            }
            // Menghitung jumlah semua nilai
            sum += value;
        }

        // Menghitung rata-rata dari semua nilai
        double average = sum / data.size();

        // Menampilkan hasil
        System.out.println("Min     : " + min);
        System.out.println("Max     : " + max);
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
    }
}
