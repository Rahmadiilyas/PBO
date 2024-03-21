package praktikum3;

import java.util.LinkedList;
import java.util.Queue;

public class no2 {

    public static void main(String[] args) {
        // Membuat objek Queue menggunakan LinkedList untuk menyimpan data nilai
        Queue<Double> data = new LinkedList<>();
        
        // Array nilai yang akan dimasukkan ke dalam Queue
        double[] nilai = {91.35, 4.72, 26.0, 3.5, 8.0, 61.0, 65.36, 12.0, 5.6, 7.11,
            27.0, 9.53, 549.0, 2.23, 17.31, 4.25, 2.13, 83.0, 7.0, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173.0, 4.25, 19.8, 17.35, 5.768};

        // Variabel untuk menyimpan nilai minimum, maksimum, dan jumlah
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        
        // Memasukkan nilai ke dalam Queue
        for (int i = 0; i < nilai.length; i++) {
            data.offer(nilai[i]);
        }
        
        // Menghitung nilai minimum, maksimum, dan jumlah dari nilai dalam Queue
        for (double value : data) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            sum += value;
        }
        
        // Menghitung rata-rata nilai dalam Queue
        double average = sum / data.size();

        // Menampilkan hasil perhitungan
        System.out.println("Min     : " + min);
        System.out.println("Max     : " + max);
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
    }
}
