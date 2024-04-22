
package test;

import paket1.Buku;

public class classmain {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku = new Buku();
        
        // Memanggil method dari superclass Buku
        buku.show();
        
        // Membuat objek Bukukomik
        Bukukomik bukuKomik = new Bukukomik("Horor");
        
        // Memanggil method dari subclass Bukukomik
        bukuKomik.show();
        
        // Memanggil method dari interface MyInterface
        String info = bukuKomik.getStringInfoState();
        System.out.println("Info State: " + info);
    }
    }

