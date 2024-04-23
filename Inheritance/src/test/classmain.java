
package test;

import paket1.Buku;
import paket2.Hewan;
import paket3.Laptop;
import paket4.Profesi;
import paket5.Motor;
import paket6.Mobil;
import paket9.bangunan;

public class classmain {
    public static void main(String[] args) {
        Buku buku = new Buku();
        buku.show();
        Bukukomik bukuKomik = new Bukukomik("Horor");
        bukuKomik.show();
        String show= bukuKomik.getStringInfoState();
        System.out.println(show);
        Hewan hewan = new Hewan();
        hewan.show();
        HewanBertulangBelakang bertulang = new HewanBertulangBelakang("Sapi");
        bertulang.show1();
        String show1 = bertulang.getStringInfoState();
        System.out.println(show1);
        
        Laptop laptop1 = new Laptop();
        laptop1.show();
        LaptopGaming laptop = new LaptopGaming("ROG");
        laptop.show4();
        String show2 = laptop.getStringInfoState();
        System.out.println(show2);
        
        Profesi profesi = new Profesi();
        profesi.show();
        ProfesiDosen dosen = new ProfesiDosen("Dosen");
        dosen.show();
        String show3 = dosen.getStringInfoState();
        System.out.println(show3);
        
        Motor motor = new Motor();
        motor.show();
        MotorNinja ninja = new MotorNinja("Matic");
        ninja.info4();
        String show4 = ninja.getStringInfoState();
        System.out.println(show4);
        
       
        MobilBMW mobil1 = new MobilBMW("BMW");
        mobil1.info2();
        String show5 = mobil1.getStringInfoState();
        System.out.println(show5);
       
        KendaraanDarat kndr =new KendaraanDarat("Bemtor");
        kndr.show3();
        String show6 = kndr.getStringInfoState();
        System.out.println(show6);
        
        BangunDatarPersegi persegi = new BangunDatarPersegi(12);
        System.out.println("Luas = "+ persegi.hitungLuas());
        persegi.info();
        String show7 = persegi.getStringInfoState();
        System.out.println(show7);
        
        BangunanRumah bangunan1 = new BangunanRumah("Rumah sakit");
        bangunan1.infoBangunan();
        bangunan1.show();
        String show8 = bangunan1.getStringInfoState();
        System.out.println(show8);
        
        SekolahNegeri negeri = new SekolahNegeri("Sdn 028");
        negeri.info6();
        negeri.show();
        String show9 = negeri.getStringInfoState();
        System.out.println(show9);
        
       
    }
    }

