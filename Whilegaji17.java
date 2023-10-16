import java.util.Scanner;
public class Whilegaji17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totalGajiLembur=0;
        String jabatan;
        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan=input17.nextInt();
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan=input17.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input17.nextInt();
            i++;
            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur +=gajiLembur;
        }
        System.out.println("Total gaji lembur : " + totalGajiLembur);
        
    }
}