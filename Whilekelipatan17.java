import java.util.Scanner;
public class Whilekelipatan17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner (System.in);
        int kelipatan, total=0, counter=0;
        double rataRata; 
        System.out.println( "Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input17.nextInt();
        int i=1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++;
        } 
        rataRata = (double) total / counter ;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata kelipatan bilangan tersebut adalah " + rataRata);
    }
}