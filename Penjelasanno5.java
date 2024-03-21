package praktikum3;

import java.util.HashMap;

public class no5 {
    public static void main(String[] args) {
        // Membuat objek HashMap untuk menyimpan data NIM dan nama mahasiswa
        HashMap<String, String> mahasiswa = new HashMap<>();

        // Menambahkan data NIM dan nama ke dalam HashMap
        mahasiswa.put("D0223309", "Rahmadi");
        mahasiswa.put("D0223310", "Budi");
        mahasiswa.put("D0223311", "Bako");
        mahasiswa.put("D0223312", "Bolong");
        mahasiswa.put("D0223313", "Boroa");
        mahasiswa.put("D0223314", "Boko");
        mahasiswa.put("D0223315", "Cicak");
        mahasiswa.put("D0223316", "Cicci");
        mahasiswa.put("D0223317", "Kaco");
        mahasiswa.put("D0223318", "sitti");

        // Mencetak data NIM dan nama mahasiswa
        System.out.println("Data NIM dan Nama :");
        System.out.println(mahasiswa);
        
        // Mencetak data NIM
        System.out.println("Data Nim :");
        System.out.println(mahasiswa.keySet());
        
        // Mencetak data nama mahasiswa
        System.out.println("Data Nama:");
        System.out.println(mahasiswa.values());
    }
}
