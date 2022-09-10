import bangundatar1.BangunDatar;
import bangunruang1.BangunRuang;

public class Mainclass {

    public static void main(String[] args) {
        
        System.out.println("Bangun Datar : \n");
        bangundatar1.Lingkaran lingkaran = new bangundatar1.Lingkaran(5);
        System.out.println("Lingkaran :");
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.printInfo();
        
        bangundatar1.Persegi persegi = new bangundatar1.Persegi(10);
        System.out.println("\nPersegi :");
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.printInfo();
        
        bangundatar1.PersegiPanjang persegipan = new bangundatar1.PersegiPanjang(5, 10);
        System.out.println("\nPersegi Panjang :");
        persegipan.hitungLuas();
        persegipan.hitungKeliling();
        persegipan.printInfo();
        
        System.out.println("\nBangun Ruang : \n");
        bangunruang1.Balok balok = new bangunruang1.Balok(5, 4, 3);
        System.out.println("Balok : ");
        balok.hitungLuas();
        balok.hitungKeliling();
        balok.hitungVolume();
        balok.printInfo();
        
        bangunruang1.Bola bola = new bangunruang1.Bola(4);
        System.out.println("\nBola : ");
        bola.hitungLuas();
        bola.hitungKeliling();
        bola.printInfo();
        
        bangunruang1.Kubus kubus = new bangunruang1.Kubus(5);
        System.out.println("\n Kubus : ");
        kubus.hitungLuas();
        kubus.hitungKeliling();
        kubus.hitungVolume();
        kubus.printInfo();
    }
}