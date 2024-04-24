package no7;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProgramWindow01 {
    public static void main(String[] args) {
        // Membuat objek JFrame dengan judul "Ini judul window"
        JFrame jf = new JFrame("Ini judul window");
        
        // Membuat objek Mypanel, yang merupakan panel untuk digunakan dalam JFrame
        Mypanel panel = new Mypanel();
        // Menambahkan panel ke konten utama JFrame
        jf.getContentPane().add(panel);
        
        // Mengatur ukuran JFrame menjadi 500x400 piksel
        jf.setSize(500,400);
        // Menempatkan JFrame di tengah layar
        jf.setLocationRelativeTo(null);
        // Mengatur operasi penutupan default menjadi keluar dari aplikasi saat tombol close ditekan
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Menampilkan JFrame ke layar
        jf.setVisible(true);
    }
}
