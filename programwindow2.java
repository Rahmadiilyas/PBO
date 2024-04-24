package fosalgo;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Deklarasi kelas ProgramWindow02 yang merupakan turunan dari kelas Thread
public class ProgramWindow02 extends Thread {

    // Deklarasi objek yourpanel dan variabel running
    yourpanel panel;
    volatile boolean running = true;
    Thread thread;

    // Konstruktor ProgramWindow02
    public ProgramWindow02() {
        // Inisialisasi objek yourpanel dan thread
        panel = new yourpanel();
        thread = new Thread(this);
        // Memulai thread
        thread.start();
    }

    // Metode main
    public static void main(String[] args) {
        // Membuat objek ProgramWindow02
        ProgramWindow02 wo3 = new ProgramWindow02();
        // Membuat objek JFrame dengan judul "Ini judul window"
        JFrame jf = new JFrame("Ini judul window");

        // Menambahkan panel ke konten utama JFrame
        jf.getContentPane().add(wo3.panel);

        // Mengatur ukuran JFrame menjadi 500x400 piksel
        jf.setSize(500, 400);
        // Menempatkan JFrame di tengah layar
        jf.setLocationRelativeTo(null);
        // Mengatur operasi penutupan default menjadi keluar dari aplikasi saat tombol close ditekan
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Menampilkan JFrame ke layar
        jf.setVisible(true);
    }

    // Metode run yang dijalankan oleh thread
    @Override
    public void run() {
        while (running) {
            // Memperbarui panel, menggambar ulang, dan memberikan jeda
            panel.update();
            panel.repaint();
            panel.delay(100);
        }
    }
}
