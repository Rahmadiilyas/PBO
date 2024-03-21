package praktikum3;

import java.util.Stack;

public class no1 {

    public static void main(String[] args) {
        // Membuat tumpukan (stack) data yang berisi bilangan desimal (Double)
        Stack<Double> data = new Stack<>();

        // Menambahkan elemen-elemen ke dalam tumpukan
        data.push(91.35);
        data.push(4.72);
        data.push(26.0);
        data.push(3.5);
        data.push(8.0);
        data.push(61.0);
        data.push(65.36);
        data.push(12.0);
        data.push(5.6);
        data.push(7.11);
        data.push(27.0);
        data.push(9.53);
        data.push(549.0);
        data.push(2.23);
        data.push(17.31);
        data.push(4.25);
        data.push(2.13);
        data.push(83.0);
        data.push(7.0);
        data.push(102.4);
        data.push(53.21);
        data.push(3.42);
        data.push(0.21);
        data.push(70.02);
        data.push(819.4);
        data.push(6173.0);
        data.push(4.25);
        data.push(19.8);
        data.push(17.35);
        data.push(5.768);

        // Inisialisasi variabel untuk nilai minimum, maksimum, dan jumlah
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;

        // Menyimpan ukuran tumpukan sebelum mulai mengeluarkan elemen-elemennya
        int size = data.size(); 

        // Mengambil dan memproses setiap elemen dari tumpukan sampai tumpukan kosong
        while (!data.isEmpty()) {
            double value = data.pop(); // Mengambil elemen teratas dari tumpukan

            // Memperbarui nilai minimum jika nilai yang diambil lebih kecil dari nilai minimum sebelumnya
            if (value < min) {
                min = value;
            }
            // Memperbarui nilai maksimum jika nilai yang diambil lebih besar dari nilai maksimum sebelumnya
            if (value > max) {
                max = value;
            }
            sum += value; // Menambahkan nilai yang diambil ke dalam jumlah
        }

        // Menghitung rata-rata dari semua nilai dalam tumpukan
        double average = sum / size; 

        // Menampilkan hasil
        System.out.println("Min     : " + min);
        System.out.println("Max     : " + max);
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
    }
}
