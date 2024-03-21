import java.util.LinkedList;
import java.util.Queue;

public class no2 {

    public static void main(String[] args) {
        // Membuat antrian (queue) data yang berisi bilangan desimal (Double)
        Queue<Double> data = new LinkedList<>();

        // Menambahkan elemen-elemen ke dalam antrian
        data.offer(91.35);
        data.offer(4.72);
        data.offer(26.0);
        data.offer(3.5);
        data.offer(8.0);
        data.offer(61.0);
        data.offer(65.36);
        data.offer(12.0);
        data.offer(5.6);
        data.offer(7.11);
        data.offer(27.0);
        data.offer(9.53);
        data.offer(549.0);
        data.offer(2.23);
        data.offer(4.25);
        data.offer(2.13);
        data.offer(83.0);
        data.offer(7.0);
        data.offer(102.4);
        data.offer(53.21);
        data.offer(3.42);
        data.offer(0.21);
        data.offer(70.02);
        data.offer(819.4);
        data.offer(6173.0);
        data.offer(4.25);
        data.offer(19.8);
        data.offer(17.35);
        data.offer(5.768);

        // Inisialisasi variabel untuk nilai minimum, maksimum, dan jumlah
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;

        // Menyimpan ukuran antrian sebelum mulai mengeluarkan elemen-elemennya
        int size = data.size(); 

        // Mengambil dan memproses setiap elemen dari antrian sampai antrian kosong
        while (!data.isEmpty()) {
            double value = data.poll(); // Mengambil elemen depan dari antrian

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

        // Menghitung rata-rata dari semua nilai dalam antrian
        double average = sum / size; 

        // Menampilkan hasil
        System.out.println("Min     : " + min);
        System.out.println("Max     : " + max);
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
    }
}
