import java.util.Scanner;
public class Dowhilecuti17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner (System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.println("Jatah Cuti: ");
        jatahCuti = input17.nextInt();

        do {
            System.out.println("Apakah Anda ingin mengambil cuti (y/t) ?");
            konfirmasi = input17.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Jumlah hari: ");
                jumlahHari = input17.nextInt();
                if (jumlahHari<= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti>0);

    }
}