package fosalgo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import no7.ProgramThread01; // Import kelas ProgramThread01 dari paket no7

// Deklarasi kelas yourpanel yang merupakan turunan dari JPanel
public class yourpanel extends JPanel {
    // Deklarasi variabel untuk koordinat awal objek
    int xo = 100, yo = 40;

    // Metode untuk memperbarui koordinat objek
    public void update() {
        xo += 2;
        yo += 2;
    }

    // Metode untuk menggambar objek pada panel
    public void paint(Graphics g) {
        super.paint(g); // Memanggil metode paint dari kelas induk (JPanel)
        Graphics2D g2d = (Graphics2D) g; // Mencasting objek Graphics ke Graphics2D
        g2d.setColor(Color.red); // Mengatur warna objek menjadi merah
        g2d.fillOval(xo, yo, 80, 80); // Menggambar oval dengan warna merah pada koordinat (xo, yo)
        g2d.drawString("informatika", xo, yo); // Menampilkan teks "informatika" pada koordinat (xo, yo)
        g2d.dispose(); // Membersihkan sumber daya grafis
    }

    // Metode untuk memberikan jeda pada thread
    public void delay(long l) {
        try {
            Thread.sleep(l); // Memberikan jeda pada eksekusi thread selama waktu tertentu
        } catch (InterruptedException ex) {
            // Menangani pengecualian jika terjadi gangguan pada thread
            Logger.getLogger(ProgramThread01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
