import java.util.Scanner;
public class Pemilihan2percobaan117 {
    public static void main(String[] args) {
            Scanner input17 = new Scanner(System.in);
            int tahun;
            System.out.println("Masukkan tahun : ");
            tahun = input17.nextInt();

            if ((tahun % 4) == 0) {
                if ((tahun % 100) != 0)
                 System.out.println(" Tahun Kabisat");
                    
                }else
                System.out.println(" Bukan Tahun Kabisat");
                
            }
    }
