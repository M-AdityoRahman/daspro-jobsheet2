import java.util.Scanner;

public class Uts2341720177 {
    public static void main(String[] args) {
        Scanner input177 = new Scanner(System.in);

        System.out.println("UTS PRAKTIKUM DASAR PEMROGRAMAN");
        System.out.println("Muhammad Adityo Rahman");
        System.out.println("Kelas/No : 1F/17");
        System.out.println("NIM : 2341720177");
        System.out.println("                                 ");

        int totalHarga = 0;
        int hargaAkhir = 0; 
        int totalhargaMinuman = 0;
        String daftarBarang = "";

        while (true) {
            System.out.print("Jenis barang (minuman/makanan): ");
            String jenisBarang = input177.next();

            System.out.print("Masukkan jumlah minuman: ");
            int totalMinuman = input177.nextInt(); 

            System.out.print("Nama barang: ");
            String namaBarang = input177.next();

            System.out.println("Harga barang");
            int hargaBarang = input177.nextInt();

            daftarBarang += "Nama barang : " + namaBarang + ", Harga " + hargaBarang + "\n";
            totalHarga += hargaBarang;

            System.out.print("Apakah ingin menambah barang lagi? (ya/tidak): ");
            String jawaban = input177.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                if (jenisBarang.equals("minuman")) {
                    totalhargaMinuman += totalMinuman; 
                }
                break;
            }
        }
        if (totalhargaMinuman >= 3) { 
            double diskonMinuman = totalhargaMinuman * 0.05 ;
            totalHarga -= diskonMinuman;
            System.out.println("Harga setelah potongan 5% : " + totalHarga); 
        } else {
            System.out.println("Tidak ada potongan harga.");    
        }
        System.out.print("Apakah ingin membeli kantong plastik? (ya/tidak): ");
        String beliPlastik = input177.next();
        if (beliPlastik.equals("ya")) {
            totalHarga += 200;
        }
        if (totalHarga >= 1000000) {
            double ppn = totalHarga * 0.07;
            hargaAkhir = (int) (totalHarga - ppn);
            System.out.println("Diskon 7% untuk total harga di atas 1.000.000: Rp. " + ppn);
        } else {
            hargaAkhir = totalHarga; 
        }
        System.out.println("Daftar Barang yang Dibeli:\n" + daftarBarang);
        System.out.println("Total harga yang harus dibayar: Rp. " + hargaAkhir); 
    }
}
