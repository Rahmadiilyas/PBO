
package praktikum4;

public class no7 {
    // Superclass Jurusan
class Jurusan {
    private String nama;

    public Jurusan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void deskripsi() {
        System.out.println("Jurusan " + nama);
    }
}


// Superclass BangunDatar
class BangunDatar {
    // Method umum untuk menghitung luas
    public double hitungLuas() {
        return 0; // Default, akan diimplementasikan ulang di subclass
    }

    // Method umum untuk menghitung keliling
    public double hitungKeliling() {
        return 0; // Default, akan diimplementasikan ulang di subclass
    }
}

//superclass kendaraan
class kendaraan {
    private String nama;

    kendaraan(String nama) {
        this.nama = nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void show() {
        System.out.println("jenis kendaraan : " + nama);
    }
}


//superclass hewan
class Hewan {
    String jenis;

    public Hewan(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}
//superclass buah
public class Buah {
    private String nama;
    private String warna;

    // Constructor
    public Buah(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    // Overloading constructor
    public Buah(String nama) {
        this.nama = nama;
        this.warna = "Tidak diketahui"; // Default warna
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getWarna() {
        return warna;
    }


    public void setWarna(String warna) {
        this.warna = warna;
    }
}
public class Planet {
    private String nama;
    private double massa;

    // Constructor
    public Planet(String nama, double massa) {
        this.nama = nama;
        this.massa = massa;
    }

    // Overloading constructor
    public Planet(String nama) {
        this.nama = nama;
        this.massa = 0; // Default massa
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }
}
public class Bintang {
    private String nama;
    private double massa;

    // Constructor
    public Bintang(String nama, double massa) {
        this.nama = nama;
        this.massa = massa;
    }


    public Bintang(String nama) {
        this.nama = nama;
        this.massa = 0; // Default massa
    }

    public String getNama() {
        return nama;
    }

 
    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getMassa() {
        return massa;
    }


    public void setMassa(double massa) {
        this.massa = massa;
    }
}
public class Makanan {
    private String nama;
    private double berat;

    // Constructor
    public Makanan(String nama, double berat) {
        this.nama = nama;
        this.berat = berat;
    }

    // Overloading constructor
    public Makanan(String nama) {
        this.nama = nama;
        this.berat = 0; // Default berat
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
}
public class Buku {
    private String judul;
    private String pengarang;

    // Constructor
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    // Overloading constructor
    public Buku(String judul) {
        this.judul = judul;
        this.pengarang = "Tidak Diketahui"; // Default pengarang
    }

    public String getJudul() {
        return judul;
    }

 
    public void setJudul(String judul) {
        this.judul = judul;
    }


    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}
public class Pegawai {
    private String nama;
    private String nomorInduk;

    // Constructor
    public Pegawai(String nama, String nomorInduk) {
        this.nama = nama;
        this.nomorInduk = nomorInduk;
    }

    // Overloading constructor
    public Pegawai(String nama) {
        this.nama = nama;
        this.nomorInduk = "Tidak Diketahui"; // Default nomor induk
    }

  
    public String getNama() {
        return nama;
    }

  
    public void setNama(String nama) {
        this.nama = nama;
    }

   
    public String getNomorInduk() {
        return nomorInduk;
    }

   
    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }
}

}

