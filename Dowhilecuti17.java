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
                do {
                    System.out.println("Jumlah hari; ");
                    jumlahHari = input17.nextInt();

                    if (jumlahHari <= jatahCuti) {
                        jatahCuti -=jumlahHari;
                        System.out.println("Sisa jatah cuti : " + jatahCuti);
                        break;
                    }else {
                        System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    }
                    
                } while (jatahCuti > 0);
            }    
        }while (jatahCuti > 0);    
    }
}
