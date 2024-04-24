package no7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Mypanel extends JPanel implements Runnable {
    // Deklarasi variabel untuk koordinat awal objek
    int xo = 60, yo = 40;
    // Variabel untuk mengontrol status thread
    volatile boolean running = true;
    // Objek thread
    Thread thread;

    // Metode yang dipanggil saat panel ditambahkan ke kontainer
    @Override
    public void addNotify() {
        // Memanggil metode addNotify dari kelas induk (JPanel)
        super.addNotify(); 
        // Membuat dan menjalankan thread saat panel ditambahkan ke frame
        thread = new Thread(this);
        thread.start();
    }

    // Metode untuk memperbarui koordinat objek
    public void update() {
        // Mengubah koordinat objek agar bergerak
        xo += 2;
        yo += 2;
    }

    // Metode untuk menggambar objek pada panel
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2d = (Graphics2D) g;
        // Mengatur warna dan menggambar oval sebagai objek
        g2d.setColor(Color.red);
        g2d.fillOval(xo, yo, 80, 80);
        // Menambahkan teks "informatika" di sekitar objek
        g2d.drawString("informatika", xo, yo);
        g2d.dispose();
    }

    // Metode untuk memberikan jeda pada thread
    private void delay(long l) {
        try {
            // Memberikan jeda pada eksekusi thread selama waktu tertentu
            Thread.sleep(l);
        } catch (InterruptedException ex) {
            // Menangani pengecualian jika terjadi gangguan pada thread
            Logger.getLogger(ProgramThread01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Metode yang dijalankan oleh thread
    @Override
    public void run() {
        while (running) {
            // Memperbarui koordinat, menggambar ulang, dan memberikan jeda
            update();
            repaint();
            delay(100);
        }
    }
}
