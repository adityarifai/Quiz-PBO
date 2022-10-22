import java.util.Scanner;
import java.text.DecimalFormat;

public class Penggajian {
    String nik, nama, bagian;
    double gaji_pokok;
    
    double getGajiPokok() {
        if(bagian == "Keuangan") {
            gaji_pokok = 4900000;
        }else if(bagian == "Produksi") {
            gaji_pokok = 4500000;
        }else {
            gaji_pokok = 4000000;
        }
        return gaji_pokok;
    }
    void cetak(){
        DecimalFormat df = new DecimalFormat("##0,000");
        
        System.out.println();
        System.out.println("------- Detil Karyawan -------");
        System.out.println("NIK: "+ this.nik);
        System.out.println("Nama: "+ this.nama);
        System.out.println("Bagian: "+ this.bagian);
        System.out.println("Gaji Pokok: "+ df.format(getGajiPokok()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Penggajian p = new Penggajian();

        System.out.print("Nomor Induk Karyawan: ");
        p.nik = sc.next();
        System.out.print("Nama: ");
        p.nama = sc.next();
        System.out.print("Bagian: ");
        p.bagian = sc.next();

        p.cetak();
    }
}
